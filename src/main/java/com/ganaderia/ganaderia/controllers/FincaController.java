package com.ganaderia.ganaderia.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ganaderia.ganaderia.interfaces.service.IFincaService;
import com.ganaderia.ganaderia.interfaces.service.IUsuarioService;
import com.ganaderia.ganaderia.model.Finca;

@Controller
@RequestMapping("/finca")
public class FincaController {

	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private IFincaService fincaService;

	@GetMapping("/listar")
	public String listar(Model model) {
		if (usuarioService.getUsuario() == null) {
			return "index";
		}
		List<Finca> fincas = fincaService.listar("" + usuarioService.getUsuario().getIdentificacion());
		model.addAttribute("fincas", fincas);
		return "finca-consultar";
	}

	@GetMapping("/nuevo")
	public String agregar(Model model) {
		model.addAttribute("fincaNuevo", new Finca());
		return "finca-nuevo";
	}

	@PostMapping("/guardar")
	public String save(@Validated Finca finca, Model m) {
		if (usuarioService.getUsuario() != null) {
			finca.setIdentificacion(usuarioService.getUsuario().getIdentificacion());
			fincaService.save(finca);
			return "redirect:/finca/listar";
		}
		finca.setIdentificacion(usuarioService.getUsuario().getIdentificacion());
		fincaService.save(finca);
		return "redirect:/finca/listar";
	}

	@GetMapping("/ver")
	public String show(Model model) {
		if (fincaService.getId() == 0) {
			model.addAttribute("finca", new Finca());
		} else {
			model.addAttribute("finca", fincaService.getFinca(fincaService.getId()));
		}
		return "finca";
	}

	@GetMapping("/mostrar/{id}")
	public String mostrarFinca(Model model, @PathVariable("id") int id) {
		fincaService.setId(id);
		return "redirect:/finca/ver";
	}

}
