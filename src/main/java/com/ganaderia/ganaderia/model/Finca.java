package com.ganaderia.ganaderia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.*;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="t_fincas")
public class Finca {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int codFinca;
	
	private int areaFinca, areaGanaderia;
	private String latitudFinca, longitudFinca;
	private String nombreFinca, municipioFinca, veredaFinca, tamanoFinca;
	private String propietarioFinca;	

//	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
//	@PrimaryKeyJoinColumn(name="identificacion")
//	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name="identificacion")
//	private Usuario usuario;
	
	private int identificacion;
	
	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public Finca() {
		super();
	}

	public Finca(int codFinca, int areaFinca, int areaGanaderia, String latitudFinca,
			String longitudFinca, String nombreFinca, String municipioFinca, String veredaFinca,  String tamanoFinca, String propietarioFinca) {
		super();
		this.codFinca = codFinca;
		this.tamanoFinca = tamanoFinca;
		this.areaFinca = areaFinca;
		this.areaGanaderia = areaGanaderia;
		this.latitudFinca = latitudFinca;
		this.longitudFinca = longitudFinca;
		this.nombreFinca = nombreFinca;
		this.municipioFinca = municipioFinca;
		this.veredaFinca = veredaFinca;
		this.propietarioFinca = propietarioFinca;
	}

	public int getCodFinca() {
		return codFinca;
	}

	public void setCodFinca(int codFinca) {
		this.codFinca = codFinca;
	}

	public int getAreaFinca() {
		return areaFinca;
	}

	public void setAreaFinca(int areaFinca) {
		this.areaFinca = areaFinca;
	}

	public int getAreaGanaderia() {
		return areaGanaderia;
	}

	public void setAreaGanaderia(int areaGanaderia) {
		this.areaGanaderia = areaGanaderia;
	}

	public String getLatitudFinca() {
		return latitudFinca;
	}

	public void setLatitudFinca(String latitudFinca) {
		this.latitudFinca = latitudFinca;
	}

	public String getLongitudFinca() {
		return longitudFinca;
	}

	public void setLongitudFinca(String longitudFinca) {
		this.longitudFinca = longitudFinca;
	}

	public String getNombreFinca() {
		return nombreFinca;
	}

	public void setNombreFinca(String nombreFinca) {
		this.nombreFinca = nombreFinca;
	}

	public String getMunicipioFinca() {
		return municipioFinca;
	}

	public void setMunicipioFinca(String municipioFinca) {
		this.municipioFinca = municipioFinca;
	}

	public String getVeredaFinca() {
		return veredaFinca;
	}

	public void setVeredaFinca(String veredaFinca) {
		this.veredaFinca = veredaFinca;
	}
	
	public String getTamanoFinca() {
		return tamanoFinca;
	}

	public void setTamanoFinca(String tamanoFinca) {
		this.tamanoFinca = tamanoFinca;
	}

	public String getPropietarioFinca() {
		return propietarioFinca;
	}

	public void setPropietarioFinca(String propietarioFinca) {
		this.propietarioFinca = propietarioFinca;
	}
	
	//Relacion Base de Datos

//	public Usuario getUsuario() {
//		return usuario;
//	}
//
//	public void setUsuario(Usuario usuario) {
//		this.usuario = usuario;
//	}

	@Override
	public String toString() {
		return "Finca [codFinca=" + codFinca + ", areaFinca=" + areaFinca + ", areaGanaderia=" + areaGanaderia
				+ ", latitudFinca=" + latitudFinca + ", longitudFinca=" + longitudFinca + ", nombreFinca=" + nombreFinca
				+ ", municipioFinca=" + municipioFinca + ", veredaFinca=" + veredaFinca + ", tamanoFinca=" + tamanoFinca
				+ ", propietarioFinca=" + propietarioFinca + "]";
	}

}
