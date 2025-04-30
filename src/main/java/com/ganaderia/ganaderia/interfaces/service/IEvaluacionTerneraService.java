package com.ganaderia.ganaderia.interfaces.service;

import java.util.List;
import com.ganaderia.ganaderia.model.EvaluacionTernera;

public interface IEvaluacionTerneraService {

	public List<EvaluacionTernera> listar(String codEc);
	public int save(EvaluacionTernera en);
	public void delete(int id);
	public EvaluacionTernera get(String id);
	
}
