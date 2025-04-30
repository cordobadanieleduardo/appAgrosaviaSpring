package com.ganaderia.ganaderia.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="t_usuarios")
public class Usuario {
	

	@Id
	private int identificacion;
	
	private String nombre, apellido, correo, contrasena;
	
	public Usuario() {
		
	}

	public Usuario(int identificacion, String nombre, String apellido, String correo, String contrasena) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasena = contrasena;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	@Override
	public String toString() {
		return "Usuario [identificacion=" + identificacion + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", correo=" + correo + ", contrasena=" + contrasena + "]";
	}
	
}
