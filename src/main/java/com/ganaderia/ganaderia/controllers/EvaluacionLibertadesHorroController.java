package com.ganaderia.ganaderia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.ganaderia.ganaderia.interfaces.service.IEvaluacionHorroService;
import com.ganaderia.ganaderia.model.EvaluacionHorro;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionAnimalesService;

@Controller
@RequestMapping("/evaluacion/libertades-horro")
public class EvaluacionLibertadesHorroController {

	@Autowired
	private IEvaluacionHorroService service;

	@Autowired
	private IEvaluacionAnimalesService serviceAnimales;

	@GetMapping("/{codEc}")
	public String agregar(Model model, @PathVariable String codEc) {
		serviceAnimales.setCodEc(codEc);
		return "redirect:/evaluacion/libertades-horro/nuevo";
	}

	@GetMapping("/nuevo")
	public String vista(Model model) {
		model.addAttribute("nuevo", new EvaluacionHorro(serviceAnimales.getCodEc()));
		return "evaluacion-libertades-horro";
	}

	@PostMapping("/guardar")
	public String save(@Validated EvaluacionHorro elv, BindingResult result, Model model) {

		service.save(elv);

		model.addAttribute("nuevo", elv);
		return "redirect:/evaluacion/animales/vaca/nuevo/" + elv.getCodEc();
	}
}
