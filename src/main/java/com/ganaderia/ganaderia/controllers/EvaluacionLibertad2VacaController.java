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
@RequestMapping("/evaluacion/libertad2-vaca")
public class EvaluacionLibertad2VacaController {

	@Autowired
	private IEvaluacionVacaService service;

	@Autowired
	private IEvaluacionAnimalesService serviceAnimales;
	
	@Autowired
	private IUsuarioService serviceUsuario;
	
	@GetMapping("/volver/{id}")
	public String volver(Model model, @PathVariable String id) {
		if(serviceUsuario.getUsuario() == null) {
			return "index";
		}
		
		model.addAttribute("nuevo", service.get(serviceAnimales.getel1codvaca()));
		return "evaluacion-libertad1-vaca";
	}
	
	@GetMapping("/{codEc}/{codElvaca}")
	public String agregar(Model model, @PathVariable String codEc, @PathVariable String codElvaca) {
		if(serviceUsuario.getUsuario() == null) {
			return "index";
		}
		serviceAnimales.setCodEc(codEc);
		serviceAnimales.setCodElvaca(codElvaca);
		return "redirect:/evaluacion/libertad2-vaca/nuevo";
	}
	
	@GetMapping("/nuevo")
	public String vista(Model model) {
		model.addAttribute("nuevo", new EvaluacionVaca(serviceAnimales.getCodEc(),Integer.parseInt(serviceAnimales.getCodElvaca())));
		return "evaluacion-libertad2-vaca";
	}
	
	@PostMapping("/guardar")
	public String save(@Validated EvaluacionVaca elv, BindingResult result, Model model) {
		if(serviceUsuario.getUsuario() == null) {
			return "index";
		}
		if (result.hasErrors()) {
			return "redirect:/evaluacion/libertad2-vaca/" + elv.getCodEc().concat("/").concat(String.valueOf(elv.getCodElvaca()));
		}
		EvaluacionVaca aux = serviceAnimales.getEvaluacionVaca(String.valueOf(elv.getCodElvaca()));
		if (aux != null) {
			elv.setEl1Q01(aux.getEl1Q01());
			elv.setEl1Q02(aux.getEl1Q02());
			elv.setEl1Q03(aux.getEl1Q03());
			elv.setEl1Q04(aux.getEl1Q04());
			elv.setEl1Q05(aux.getEl1Q05());
			elv.setEl1Q06(aux.getEl1Q06());
		}
		String l2 = String.valueOf(service.save(elv));

		return "redirect:/evaluacion/libertad3-vaca/".concat(elv.getCodEc()).concat("/").concat(l2);
	}
}
