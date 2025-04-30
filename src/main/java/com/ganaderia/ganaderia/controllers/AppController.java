
package com.ganaderia.ganaderia.controllers;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ganaderia.ganaderia.interfaces.service.IEvaluacionAnimalesService;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionCorralesService;
import com.ganaderia.ganaderia.interfaces.service.IUsuarioService;
import com.ganaderia.ganaderia.model.EvaluacionAnimales;
import com.ganaderia.ganaderia.model.EvaluacionCorrales;
import com.ganaderia.ganaderia.model.Usuario;

@RequestMapping
@Controller
public class AppController {

	@Autowired
	private IUsuarioService service;

	@Autowired
	private IEvaluacionAnimalesService serviceAnimales;

	@Autowired
	private IEvaluacionCorralesService serviceCorrales;

	@GetMapping("/")
	public String inicio() {
		return "index";
	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@GetMapping("/inicio-contenido")
	public String inicioContenido() {
		if (service.getUsuario()!= null ) {
			return "contenido";
		}
		return inicio();
		// return "contenido";
	}


	@PostMapping("/validar")
	public String validar(Model model, @Validated Usuario u) {
		boolean valido = service.validarUsuario(u.getCorreo(), u.getContrasena());
		if (valido) {
			u = service.getIdentificacion(u.getCorreo(), u.getContrasena());
			service.setUsuario(u);
			return "redirect:/inicio-contenido";
		}
		return "index";
	}

	@GetMapping("/logout")
	public String salir(Model model) {
		service.setUsuario(null);
		return "index";
	}
	@GetMapping("/usuario/nuevo")
	public String agregar(Model model) {
		model.addAttribute("usuarioNuevo", new Usuario());
		return "usuario-nuevo";
	}

	@PostMapping("/usuario/guardar")
	public String save(@Validated Usuario u, Model model) {
		if (u.getCorreo().isEmpty()) {
			return "redirect:/usuario/nuevo";
		} else if (!String.valueOf(u.getIdentificacion()).isEmpty() && !(u.getApellido()).isEmpty()
				&& !(u.getCorreo()).isEmpty() && !(u.getNombre()).isEmpty() && !(u.getCorreo()).isEmpty()) {
			service.save(u);
		}
		return "redirect:/usuario/registrado";
	}

	@GetMapping("/usuario/registrado")
	public String registrado(Model model){
		model.addAttribute("usuario", new Usuario());
		return "usuario-registrado";
	}


	@GetMapping("/evaluacion-corrales")
	public String evaluacionCorrales() {
		return "evaluacion-corrales";
	}

	private double l1 = 10;
	private double l2 = 10;
	private double l3 = 10;
	private double l4 = 8;
	private double l5 = 10;

	@GetMapping("/resultados")
	public String resultados(Model model) {
		
		if (service.getUsuario() == null ) {
			return "contenido";
		}
		List<EvaluacionAnimales> evanlist = serviceAnimales.listaEvaluacionAnimales(serviceAnimales.getCodEc());
		List<EvaluacionCorrales> evcolist = serviceCorrales.listaEvaluacionCorrales(serviceAnimales.getCodEc());

		double ponderadoevanl1q01Rta = 0;
		double ponderadoevanl1q02Rta = 0;
		double ponderadoevanl2q01Rta = 0;
		double ponderadoevanl3q01Rta = 0;
		double ponderadoevanl3q02Rta = 0;
		double ponderadoevanl3q03Rta = 0;
		double ponderadoevanl3q04Rta = 0;
		double ponderadoevanl3q05Rta = 0;
		double ponderadoevanl3q06Rta = 0;
		double ponderadoevanl3q07Rta = 0;
		double ponderadoevanl3q08Rta = 0;
		double ponderadoevanl3q09Rta = 0;
		double ponderadoevanl3q10Rta = 0;
		double ponderadoevanl3q11Rta = 0;
		double ponderadoevanl5q01Rta = 0;
		//1
		double pesoPreguntaevanl1q01 = 10;
		double pesoPreguntaevanl1q02 = 10;
		//2
		double pesoPreguntaevanl2q01 = 8;
		//3
		double pesoPreguntaevanl3q01 = 7;
		double pesoPreguntaevanl3q03 = 7;
		double pesoPreguntaevanl3q02 = 7;
		double pesoPreguntaevanl3q04 = 7;
		double pesoPreguntaevanl3q05 = 7;
		double pesoPreguntaevanl3q06 = 7;
		double pesoPreguntaevanl3q07 = 10;
		double pesoPreguntaevanl3q08 = 5;
		double pesoPreguntaevanl3q09 = 10;
		double pesoPreguntaevanl3q10 = 10;
		double pesoPreguntaevanl3q11 = 10;
		//5
		double pesoPreguntaevanl5q01 = 5;
		// 1
		double sumaEvanl1q01Rta = 0;
		double sumaEvanl2q01Rta = 0;
		// 3
		double sumaEvanl3q01Rta = 0;
		double sumaEvanl3q02Rta = 0;
		double sumaEvanl3q03Rta = 0;
		double sumaEvanl3q04Rta = 0;
		double sumaEvanl3q05Rta = 0;
		double sumaEvanl3q06Rta = 0;
		double sumaEvanl3q07Rta = 0;
		double sumaEvanl3q08Rta = 0;
		double sumaEvanl3q09Rta = 0;
		double sumaEvanl3q10Rta = 0;
		double sumaEvanl3q11Rta = 0;
		
		// 5
		double sumaEvanl5q01Rta = 0;

		double sumaEvanl1q02Rta = 0;
		for (Iterator<EvaluacionAnimales> iterator = evanlist.iterator(); iterator.hasNext();) {
			EvaluacionAnimales evaluacionAnimales = (EvaluacionAnimales) iterator.next();
			System.out.println(evaluacionAnimales);
			try {

				// 1
				sumaEvanl1q01Rta += Integer.parseInt(evaluacionAnimales.getEvanl1q01());
				ponderadoevanl1q01Rta += Integer.parseInt(evaluacionAnimales.getEvanl1q01()) * pesoPreguntaevanl1q01;
				sumaEvanl1q02Rta += Integer.parseInt(evaluacionAnimales.getEvanl1q02());
				ponderadoevanl1q02Rta += Integer.parseInt(evaluacionAnimales.getEvanl1q02()) * pesoPreguntaevanl1q02;
				// 2
				sumaEvanl2q01Rta = sumaEvanl2q01Rta + Integer.parseInt(evaluacionAnimales.getEvanl2q01());
				ponderadoevanl2q01Rta = +Integer.parseInt(evaluacionAnimales.getEvanl2q01()) * pesoPreguntaevanl2q01;
				// 3
				sumaEvanl3q01Rta = sumaEvanl3q01Rta + Integer.parseInt(evaluacionAnimales.getEvanl3q01());
				ponderadoevanl3q01Rta += Integer.parseInt(evaluacionAnimales.getEvanl3q01()) * pesoPreguntaevanl3q01;
				sumaEvanl3q02Rta = sumaEvanl3q02Rta + Integer.parseInt(evaluacionAnimales.getEvanl3q02());
				ponderadoevanl3q02Rta += Integer.parseInt(evaluacionAnimales.getEvanl3q02()) * pesoPreguntaevanl3q02;
				sumaEvanl3q03Rta = sumaEvanl3q03Rta + Integer.parseInt(evaluacionAnimales.getEvanl3q03());
				ponderadoevanl3q03Rta += Integer.parseInt(evaluacionAnimales.getEvanl3q03()) * pesoPreguntaevanl3q03;
				sumaEvanl3q04Rta = sumaEvanl3q04Rta + Integer.parseInt(evaluacionAnimales.getEvanl3q04());
				ponderadoevanl3q04Rta += Integer.parseInt(evaluacionAnimales.getEvanl3q04()) * pesoPreguntaevanl3q04;
				sumaEvanl3q05Rta = sumaEvanl3q05Rta + Integer.parseInt(evaluacionAnimales.getEvanl3q05());
				ponderadoevanl3q05Rta += Integer.parseInt(evaluacionAnimales.getEvanl3q05()) * pesoPreguntaevanl3q05;
				sumaEvanl3q06Rta = sumaEvanl3q06Rta + Integer.parseInt(evaluacionAnimales.getEvanl3q06());
				ponderadoevanl3q06Rta += Integer.parseInt(evaluacionAnimales.getEvanl3q06()) * pesoPreguntaevanl3q06;
				sumaEvanl3q07Rta = sumaEvanl3q07Rta + Integer.parseInt(evaluacionAnimales.getEvanl3q07());
				ponderadoevanl3q07Rta += Integer.parseInt(evaluacionAnimales.getEvanl3q07()) * pesoPreguntaevanl3q07;
				sumaEvanl3q08Rta = sumaEvanl3q08Rta + Integer.parseInt(evaluacionAnimales.getEvanl3q08());
				ponderadoevanl3q08Rta += Integer.parseInt(evaluacionAnimales.getEvanl3q08()) * pesoPreguntaevanl3q08;
				sumaEvanl3q09Rta = sumaEvanl3q09Rta + Integer.parseInt(evaluacionAnimales.getEvanl3q09());
				ponderadoevanl3q09Rta += Integer.parseInt(evaluacionAnimales.getEvanl3q09()) * pesoPreguntaevanl3q09;
				sumaEvanl3q10Rta = sumaEvanl3q10Rta + Integer.parseInt(evaluacionAnimales.getEvanl3q10());
				ponderadoevanl3q10Rta += Integer.parseInt(evaluacionAnimales.getEvanl3q10()) * pesoPreguntaevanl3q10;
				sumaEvanl3q11Rta = sumaEvanl3q11Rta + Integer.parseInt(evaluacionAnimales.getEvanl3q11());
				ponderadoevanl3q11Rta += Integer.parseInt(evaluacionAnimales.getEvanl3q11()) * pesoPreguntaevanl3q11;
				// 5
				sumaEvanl5q01Rta = sumaEvanl5q01Rta + Integer.parseInt(evaluacionAnimales.getEvanl5q01());
				ponderadoevanl5q01Rta += Integer.parseInt(evaluacionAnimales.getEvanl5q01()) * pesoPreguntaevanl5q01;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		// Libertad 1 corrales
		double ponderadoevcol1q01Rta = 0;
		double ponderadoevcol1q02Rta = 0;
		double ponderadoevcol1q03Rta = 0;
		double ponderadoevcol1q04Rta = 0;
		double ponderadoevcol1q05Rta = 0;
		double ponderadoevcol1q06Rta = 0;
		// Libertad 2
		double ponderadoevcol2q01Rta = 0;
		double ponderadoevcol2q02Rta = 0;
		double ponderadoevcol2q03Rta = 0;
		double ponderadoevcol2q04Rta = 0;
		double ponderadoevcol2q05Rta = 0;
		double ponderadoevcol2q06Rta = 0;
		double ponderadoevcol2q07Rta = 0;
		double ponderadoevcol2q08Rta = 0;
		double ponderadoevcol2q09Rta = 0;
		// Libertad 4
		double ponderadoevcol4q01Rta = 0;
		double ponderadoevcol4q02Rta = 0;
		// Libertad 4
		double ponderadoevcol5q01Rta = 0;
		double ponderadoevcol5q02Rta = 0;

//		double Evcol1q01 = 0;
//		double Evcol1q02 = 0;
//		double Evcol1q03 = 0;
//		double Evcol1q04 = 0;
//		double Evcol1q05 = 0;
//		double Evcol1q06 = 0;
		/// Libertad 1
		double pesoevcol1q01 = 10;
		double pesoevcol1q02 = 7;
		double pesoevcol1q03 = 7;
		double pesoevcol1q04 = 10;
		double pesoevcol1q05 = 10;
		double pesoevcol1q06 = 7;
		// Libertad 2
		double pesoevcol2q01 = 10;
		double pesoevcol2q02 = 7;
		double pesoevcol2q03 = 7;
		double pesoevcol2q04 = 10;
		double pesoevcol2q05 = 10;
		double pesoevcol2q06 = 7;
		double pesoevcol2q07 = 7;
		double pesoevcol2q08 = 7;
		double pesoevcol2q09 = 7;
		// Libertad 4
		double pesoevcol4q01 = 7;
		double pesoevcol4q02 = 10;

		// 1
		double sumaEvanCorrall1q01Rta = 0;
		double sumaEvanCorrall1q02Rta = 0;
		double sumaEvanCorrall1q03Rta = 0;
		double sumaEvanCorrall1q04Rta = 0;
		double sumaEvanCorrall1q05Rta = 0;
		double sumaEvanCorrall1q06Rta = 0;
		// libertad 2 corrales
		double sumaEvanCorrall2q01Rta = 0;
		double sumaEvanCorrall2q02Rta = 0;
		double sumaEvanCorrall2q03Rta = 0;
		double sumaEvanCorrall2q04Rta = 0;
		double sumaEvanCorrall2q05Rta = 0;
		double sumaEvanCorrall2q06Rta = 0;
		double sumaEvanCorrall2q07Rta = 0;
		double sumaEvanCorrall2q08Rta = 0;
		double sumaEvanCorrall2q09Rta = 0;

		// libertad 4 corrales
		double sumaEvanCorrall4q01Rta = 0;
		double sumaEvanCorrall4q02Rta = 0;
		// libertad 5 corrales
		double sumaEvanCorrall5q01Rta = 0;
		double sumaEvanCorrall5q02Rta = 0;

		// peso libert 5 corrales
		double pesoevcol5q01 = 10;
		double pesoevcol5q02 = 10;

		for (Iterator<EvaluacionCorrales> iterator = evcolist.iterator(); iterator.hasNext();) {
			EvaluacionCorrales evaluacionCorrales = (EvaluacionCorrales) iterator.next();
			System.out.println(evaluacionCorrales);
			try {
				// Libertad 1
				sumaEvanCorrall1q01Rta = sumaEvanCorrall1q01Rta + Integer.parseInt(evaluacionCorrales.getEvcol1q01());
				sumaEvanCorrall1q02Rta = sumaEvanCorrall1q02Rta + Integer.parseInt(evaluacionCorrales.getEvcol1q02());
				sumaEvanCorrall1q03Rta = sumaEvanCorrall1q03Rta + Integer.parseInt(evaluacionCorrales.getEvcol1q03());
				sumaEvanCorrall1q04Rta = sumaEvanCorrall1q04Rta + Integer.parseInt(evaluacionCorrales.getEvcol1q04());
				sumaEvanCorrall1q05Rta = sumaEvanCorrall1q05Rta + Integer.parseInt(evaluacionCorrales.getEvcol1q05());
				sumaEvanCorrall1q06Rta = sumaEvanCorrall1q06Rta + Integer.parseInt(evaluacionCorrales.getEvcol1q06());

				ponderadoevcol1q01Rta += Integer.parseInt(evaluacionCorrales.getEvcol1q01()) * pesoevcol1q01;
				ponderadoevcol1q02Rta += Integer.parseInt(evaluacionCorrales.getEvcol1q02()) * pesoevcol1q02;
				ponderadoevcol1q03Rta += Integer.parseInt(evaluacionCorrales.getEvcol1q03()) * pesoevcol1q03;
				ponderadoevcol1q04Rta += Integer.parseInt(evaluacionCorrales.getEvcol1q04()) * pesoevcol1q04;
				ponderadoevcol1q05Rta += Integer.parseInt(evaluacionCorrales.getEvcol1q05()) * pesoevcol1q05;
				ponderadoevcol1q06Rta += Integer.parseInt(evaluacionCorrales.getEvcol1q06()) * pesoevcol1q06;
				// libertad 2

				sumaEvanCorrall2q01Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q01());
				sumaEvanCorrall2q02Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q02());
				sumaEvanCorrall2q03Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q03());
				sumaEvanCorrall2q04Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q04());
				sumaEvanCorrall2q05Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q05());
				sumaEvanCorrall2q06Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q06());
				sumaEvanCorrall2q07Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q07());
				sumaEvanCorrall2q08Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q08());
				sumaEvanCorrall2q09Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q09());

				ponderadoevcol2q01Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q01()) * pesoevcol2q01;
				ponderadoevcol2q02Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q02()) * pesoevcol2q02;
				ponderadoevcol2q03Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q03()) * pesoevcol2q03;
				ponderadoevcol2q04Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q04()) * pesoevcol2q04;
				ponderadoevcol2q05Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q05()) * pesoevcol2q05;
				ponderadoevcol2q06Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q06()) * pesoevcol2q06;
				ponderadoevcol2q07Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q07()) * pesoevcol2q07;
				ponderadoevcol2q08Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q08()) * pesoevcol2q08;
				ponderadoevcol2q09Rta += Integer.parseInt(evaluacionCorrales.getEvcol2q09()) * pesoevcol2q09;

				// libertad 4

				sumaEvanCorrall4q01Rta += sumaEvanCorrall4q01Rta + Integer.parseInt(evaluacionCorrales.getEvcol4q01());
				sumaEvanCorrall4q02Rta += sumaEvanCorrall4q02Rta + Integer.parseInt(evaluacionCorrales.getEvcol4q02());

				ponderadoevcol4q01Rta += Integer.parseInt(evaluacionCorrales.getEvcol4q01()) * pesoevcol4q01;
				ponderadoevcol4q02Rta += Integer.parseInt(evaluacionCorrales.getEvcol4q02()) * pesoevcol4q02;
				// libertad 5
				sumaEvanCorrall5q01Rta = sumaEvanCorrall5q01Rta + Integer.parseInt(evaluacionCorrales.getEvcol5q01());
				sumaEvanCorrall5q02Rta = sumaEvanCorrall5q02Rta + Integer.parseInt(evaluacionCorrales.getEvcol5q02());

				ponderadoevcol5q01Rta = Integer.parseInt(evaluacionCorrales.getEvcol5q01()) * pesoevcol5q01;
				ponderadoevcol5q02Rta = Integer.parseInt(evaluacionCorrales.getEvcol5q02()) * pesoevcol5q02;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		double l1Total = sumaEvanl1q01Rta + sumaEvanl1q02Rta + sumaEvanCorrall1q01Rta + sumaEvanCorrall1q02Rta
				+ sumaEvanCorrall1q03Rta + sumaEvanCorrall1q04Rta + sumaEvanCorrall1q05Rta + sumaEvanCorrall1q06Rta;
		double l1PonderacionTotal = ponderadoevanl1q01Rta + ponderadoevanl1q02Rta + ponderadoevcol1q01Rta
				+ ponderadoevcol1q02Rta + ponderadoevcol1q03Rta + ponderadoevcol1q04Rta + ponderadoevcol1q05Rta
				+ ponderadoevcol1q06Rta;

		double l2Total = sumaEvanl2q01Rta + sumaEvanCorrall2q01Rta + sumaEvanCorrall2q02Rta + sumaEvanCorrall2q03Rta
				+ sumaEvanCorrall2q04Rta + sumaEvanCorrall2q05Rta + sumaEvanCorrall2q06Rta + sumaEvanCorrall2q07Rta
				+ sumaEvanCorrall2q08Rta + sumaEvanCorrall2q09Rta;
		double l2PonderacionTotal = ponderadoevanl2q01Rta + ponderadoevcol2q01Rta + ponderadoevcol2q02Rta
				+ ponderadoevcol2q03Rta + ponderadoevcol2q04Rta + ponderadoevcol2q05Rta + ponderadoevcol2q06Rta
				+ ponderadoevcol2q07Rta + ponderadoevcol2q08Rta + ponderadoevcol2q09Rta;

		double l3Total = sumaEvanl3q01Rta + sumaEvanl3q02Rta + sumaEvanl3q03Rta + sumaEvanl3q04Rta + sumaEvanl3q05Rta
				+ sumaEvanl3q06Rta + sumaEvanl3q07Rta + sumaEvanl3q08Rta + sumaEvanl3q09Rta + sumaEvanl3q10Rta
				+ sumaEvanl3q11Rta;
		double l3PonderacionTotal = ponderadoevanl3q01Rta + ponderadoevanl3q02Rta + ponderadoevanl3q03Rta
				+ ponderadoevanl3q04Rta + ponderadoevanl3q05Rta + ponderadoevanl3q06Rta + ponderadoevanl3q07Rta
				+ ponderadoevanl3q08Rta + ponderadoevanl3q09Rta + ponderadoevanl3q10Rta + ponderadoevanl3q11Rta;

		double l4Total =  sumaEvanCorrall4q01Rta + sumaEvanCorrall4q02Rta;
		double l4PonderacionTotal = ponderadoevcol4q01Rta + ponderadoevcol4q02Rta;

		double l5Total = sumaEvanl5q01Rta + sumaEvanCorrall5q01Rta + sumaEvanCorrall5q02Rta;
		double l5PonderacionTotal = ponderadoevanl5q01Rta + ponderadoevcol5q01Rta + ponderadoevcol5q02Rta;

		double total = 0;
		ArrayList<Double> auxP = new ArrayList<Double>();
		auxP.add((((l1Total / l1PonderacionTotal == 0 ? 1 : l1PonderacionTotal) * l1) / 48.0));
		auxP.add((((l2Total / l2PonderacionTotal == 0 ? 1 : l2PonderacionTotal) * l2) / 48.0));
		auxP.add((((l3Total / l3PonderacionTotal == 0 ? 1 : l3PonderacionTotal) * l3) / 48.0));
		auxP.add((((l4Total / l4PonderacionTotal == 0 ? 1 : l4PonderacionTotal) * l4) / 48.0));
		auxP.add((((l5Total / l5PonderacionTotal == 0 ? 1 : l5PonderacionTotal) * l5) / 48.0));
		
		for (Iterator<Double> iterator = auxP.iterator(); iterator.hasNext();) {
			total = total + (Double) iterator.next();
		}
		ArrayList<String> result = new ArrayList<String>();
		String codFinca = serviceAnimales.obtenerFinca(serviceAnimales.getCodEc());
		for (Iterator<Double> iterator = auxP.iterator(); iterator.hasNext();) {
			Double double1 = (Double) iterator.next();
			result.add(formatPercent(double1));
		}
		
		model.addAttribute("list", result);
		model.addAttribute("codEc", serviceAnimales.getCodEc());
		model.addAttribute("codFinca", codFinca);
		model.addAttribute("total", formatPercent(total));

		return "resultados";
	}

	@GetMapping("/resultados/list/{codEc}")
	public String evaluacion(@PathVariable String codEc) {
		serviceAnimales.setCodEc((codEc));
		String codFinca = serviceAnimales.obtenerFinca(codEc);
		serviceAnimales.setCodFinca((codFinca));
		return "redirect:/resultados/list";
	}

	@GetMapping("/resultados/list")
	public String resultadosVista() {
		return "redirect:/resultados";
	}
	private String formatPercent( double num) {
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		percentFormat.setMaximumFractionDigits(1); 
		return percentFormat.format(num/100);
	}
}
