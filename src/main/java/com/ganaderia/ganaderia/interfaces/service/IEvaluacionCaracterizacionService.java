package com.ganaderia.ganaderia.interfaces.service;

import java.util.List;
import com.ganaderia.ganaderia.model.EvaluacionCaracterizacion;

public interface IEvaluacionCaracterizacionService {

	public List<EvaluacionCaracterizacion> listar(String usuario);
	public List<EvaluacionCaracterizacion> listarAll();
	public int save(EvaluacionCaracterizacion ec);
	public void delete(int id);
	public String buscarFinca(String nombre);
	public String getcodFinca(String ec);
	public EvaluacionCaracterizacion getec(String ec);
}
