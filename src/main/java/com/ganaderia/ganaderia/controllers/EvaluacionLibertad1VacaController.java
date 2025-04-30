package com.ganaderia.ganaderia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.ganaderia.ganaderia.interfaces.service.IEvaluacionVacaService;
import com.ganaderia.ganaderia.interfaces.service.IUsuarioService;
import com.ganaderia.ganaderia.model.EvaluacionVaca;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionAnimalesService;

@Controller
@RequestMapping("/evaluacion/libertad1-vaca")
public class EvaluacionLibertad1VacaController {

	@Autowired
	private IEvaluacionVacaService service;

	@Autowired
	private IEvaluacionAnimalesService serviceAnimales;
	
	@Autowired
	private IUsuarioService serviceUsuario;
	
	@GetMapping("/{codEc}")
	public String agregar(Model model, @PathVariable String codEc) {
//		if(serviceUsuario.getUsuario() == null) {
//			return "index";
//		}
		serviceAnimales.setCodEc(codEc);
		return "redirect:/evaluacion/libertad1-vaca/nuevo";
	}
	
	@GetMapping("/nuevo")
	public String vista(Model model) {
		model.addAttribute("nuevo", new EvaluacionVaca(serviceAnimales.getCodEc()));
		return "evaluacion-libertad1-vaca";
	}
	
	@GetMapping("/volver/{codEc}")
	public String volver(Model model, @PathVariable String codEc) {
		if(serviceUsuario.getUsuario() == null) {
			return "index";
		}
		if(codEc !=null) {
			model.addAttribute("nuevo", service.get(codEc));
			return "evaluacion-libertad1-vaca";
		}		
		return "redirect:/l2/".concat(serviceAnimales.getCodEc());
	}

	@PostMapping("/guardar")
	public String save(@Validated EvaluacionVaca elv, BindingResult result, Model model) {
		if(serviceUsuario.getUsuario() == null) {
			return "index";
		}
		if (result.hasErrors()) {
			return "redirect:/evaluacion/libertad1-vaca/" + elv.getCodEc();
		}

		serviceAnimales.setCodEc((elv.getCodEc()));
		//codigo evalacion vaca
		serviceAnimales.setel1codvaca(String.valueOf(service.save(elv)));

		String l1 = String.valueOf(service.save(elv));
		return "redirect:/evaluacion/libertad2-vaca/".concat(serviceAnimales.getCodEc()).concat("/").concat(l1);
	}
}
