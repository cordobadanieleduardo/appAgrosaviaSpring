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
@RequestMapping("/evaluacion/libertad3-vaca")
public class EvaluacionLibertad3VacaController {

	@Autowired
	private IEvaluacionVacaService service;

	@Autowired
	private IEvaluacionAnimalesService serviceAnimales;
	
	@Autowired
	private IUsuarioService serviceUsuario;
	
	@GetMapping("/{codEc}/{codElvaca}")
	public String agregar(Model model, @PathVariable String codEc, @PathVariable String codElvaca) {
		if(serviceUsuario.getUsuario() == null) {
			return "index";
		}
		serviceAnimales.setCodEc(codEc);
		serviceAnimales.setCodElvaca(codElvaca);
		return "redirect:/evaluacion/libertad3-vaca/nuevo";
	}
	
	@GetMapping("/nuevo")
	public String vista(Model model) {
		model.addAttribute("nuevo", new EvaluacionVaca(serviceAnimales.getCodEc(),Integer.parseInt(serviceAnimales.getCodElvaca())));
		return "evaluacion-libertad3-vaca";
	}

	@PostMapping("/guardar")
	public String save(@Validated EvaluacionVaca elv, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "redirect:/evaluacion/libertad3-vaca/" + elv.getCodEc();
		}
		EvaluacionVaca aux = serviceAnimales.getEvaluacionVaca(String.valueOf(elv.getCodElvaca()));
		if (aux != null) {
			
			elv.setEl1Q01(aux.getEl1Q01());
			elv.setEl1Q02(aux.getEl1Q02());
			elv.setEl1Q03(aux.getEl1Q03());
			elv.setEl1Q04(aux.getEl1Q04());
			elv.setEl1Q05(aux.getEl1Q05());
			elv.setEl1Q06(aux.getEl1Q06());
			
			elv.setEl2Q01(aux.getEl2Q01());
			elv.setEl2Q02(aux.getEl2Q02());
			elv.setEl2Q03(aux.getEl2Q03());
			elv.setEl2Q04(aux.getEl2Q04());
			elv.setEl2Q05(aux.getEl2Q05());
			elv.setEl2Q06(aux.getEl2Q06());
			elv.setEl2Q07(aux.getEl2Q07());
			elv.setEl2Q08(aux.getEl2Q08());
			elv.setEl2Q09(aux.getEl2Q09());
			elv.setEl2Q10(aux.getEl2Q10());
			elv.setEl2Q11(aux.getEl2Q11());
			elv.setEl2Q12(aux.getEl2Q12());
			elv.setEl2Q13(aux.getEl2Q13());
			elv.setEl2Q14(aux.getEl2Q14());
			elv.setEl2Q15(aux.getEl2Q15());
			elv.setEl2Q16(aux.getEl2Q16());
			elv.setEl2Q17(aux.getEl2Q17());
		}
		serviceAnimales.setCodEc((elv.getCodEc()));
		elv.setCodElvaca(elv.getCodElvaca());
		String l3 = String.valueOf(service.save(elv));

		return "redirect:/evaluacion/libertad4-vaca/".concat(serviceAnimales.getCodEc()).concat("/").concat(l3);

	}
}
