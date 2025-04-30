package com.ganaderia.ganaderia.interfaces.service;

import java.util.List;

import com.ganaderia.ganaderia.model.EvaluacionToro;

public interface IEvaluacionToroService {

	public List<EvaluacionToro> listar(String codEc);
	public int save(EvaluacionToro en);
	public void delete(int id);
	public EvaluacionToro get(String id);
	
}
