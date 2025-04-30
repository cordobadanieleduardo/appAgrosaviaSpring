package com.ganaderia.ganaderia.interfaces.service;

import java.util.List;
import com.ganaderia.ganaderia.model.EvaluacionVaca;

public interface IEvaluacionVacaService {

	public List<EvaluacionVaca> listar();
	public int save(EvaluacionVaca elv);
	public void delete(int id);
	public EvaluacionVaca get(String id);
	
}
