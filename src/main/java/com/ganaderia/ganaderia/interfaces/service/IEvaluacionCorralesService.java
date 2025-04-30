package com.ganaderia.ganaderia.interfaces.service;

import java.util.List;

import com.ganaderia.ganaderia.model.EvaluacionCorrales;

public interface IEvaluacionCorralesService {

	public List<EvaluacionCorrales> listar();
	public int save(EvaluacionCorrales evco);
	public void update(EvaluacionCorrales evco);
	List<EvaluacionCorrales> listaEvaluacionCorrales(String codEc);
	EvaluacionCorrales getEvaluacionCorrales(String id);
	void deleteEvaluacionCorrales(int id);
	String numCorrales(String codEc);
}
