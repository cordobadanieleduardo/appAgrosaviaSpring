package com.ganaderia.ganaderia.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ganaderia.ganaderia.interfaces.service.IEvaluacionAnimalesService;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionCorralesService;
import com.ganaderia.ganaderia.model.EvaluacionCorrales;

@Controller
@RequestMapping
public class EvaluacionCorralesController {

	@Autowired
	private IEvaluacionCorralesService serviceCorrales;

	@Autowired
	private IEvaluacionAnimalesService serviceAnimales;

	@GetMapping("/evaluacion/corrales/list")
	public String resumen(Model model) {
		model.addAttribute("corrales", serviceAnimales.numeroAnimales("" + serviceAnimales.getCodEc()));
		model.addAttribute("mensaje", null);
		model.addAttribute("codEc", serviceAnimales.getCodEc());
		model.addAttribute("codFinca", serviceAnimales.getCodFinca());
		model.addAttribute("list", serviceCorrales.listaEvaluacionCorrales("" + serviceAnimales.getCodEc()));
		return "evaluacion-corrales-list";
	}

	@GetMapping("/evaluacion/corrales/nuevo/{codEc}")
	public String agregarCorral(Model model, @PathVariable("codEc") String codEc) {
		serviceAnimales.setCodEc((codEc));
		return "redirect:/evaluacion/corrales/nuevo";
	}

	@GetMapping("/evaluacion/corrales/nuevo")
	public String FinalizarEvaluacion(Model model) {

		ArrayList<EvaluacionCorrales> evcolist = (ArrayList<EvaluacionCorrales>) serviceCorrales
				.listaEvaluacionCorrales("" + serviceAnimales.getCodEc());

		int numeroCorrales = 5 ;
		try {
			
			 numeroCorrales = Integer.parseInt(serviceCorrales.numCorrales("" + serviceAnimales.getCodEc()));
		} catch (Exception e) {
			System.out.println("error al convertir a un entero");
		}
		ArrayList<EvaluacionCorrales> aux = new ArrayList<EvaluacionCorrales>();

		for (int i = 0; i < numeroCorrales - evcolist.size(); i++) {
			aux.add(new EvaluacionCorrales(serviceAnimales.getCodFinca(), serviceAnimales.getCodEc()));
		}

		for (Iterator<EvaluacionCorrales> iterator = aux.iterator(); iterator.hasNext();) {
			EvaluacionCorrales corrales = (EvaluacionCorrales) iterator.next();
			evcolist.add(corrales);
		}

		ArrayList<EvaluacionCorrales> l = evcolist;
		for (Iterator<EvaluacionCorrales> iterator = l.iterator(); iterator.hasNext();) {
			EvaluacionCorrales type = (EvaluacionCorrales) iterator.next();
			System.out.println(type);
		}
		
		String corrales = serviceCorrales.numCorrales(serviceAnimales.getCodEc()) ;
		model.addAttribute("evco", new EvaluacionCorrales());
		model.addAttribute("evcolist", evcolist);
		model.addAttribute("mensaje", null);
		model.addAttribute("corrales", corrales);
		model.addAttribute("codEc", serviceAnimales.getCodEc());
		model.addAttribute("codEvAn", serviceAnimales.getCodEvAn());
		return "evaluacion-corrales";
	}

	@PostMapping("evaluacion/corrales/guardar")
	public String save(@Validated EvaluacionCorrales evco, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "redirect:/evaluacion/corrales/" + evco.getCodEc();
		}

		evco.setCodEc(serviceAnimales.getCodEc());
		
		if (evco.getId() == 0) {
			serviceCorrales.save(evco);
		} else {
			serviceCorrales.update(evco);
		}

		System.out.println(evco);

		return "redirect:/evaluacion/corrales/nuevo/"+evco.getCodEc();
	}

	@GetMapping("evaluacion/corrales/guardar/{id}")
	public String guardarCorrales(Model model, @PathVariable String id) {
		serviceAnimales.setCodEvAn(Integer.parseInt(id));
		model.addAttribute("mensaje", "Se ha creado correcmente");
		model.addAttribute("codEvAn", id);
		return "redirect:/evaluacion/corrales/guardar/" + id;
	}

	@GetMapping("evaluacion/corrales/edit/{id}")
	public String showUpdateForm(@PathVariable("id") int codEvAn, Model model) {
		serviceAnimales.setCodEvAn((codEvAn));
		model.addAttribute("evco", serviceCorrales.getEvaluacionCorrales(String.valueOf(codEvAn)));
		model.addAttribute("corrales", serviceAnimales.numeroAnimales("" + serviceAnimales.getCodEc()));
		model.addAttribute("codEc", serviceAnimales.getCodEc());
		model.addAttribute("codFinca", serviceAnimales.getCodFinca());
		model.addAttribute("codEvAn", codEvAn);
		model.addAttribute("evan", serviceAnimales.getEvaluacionAnimales(""+codEvAn));
		return "evaluacion-corrales-update";
	}

	@PostMapping("evaluacion/corrales/update/{id}")
	public String actualizar(@PathVariable("id") int codEvAn, @Validated EvaluacionCorrales evco, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return "redirect:/evaluacion/corrales/update/" + codEvAn;
		}
		evco.setCodEc("" + serviceAnimales.getCodEc());
		evco.setCodEvAn(String.valueOf(codEvAn));
		serviceCorrales.save(evco);
		System.out.println("----" + evco);
		return "redirect:/evaluacion/corrales/list";
	}

	@GetMapping("evaluacion/corrales/delete/{id}")
	public String delete(@PathVariable("id") int id, Model model) {
		serviceCorrales.deleteEvaluacionCorrales(id);
		return "redirect:/evaluacion/corrales/list";
	}

}
