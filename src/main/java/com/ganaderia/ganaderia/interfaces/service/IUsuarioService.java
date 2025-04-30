package com.ganaderia.ganaderia.interfaces.service;

import java.util.List;
import java.util.Optional;

import com.ganaderia.ganaderia.model.Usuario;

public interface IUsuarioService {

	public boolean validarUsuario(String correo, String contrasena);
	public List<Usuario> listar();
	public Optional<Usuario> listarId(int id);
	public int save(Usuario u);
	public void delete(int id);
	public Usuario getIdentificacion(String correo, String contrasena);
	public Usuario getUsuario();
	void setUsuario(Usuario usuario);
	
}
