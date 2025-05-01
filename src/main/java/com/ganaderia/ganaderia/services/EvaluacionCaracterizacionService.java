package com.ganaderia.ganaderia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganaderia.ganaderia.interfaces.IEvaluacionCaracterizacion;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionCaracterizacionService;
import com.ganaderia.ganaderia.model.EvaluacionCaracterizacion;

@Service
public class EvaluacionCaracterizacionService implements IEvaluacionCaracterizacionService {
	
	@Autowired
	private IEvaluacionCaracterizacion data;
	
	@Override
	public List<EvaluacionCaracterizacion> listar(String usuario) {
		return (List<EvaluacionCaracterizacion>)data.listar(usuario);
	}

	@Override
	public int save(EvaluacionCaracterizacion ec) {
		EvaluacionCaracterizacion evaluacarac = data.save(ec);
		int res = 0;
		if(!evaluacarac.equals(null))
			res=evaluacarac.getCodEc();
		return res;
	}

	@Override
	public void delete(int id) {

	}
	
	@Override
	public String buscarFinca(String nombre) {
		return data.buscarFinca(nombre);
	}

	@Override
	public String getcodFinca(String ec) {
		return data.getcodFinca(ec);
	}

	@Override
	public EvaluacionCaracterizacion getec(String ec) {
		EvaluacionCaracterizacion n = data.getec(ec);
		return n;
	}

	@Override
	public List<EvaluacionCaracterizacion> listarAll() {
		return (List<EvaluacionCaracterizacion>)data.findAll();
	}

}
