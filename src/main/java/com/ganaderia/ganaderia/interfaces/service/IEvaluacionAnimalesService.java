package com.ganaderia.ganaderia.interfaces.service;

import java.util.List;

import com.ganaderia.ganaderia.model.EvaluacionAnimales;
import com.ganaderia.ganaderia.model.EvaluacionHorro;
import com.ganaderia.ganaderia.model.EvaluacionVaca;
import com.ganaderia.ganaderia.model.EvaluacionNovillo;
import com.ganaderia.ganaderia.model.EvaluacionTernera;
import com.ganaderia.ganaderia.model.EvaluacionToro;


public interface IEvaluacionAnimalesService {
	
	public List<EvaluacionAnimales> listar();
	public List<EvaluacionAnimales> listarId(String numeroAnimales);
	public EvaluacionAnimales save(EvaluacionAnimales evan);
	String numeroAnimales(String codEc);
	String obtenerFinca(String codFinca);
	List<EvaluacionAnimales> listaEvaluacionAnimales(String codEc);
	EvaluacionAnimales getEvaluacionAnimales(String codEvAn);
	void deleteEvaluacionAnimales(int codEvAn);
	EvaluacionAnimales update(EvaluacionAnimales codEvAn);
	
	String getCodEc();
	void setCodEc(String codEc);
	String getCodFinca();
	void setCodFinca(String codFinca);
	int getCodEvAn();
	void setCodEvAn(int codEvAn);
	
	 String  getel1codvaca();
	 void setel1codvaca(String id);
	 String  getel2codvaca();
	 void setnovillo(String id);
	 String  getel3codvaca();
	 void setel3codvaca(String id);
	 String  getel4codvaca();
	 void setel4codvaca(String id);
	 String getel5codvaca();
	 void setel5codvaca(String id);
	String getCodElvaca();
	void setCodElvaca(String codElvaca);
	
	EvaluacionVaca getEvaluacionVaca(String id);
	
	List<EvaluacionNovillo> listaNovillos(String codEc);
	List<EvaluacionTernera> listaTerneras(String codEc);
	List<EvaluacionHorro> listaHorros(String codEc);
	List<EvaluacionToro> listaToros(String codEc);
	
	
	EvaluacionTernera getEvaluacionTernera(String id);

}
