package com.ganaderia.ganaderia.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganaderia.ganaderia.interfaces.IEvaluacionHorro;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionHorroService;
import com.ganaderia.ganaderia.model.EvaluacionHorro;

@Service
public class EvaluacionHorroService implements IEvaluacionHorroService {

	@Autowired
	private IEvaluacionHorro data;

	@Override
	public List<EvaluacionHorro> listar(String codEc) {
		return (List<EvaluacionHorro>) data.listaHorros(codEc);
	}

	@Override
	public int save(EvaluacionHorro el3) {
		int res = 0;
		EvaluacionHorro novillo = data.save(el3);
		if (!novillo.equals(null)) {
			res = novillo.getCodEvAn();
		}
		return res;
	}

	@Override
	public void delete(int id) {

	}

	@Override
	public EvaluacionHorro get(String id) {
		return data.get(id);
	}

}
