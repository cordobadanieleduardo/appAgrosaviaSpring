package com.ganaderia.ganaderia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.ganaderia.ganaderia.interfaces.service.IEvaluacionTerneraService;
import com.ganaderia.ganaderia.model.EvaluacionTernera;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionAnimalesService;

@Controller
@RequestMapping("/evaluacion/libertades-ternera")
public class EvaluacionLibertadesTerneraController {

	@Autowired
	private IEvaluacionTerneraService service;

	@Autowired
	private IEvaluacionAnimalesService serviceAnimales;
		
	@GetMapping("/{codEc}")
	public String agregar(Model model, @PathVariable String codEc) {
		serviceAnimales.setCodEc(codEc);
//		serviceAnimales.setTernera(codElternera);
		return "redirect:/evaluacion/libertades-ternera/nuevo";
	}

	@GetMapping("/nuevo")
	public String vista(Model model) {
		model.addAttribute("nuevo", 
				new EvaluacionTernera(serviceAnimales.getCodEc()));
		return "evaluacion-libertades-ternera";
	}

	@PostMapping("/guardar")
	public String save(@Validated EvaluacionTernera elv, BindingResult result, Model model) {

		service.save(elv);

		model.addAttribute("nuevo", elv);
		return "redirect:/evaluacion/libertades-horro/" + elv.getCodEc();
	}
}
