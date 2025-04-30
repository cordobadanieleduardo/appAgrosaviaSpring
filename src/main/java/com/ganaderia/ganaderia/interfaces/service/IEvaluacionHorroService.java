package com.ganaderia.ganaderia.interfaces.service;

import java.util.List;

import com.ganaderia.ganaderia.model.EvaluacionHorro;

public interface IEvaluacionHorroService {

	public List<EvaluacionHorro> listar(String codEc);
	public int save(EvaluacionHorro en);
	public void delete(int id);
	public EvaluacionHorro get(String id);
	
}
