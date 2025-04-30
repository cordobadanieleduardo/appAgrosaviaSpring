package com.ganaderia.ganaderia.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ganaderia.ganaderia.interfaces.IEvaluacionToro;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionToroService;
import com.ganaderia.ganaderia.model.EvaluacionToro;

@Service
public class EvaluacionToroService implements IEvaluacionToroService {

	@Autowired
	private IEvaluacionToro data;

	@Override
	public List<EvaluacionToro> listar(String codEc) {
		return (List<EvaluacionToro>) data.listaToros(codEc);
	}

	@Override
	public int save(EvaluacionToro el3) {
		int res = 0;
		EvaluacionToro t = data.save(el3);
		if (!t.equals(null)) {
			res = t.getCodEvAn();
		}
		return res;
	}

	@Override
	public void delete(int id) {

	}

	@Override
	public EvaluacionToro get(String id) {
		return data.get(id);
	}

}
