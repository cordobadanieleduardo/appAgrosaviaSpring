package com.ganaderia.ganaderia.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganaderia.ganaderia.interfaces.IEvaluacionTernera;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionTerneraService;
import com.ganaderia.ganaderia.model.EvaluacionTernera;

@Service
public class EvaluacionTerneraService implements IEvaluacionTerneraService {

	@Autowired
	private IEvaluacionTernera data;

	@Override
	public List<EvaluacionTernera> listar(String codEc) {
		return (List<EvaluacionTernera>) data.listaTerneras(codEc);
	}

	@Override
	public int save(EvaluacionTernera el3) {
		int res = 0;
		EvaluacionTernera novillo = data.save(el3);
		if (!novillo.equals(null)) {
			res = novillo.getCodEvAn();
		}
		return res;
	}

	@Override
	public void delete(int id) {

	}

	@Override
	public EvaluacionTernera get(String id) {
		return data.get(id);
	}

}
