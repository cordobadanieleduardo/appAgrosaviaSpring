package com.ganaderia.ganaderia.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganaderia.ganaderia.interfaces.IEvaluacionAnimales;
import com.ganaderia.ganaderia.interfaces.IEvaluacionCorrales;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionCorralesService;
import com.ganaderia.ganaderia.model.EvaluacionCorrales;

@Service
public class EvaluacionCorralesService implements IEvaluacionCorralesService {

	@Autowired
	private IEvaluacionCorrales data;

	@Autowired
	private IEvaluacionAnimales dataAnimal;

	@Override
	public List<EvaluacionCorrales> listar() {
		return (List<EvaluacionCorrales>) data.findAll();
	}

	@Override
	public int save(EvaluacionCorrales evco) {
		int res = 0;
		EvaluacionCorrales eC = data.save(evco);
		System.out.println(eC);
		if (eC!=null) {
			res = (eC.getId());
		}
		return res;
	}
	

	@Override
	public void update(EvaluacionCorrales evco) {
		data.save(evco);
	}


	@Override
	public List<EvaluacionCorrales> listaEvaluacionCorrales(String codEc) {
//		System.out.println("codEc:  "+codEc + " codEvAn:  " + codEvAn);
		return data.listaCorrales(codEc);
	}
	
	@Override
	public String numCorrales(String codEc) {
//		System.out.println("codEc:  "+codEc + " codEvAn:  " + codEvAn);
		String codFinca = dataAnimal.obtenerFinca(codEc);
		return data.numCorrales(codEc, codFinca);
	}

	@Override
	public EvaluacionCorrales getEvaluacionCorrales(String id) {
		return data.getEvaluacionCorrales(id);
	}

	@Override
	public void deleteEvaluacionCorrales(int id) {
		data.deleteById(id);
	}
}
