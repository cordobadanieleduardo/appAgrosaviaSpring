package com.ganaderia.ganaderia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganaderia.ganaderia.interfaces.IUsuario;
import com.ganaderia.ganaderia.interfaces.service.IUsuarioService;
import com.ganaderia.ganaderia.model.Usuario;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private IUsuario data;
	
	private Usuario usuario;
	
	@Override
	public boolean validarUsuario(String correo, String contrasena) {
		this.usuario = data.findByCorreoAndContrasena(correo, contrasena);
		System.out.println(this.usuario);
		return this.usuario!=null;
	}
	
	@Override
	public List<Usuario> listar() {
		
		return (List<Usuario>)data.findAll();
	}

	@Override
	public Optional<Usuario> listarId(int id) {
		// // TODO Auto-generated method stub
		// return (Optional<Usuario>)data.findAllById(id);
		return null;
	}

	@Override
	public int save(Usuario u) {
		int res = 0;
		Usuario usuario = data.save(u);
		if(!usuario.equals(null))
			res=usuario.getIdentificacion();
		
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Usuario getIdentificacion(String correo, String contrasena) {
		this.usuario = data.findByCorreoAndContrasena(correo, contrasena);
		return usuario;
	}

	@Override
	public Usuario getUsuario() {
		return usuario;
	}

	@Override
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
