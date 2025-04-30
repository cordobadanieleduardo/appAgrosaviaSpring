package com.ganaderia.ganaderia.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ganaderia.ganaderia.interfaces.service.IEvaluacionCaracterizacionService;
import com.ganaderia.ganaderia.interfaces.service.IFincaService;
import com.ganaderia.ganaderia.interfaces.service.IUsuarioService;
import com.ganaderia.ganaderia.model.EvaluacionCaracterizacion;

@Controller
@RequestMapping("/evaluacion")
public class EvaluacionCaracterizacionController {
	
	@Autowired
	private IUsuarioService service;
	@Autowired
	private IEvaluacionCaracterizacionService caracterizacionService;
	@Autowired
	private IFincaService serviceFinca;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		// if(service.getUsuario() == null) {
		// 	return "index";
		// }
		// List<EvaluacionCaracterizacion> evaluacarac = caracterizacionService.listar(String.valueOf(service.getUsuario().getIdentificacion()));
		List<EvaluacionCaracterizacion> evaluacarac = caracterizacionService.listarAll();
		model.addAttribute("evaluacarac", evaluacarac);
		return "evaluacion-consultar";
	}
	
	@GetMapping("/volver")
	public String volver(Model model) {
		// if(service.getUsuario() == null) {
		// 	return "index";
		// }
		model.addAttribute("evaluacionNuevo", new EvaluacionCaracterizacion());
		// model.addAttribute("fincas", serviceFinca.listar(""+service.getUsuario().getIdentificacion()));
		model.addAttribute("fincas", serviceFinca.listarAll());
		return "evaluacion-nuevo";
	}
	
	@GetMapping("/nuevo")
	public String agregar(Model model) {
		// if(service.getUsuario() == null) {
		// 	return "index";
		// }
		model.addAttribute("evaluacionNuevo", new EvaluacionCaracterizacion());
		// model.addAttribute("fincas", serviceFinca.listar(""+service.getUsuario().getIdentificacion()));
		model.addAttribute("fincas", serviceFinca.listarAll());
		return "evaluacion-nuevo";
	}
	
	@PostMapping("/guardar")
	public String save(@Validated EvaluacionCaracterizacion ec, Model m) {
		// if(service.getUsuario() == null) {
		// 	return "index";
		// }
		
		String codFinca = caracterizacionService.buscarFinca(ec.getEcFinca());
		
		ec.setCodFinca(codFinca);
		// ec.setIdentificacion(String.valueOf(service.getUsuario().getIdentificacion()));
		ec.setIdentificacion("1");
		int i = caracterizacionService.save(ec);
		return "redirect:/evaluacion/libertad1-vaca/" + i;
	}	
}
