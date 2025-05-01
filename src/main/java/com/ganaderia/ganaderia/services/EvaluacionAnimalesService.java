package com.ganaderia.ganaderia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganaderia.ganaderia.interfaces.IEvaluacionAnimales;
import com.ganaderia.ganaderia.interfaces.IEvaluacionAnimalesVaca;
import com.ganaderia.ganaderia.interfaces.IEvaluacionHorro;
import com.ganaderia.ganaderia.interfaces.IEvaluacionNovillo;
import com.ganaderia.ganaderia.interfaces.IEvaluacionTernera;
import com.ganaderia.ganaderia.interfaces.IEvaluacionToro;
import com.ganaderia.ganaderia.interfaces.service.IEvaluacionAnimalesService;
import com.ganaderia.ganaderia.model.EvaluacionAnimales;
import com.ganaderia.ganaderia.model.EvaluacionHorro;
import com.ganaderia.ganaderia.model.EvaluacionVaca;
import com.ganaderia.ganaderia.model.EvaluacionNovillo;
import com.ganaderia.ganaderia.model.EvaluacionTernera;
import com.ganaderia.ganaderia.model.EvaluacionToro;

@Service
public class EvaluacionAnimalesService implements IEvaluacionAnimalesService{

	@Autowired
	private IEvaluacionAnimales data; 
	private int codEvAn;
	private String codFinca, codEc;
	private String codElvaca;
	private String el1codvaca;
	private String novillo;
	private String ternera;

	private String el3codvaca,el4codvaca,el5codvaca;
	@Autowired
	private IEvaluacionAnimalesVaca dataVaca;
	
	@Autowired
	private IEvaluacionNovillo dataNovillo;
	
	@Autowired
	private IEvaluacionTernera dataTernera;

	@Autowired
	private IEvaluacionHorro dataHorro;
	
	@Autowired
	private IEvaluacionToro dataToro;
	
	@Override
	public List<EvaluacionAnimales> listar() {
		return (List<EvaluacionAnimales>)data.findAll();
	}

	@Override
	public List<EvaluacionAnimales> listarId(String id) {
		return (List<EvaluacionAnimales>)data.listaAnimales(id);
	}

	@Override
	public EvaluacionAnimales save(EvaluacionAnimales evan) {
		EvaluacionAnimales animales = data.save(evan);
		return animales;
	}
	
	@Override
	public EvaluacionAnimales update(EvaluacionAnimales evan) {
		return data.save(evan);
	}

	@Override
	public String numeroAnimales(String codEc) {
		return data.numeroAnimales(codEc);
	}

	@Override
	public String obtenerFinca(String codFinca) {
		return data.obtenerFinca(codFinca);
	}
	
	@Override
	public List<EvaluacionAnimales> listaEvaluacionAnimales(String codEc) {
		return (List<EvaluacionAnimales>)data.listaAnimales(codEc);
	}

	@Override
	public EvaluacionAnimales getEvaluacionAnimales(String codEvAn) {
		return data.getEvaluacionAnimales(codEvAn);
	}
	
	@Override
	public EvaluacionVaca getEvaluacionVaca(String id) {
		return dataVaca.getEvaluacionLibertadVaca(id);
	}
	
	@Override
	public EvaluacionTernera getEvaluacionTernera(String id) {
		return dataTernera.get(id);
	}
	
	@Override
	public List<EvaluacionNovillo> listaNovillos(String codEc) {
		return (List<EvaluacionNovillo>)dataNovillo.listaNovillos(codEc);
	}
	
	@Override
	public List<EvaluacionTernera> listaTerneras(String codEc) {
		return (List<EvaluacionTernera>)dataTernera.listaTerneras(codEc);
	}
	
	@Override
	public List<EvaluacionHorro> listaHorros(String codEc) {
		return (List<EvaluacionHorro>)dataHorro.listaHorros(codEc);
	}
	
	@Override
	public List<EvaluacionToro> listaToros(String codEc) {
		return (List<EvaluacionToro>) dataToro.listaToros(codEc);
	}
	
	@Override
	public void deleteEvaluacionAnimales(int codEvAn) {
		data.deleteById(codEvAn);
	}

	@Override
	public String getCodEc() {
		return codEc;
	}

	@Override
	public void setCodEc(String codEc) {
		this.codEc = codEc ;
	}
	
	@Override
	public String getCodFinca() {
		return codFinca;
	}

	@Override
	public void setCodFinca(String codFinca) {
		this.codFinca = codFinca;
	}

	@Override
	public int getCodEvAn() {
		return codEvAn;
	}
	
	@Override
	public void setCodEvAn(int codEvAn) {
		this.codEvAn = codEvAn;
	}

	@Override
	public String getel1codvaca() {
		return el1codvaca;
	}

	@Override
	public String getel2codvaca() {
		return "0";
	}

	@Override
	public String getel3codvaca() {
		return el3codvaca;
	}

	@Override
	public String getel4codvaca() {
		return el4codvaca;
	}
	
	@Override
	public String getel5codvaca() {
		return el5codvaca;
	}

	@Override
	public void setel1codvaca(String id) {
		this.el1codvaca = id ;
	}

	@Override
	public void setnovillo(String id) {
		this.novillo = id ;		
	}

	@Override
	public void setel3codvaca(String id) {
		this.el3codvaca = id ;
	}

	@Override
	public void setel4codvaca(String id) {
		this.el4codvaca = id ;
	}

	@Override
	public void setel5codvaca(String id) {
		this.el5codvaca = id ;
	}

	@Override
	public String getCodElvaca() {
		return codElvaca;
	}

	@Override
	public void setCodElvaca(String codElvaca) {
		this.codElvaca = codElvaca;
	}

	public String getNovillo() {
		return novillo;
	}

	public void setNovillo(String novillo) {
		this.novillo = novillo;
	}

	public String getTernera() {
		return ternera;
	}

	public void setTernera(String ternera) {
		this.ternera = ternera;
	}
}
