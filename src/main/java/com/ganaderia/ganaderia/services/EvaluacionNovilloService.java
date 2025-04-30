package com.ganaderia.ganaderia.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganaderia.ganaderia.interfaces.IEvaluacionNovillo;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionNovilloService;
import com.ganaderia.ganaderia.model.EvaluacionNovillo;

@Service
public class EvaluacionNovilloService implements IEvaluacionNovilloService {

	@Autowired
	private IEvaluacionNovillo data;

	@Override
	public List<EvaluacionNovillo> listar(String codEc) {
		return (List<EvaluacionNovillo>) data.listaNovillos(codEc);
	}

	@Override
	public int save(EvaluacionNovillo el3) {
		int res = 0;
		EvaluacionNovillo novillo = data.save(el3);
		if (!novillo.equals(null)) {
			res = novillo.getCodEvAn();
		}
		return res;
	}

	@Override
	public void delete(int id) {

	}

	@Override
	public EvaluacionNovillo get(String id) {
		return data.get(id);
	}

}
