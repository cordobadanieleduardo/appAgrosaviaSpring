package com.ganaderia.ganaderia.interfaces.service;

import java.util.List;
import com.ganaderia.ganaderia.model.Finca;

public interface IFincaService {

	Finca getFinca(int id);
	int save(Finca f);
	void delete(int id);
	int getId();
	void setId(int id);
	List<Finca> listar(String usuario);
	List<Finca> listarAll();
}
