package com.ganaderia.ganaderia.interfaces.service;

import java.util.List;
import com.ganaderia.ganaderia.model.EvaluacionNovillo;

public interface IEvaluacionNovilloService {

	public List<EvaluacionNovillo> listar(String codEc);
	public int save(EvaluacionNovillo en);
	public void delete(int id);
	public EvaluacionNovillo get(String id);
	
}
