package com.ganaderia.ganaderia.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
// import com.ganaderia.ganaderia.interfaces.service.IEvaluacionCaracterizacionService;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionHorroService;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionNovilloService;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionTerneraService;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionToroService;
import com.ganaderia.ganaderia.model.EvaluacionAnimales;
import com.ganaderia.ganaderia.model.EvaluacionHorro;
import com.ganaderia.ganaderia.model.EvaluacionNovillo;
import com.ganaderia.ganaderia.model.EvaluacionTernera;
import com.ganaderia.ganaderia.model.EvaluacionToro;

@Controller
@RequestMapping
public class EvaluacionAnimalesController {

	@Autowired
	private IEvaluacionAnimalesService serviceAnimales;
	
	@Autowired
	private IEvaluacionNovilloService novilloService;

	@Autowired
	private IEvaluacionTerneraService terneraService;

	@Autowired
	private IEvaluacionHorroService horroService;

	@Autowired
	private IEvaluacionToroService toroService;
	
	// @Autowired
	// private IEvaluacionCaracterizacionService caracterizacionService;
	
	@GetMapping("/evaluacion/animales/list/{codFinca}/{codEc}")
	public String evaluacion(Model model, @PathVariable String codFinca, @PathVariable String codEc) {
		serviceAnimales.setCodEc((codEc));
		serviceAnimales.setCodFinca((codFinca));
		List<EvaluacionAnimales> evanlist = serviceAnimales.listaEvaluacionAnimales(codEc);
	
		model.addAttribute("evan", new EvaluacionAnimales());
		model.addAttribute("evanlist", evanlist);
		model.addAttribute("numeroAnimales", serviceAnimales.numeroAnimales(codEc));
		model.addAttribute("codEc", serviceAnimales.getCodEc());
		model.addAttribute("codFinca", serviceAnimales.getCodFinca());
		return "redirect:/evaluacion/animales/list";
	}

	@GetMapping("/evaluacion/animales/list")
	public String resultadosVista(Model model) {
		model.addAttribute("evan", new EvaluacionAnimales());
		model.addAttribute("codEc", serviceAnimales.getCodEc());
		model.addAttribute("codFinca", serviceAnimales.getCodFinca());
		model.addAttribute("numeroAnimales", serviceAnimales.numeroAnimales(""+serviceAnimales.getCodEc()));
		model.addAttribute("evanlist", serviceAnimales.listaEvaluacionAnimales(""+serviceAnimales.getCodEc()));
		return "evaluacion-animales";
	}
	
	@GetMapping("/evaluacion/animales/vaca/nuevo/{codEc}")
	public String agregarVaca(Model model, @PathVariable String codEc) {
		serviceAnimales.setCodEc(codEc);
		return "redirect:/evaluacion/animales/vaca/nuevo";
	}

	@GetMapping("/evaluacion/animales/vaca/nuevo")
	public String agregarVaca(Model model) {
		
//		EvaluacionCaracterizacion ec = caracterizacionService.getec(serviceAnimales.getCodEc());
//		int vacas =   Integer.parseInt(ec.getEcQ03());
//		int novillos = Integer.parseInt(ec.getEcQ03());
//		int terneros = Integer.parseInt(ec.getEcQ03());
//		int horros = Integer.parseInt(ec.getEcQ03());
//		int toros = Integer.parseInt(ec.getEcQ03());
//
//		int total = vacas + terneros + novillos + terneros + horros + toros;
//		System.out.println("total "+ total);
		System.out.println("serviceAnimales.getCodEc()_"+ serviceAnimales.getCodEc());
		ArrayList<EvaluacionAnimales> evanlist = (ArrayList<EvaluacionAnimales>) serviceAnimales.listaEvaluacionAnimales(serviceAnimales.getCodEc());
		
		int numeroAnimales = Integer.parseInt(serviceAnimales.numeroAnimales(String.valueOf(serviceAnimales.getCodEc())));
		List<EvaluacionAnimales> aux = new ArrayList<EvaluacionAnimales>();

		for (int i = 0; i < numeroAnimales - evanlist.size(); i++) {
			aux.add(new EvaluacionAnimales(serviceAnimales.getCodEc()));
		}

		for (Iterator<EvaluacionAnimales> iterator = aux.iterator(); iterator.hasNext();) {
			EvaluacionAnimales evaluacionAnimales = (EvaluacionAnimales) iterator.next();
			evanlist.add(evaluacionAnimales);
		}

		model.addAttribute("evan", new EvaluacionAnimales());
		model.addAttribute("codEc", serviceAnimales.getCodEc());
		model.addAttribute("codEvAn", serviceAnimales.getCodEvAn());
		model.addAttribute("codFinca", serviceAnimales.getCodFinca());
		model.addAttribute("numeroAnimales", numeroAnimales);
		model.addAttribute("evanlist", evanlist);

		return "evaluacion-animales-vaca";

	}
	@PostMapping("evaluacion/animales/vaca/guardar")
	public String saveVaca(@Validated EvaluacionAnimales evan, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "redirect:/evaluacion/animales/vaca/nuevo/"+ evan.getCodEc();
		}
		EvaluacionAnimales animales = (EvaluacionAnimales) model.getAttribute("evaluacionAnimales");
		
		System.out.println(animales);
		
		if (evan.getCodEvAn() == 0) {
			serviceAnimales.save(evan);
		}else {
			serviceAnimales.update(evan);			
		}

		return "redirect:/evaluacion/animales/vaca/nuevo";
	}
	
	@GetMapping("/evaluacion/animales/novillo/nuevo/{codEc}")
	public String agregarNovillo(Model model, @PathVariable String codEc) {
		serviceAnimales.setCodEc(codEc);
		return "redirect:/evaluacion/animales/novillo/nuevo";
	}

	@GetMapping("/evaluacion/animales/novillo/nuevo")
	public String agregarNovillo(Model model) {
		
		ArrayList<EvaluacionNovillo> evanlist = (ArrayList<EvaluacionNovillo>) serviceAnimales.listaNovillos(serviceAnimales.getCodEc());

		int numeroAnimales = Integer.parseInt(serviceAnimales.numeroAnimales(String.valueOf(serviceAnimales.getCodEc())));
		List<EvaluacionNovillo> aux = new ArrayList<EvaluacionNovillo>();

		for (int i = 0; i < numeroAnimales - evanlist.size(); i++) {
			aux.add(new EvaluacionNovillo(serviceAnimales.getCodEc()));
		}

		for (Iterator<EvaluacionNovillo> iterator = aux.iterator(); iterator.hasNext();) {
			EvaluacionNovillo evaluacionAnimales = (EvaluacionNovillo) iterator.next();
			evanlist.add(evaluacionAnimales);
		}

		model.addAttribute("evan", new EvaluacionAnimales());
		model.addAttribute("codEc", serviceAnimales.getCodEc());
		model.addAttribute("codEvAn", serviceAnimales.getCodEvAn());
		model.addAttribute("codFinca", serviceAnimales.getCodFinca());
		model.addAttribute("numeroAnimales", numeroAnimales);
		model.addAttribute("evanlist", evanlist);

		return "evaluacion-animales-novillo";

	}
	@PostMapping("evaluacion/animales/novillo/guardar")
	public String saveNovillo(@Validated EvaluacionNovillo evan, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "redirect:/evaluacion/animales/novillo/nuevo/"+ evan.getCodEc();
		}
		EvaluacionAnimales animales = (EvaluacionAnimales) model.getAttribute("evaluacionAnimales");
		
		System.out.println(animales);
		
		int i = novilloService.save(evan);
		serviceAnimales.setnovillo(String.valueOf(i));

		return "redirect:/evaluacion/animales/novillo/nuevo";
	}
	
	@GetMapping("/evaluacion/animales/ternera/nuevo/{codEc}")
	public String agregarTernera(Model model, @PathVariable String codEc) {
		serviceAnimales.setCodEc(codEc);
		return "redirect:/evaluacion/animales/ternera/nuevo";
	}

	@GetMapping("/evaluacion/animales/ternera/nuevo")
	public String agregarTernera(Model model) {
		
		ArrayList<EvaluacionTernera> list = (ArrayList<EvaluacionTernera>) serviceAnimales.listaTerneras(serviceAnimales.getCodEc());

		int numeroAnimales = Integer.parseInt(serviceAnimales.numeroAnimales(String.valueOf(serviceAnimales.getCodEc())));
		List<EvaluacionTernera> aux = new ArrayList<EvaluacionTernera>();

		for (int i = 0; i < numeroAnimales - list.size(); i++) {
			aux.add(new EvaluacionTernera(serviceAnimales.getCodEc()));
		}

		for (Iterator<EvaluacionTernera> iterator = aux.iterator(); iterator.hasNext();) {
			EvaluacionTernera evaluacionAnimales = (EvaluacionTernera) iterator.next();
			list.add(evaluacionAnimales);
		}

		model.addAttribute("evan", new EvaluacionAnimales());
		model.addAttribute("codEc", serviceAnimales.getCodEc());
		model.addAttribute("codEvAn", serviceAnimales.getCodEvAn());
		model.addAttribute("codFinca", serviceAnimales.getCodFinca());
		model.addAttribute("numeroAnimales", numeroAnimales);
		model.addAttribute("evanlist", list);

		return "evaluacion-animales-ternera";

	}
	@PostMapping("/evaluacion/animales/ternera/guardar")
	public String saveTernera(@Validated EvaluacionTernera evan, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "redirect:/evaluacion/animales/ternera/nuevo/"+ evan.getCodEc();
		}
		EvaluacionAnimales animales = (EvaluacionAnimales) model.getAttribute("evaluacionAnimales");
		
		System.out.println(animales);
		
		int i = terneraService.save(evan);
		serviceAnimales.setnovillo(String.valueOf(i));

		return "redirect:/evaluacion/animales/ternera/nuevo";
	}
	
	
	@GetMapping("/evaluacion/animales/horro/nuevo/{codEc}")
	public String agregarHorro(Model model, @PathVariable String codEc) {
		serviceAnimales.setCodEc(codEc);
		return "redirect:/evaluacion/animales/horro/nuevo";
	}

	@GetMapping("/evaluacion/animales/horro/nuevo")
	public String agregarHorro(Model model) {
		
		ArrayList<EvaluacionHorro> list = (ArrayList<EvaluacionHorro>) serviceAnimales.listaHorros(serviceAnimales.getCodEc());

		int numeroAnimales = Integer.parseInt(serviceAnimales.numeroAnimales(String.valueOf(serviceAnimales.getCodEc())));
		List<EvaluacionHorro> aux = new ArrayList<EvaluacionHorro>();

		for (int i = 0; i < numeroAnimales - list.size(); i++) {
			aux.add(new EvaluacionHorro(serviceAnimales.getCodEc()));
		}

		for (Iterator<EvaluacionHorro> iterator = aux.iterator(); iterator.hasNext();) {
			EvaluacionHorro evaluacionAnimales = (EvaluacionHorro) iterator.next();
			list.add(evaluacionAnimales);
		}

		model.addAttribute("evan", new EvaluacionAnimales());
		model.addAttribute("codEc", serviceAnimales.getCodEc());
		model.addAttribute("codEvAn", serviceAnimales.getCodEvAn());
		model.addAttribute("codFinca", serviceAnimales.getCodFinca());
		model.addAttribute("numeroAnimales", numeroAnimales);
		model.addAttribute("evanlist", list);

		return "evaluacion-animales-horro";

	}
	@PostMapping("/evaluacion/animales/horro/guardar")
	public String saveHorro(@Validated EvaluacionHorro evan, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "redirect:/evaluacion/animales/horro/nuevo/"+ evan.getCodEc();
		}
		EvaluacionAnimales animales = (EvaluacionAnimales) model.getAttribute("evaluacionAnimales");
		
		System.out.println(animales);
		
		int i = horroService.save(evan);
//		serviceAnimales.setnovillo(String.valueOf(i));

		return "redirect:/evaluacion/animales/horro/nuevo";
	}

	
	@GetMapping("/evaluacion/animales/toro/nuevo/{codEc}")
	public String agregarToro(Model model, @PathVariable String codEc) {
		serviceAnimales.setCodEc(codEc);
		return "redirect:/evaluacion/animales/toro/nuevo";
	}

	@GetMapping("/evaluacion/animales/toro/nuevo")
	public String agregarToro(Model model) {
		
		ArrayList<EvaluacionToro> list = (ArrayList<EvaluacionToro>) serviceAnimales.listaToros(serviceAnimales.getCodEc());

		int numeroAnimales = Integer.parseInt(serviceAnimales.numeroAnimales(String.valueOf(serviceAnimales.getCodEc())));
		List<EvaluacionToro> aux = new ArrayList<EvaluacionToro>();

		for (int i = 0; i < numeroAnimales - list.size(); i++) {
			aux.add(new EvaluacionToro(serviceAnimales.getCodEc()));
		}

		for (Iterator<EvaluacionToro> iterator = aux.iterator(); iterator.hasNext();) {
			EvaluacionToro evaluacionAnimales = (EvaluacionToro) iterator.next();
			list.add(evaluacionAnimales);
		}

		model.addAttribute("evan", new EvaluacionAnimales());
		model.addAttribute("codEc", serviceAnimales.getCodEc());
		model.addAttribute("codEvAn", serviceAnimales.getCodEvAn());
		model.addAttribute("codFinca", serviceAnimales.getCodFinca());
		model.addAttribute("numeroAnimales", numeroAnimales);
		model.addAttribute("evanlist", list);

		return "evaluacion-animales-toro";
	}
	
	@PostMapping("/evaluacion/animales/toro/guardar")
	public String saveToro(@Validated EvaluacionToro evan, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "redirect:/evaluacion/animales/toro/nuevo/"+ evan.getCodEc();
		}
//		EvaluacionAnimales animales = (EvaluacionAnimales) model.getAttribute("evaluacionAnimales");
				
		int i = toroService.save(evan);
//		serviceAnimales.setnovillo(String.valueOf(i));

		return "redirect:/evaluacion/animales/toro/nuevo";
	}


	@GetMapping("/evaluacion/animales/edit/{id}")
	public String showUpdateForm(@PathVariable("id") int codEvAn, Model model) {
		EvaluacionAnimales evan = serviceAnimales.getEvaluacionAnimales((""+codEvAn));
		System.out.println(evan);
		model.addAttribute("evan", evan);
		model.addAttribute("codEc", serviceAnimales.getCodEc());
		model.addAttribute("codFinca", serviceAnimales.getCodFinca());
		return "evaluacion-animales-update";
	}

	@PostMapping("/evaluacion/animales/update/{id}")
	public String updateForm(@PathVariable("id") int codEvAn, @Validated EvaluacionAnimales evan, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return "redirect:/evaluacion/animales/update/" + codEvAn;
		}
		evan.setCodEvAn((codEvAn));
		EvaluacionAnimales animal = serviceAnimales.update(evan);
		System.out.println(animal);
		model.addAttribute("evan", new EvaluacionAnimales());
		model.addAttribute("codEc", serviceAnimales.getCodEc());
		model.addAttribute("codFinca", serviceAnimales.getCodFinca());
		model.addAttribute("mensaje", null);
		model.addAttribute("numeroAnimales", serviceAnimales.numeroAnimales(""+evan.getCodEc()));
		model.addAttribute("evanlist", serviceAnimales.listaEvaluacionAnimales(""+evan.getCodEc()));

		return "evaluacion-animales";
	}
}
