package com.ganaderia.ganaderia.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganaderia.ganaderia.interfaces.IEvaluacionVaca;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionVacaService;
import com.ganaderia.ganaderia.model.EvaluacionVaca;

@Service
public class EvaluacionVacaService implements IEvaluacionVacaService {
	
	@Autowired
	private IEvaluacionVaca data;
	
	@Override
	public List<EvaluacionVaca> listar() {
		
		return (List<EvaluacionVaca>)data.findAll();
	}

	@Override
	public int save(EvaluacionVaca el3) {
		int res = 0;
		EvaluacionVaca evalualib3 = data.save(el3);
		if(!evalualib3.equals(null)) {
			res=evalualib3.getCodElvaca();
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
	}

	@Override
	public EvaluacionVaca get(String id) {
		return data.get(id);
	}

}
