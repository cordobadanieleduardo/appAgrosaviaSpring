package com.ganaderia.ganaderia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganaderia.ganaderia.interfaces.IFinca;
import com.ganaderia.ganaderia.interfaces.service.IFincaService;
import com.ganaderia.ganaderia.model.Finca;

@Service
public class FincaImpl implements IFincaService{

    @Autowired //sino en el constructor
    private IFinca data;

	private int id;

	@Override
	public List<Finca> listar(String usuario) {
		return (List<Finca>) data.listar(usuario);
	}

	@Override
	public Finca getFinca(int id) {
		if (id != 0)
			return data.getFinca(id);
		return null;
	}

	@Override
	public int save(Finca f) {
		int res = 0;
		Finca aux = null;
//		Optional<Finca> finca = data.findById(f.getCodFinca());
		try {
			aux = data.save(f);
			if (!aux.equals(null))
				res = 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return res;
	}

	@Override
	public void delete(int id) {

	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

    @Override
    public List<Finca> listarAll() {
        return (List<Finca>) data.findAll();
    }
    
}
