package com.ganaderia.ganaderia.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ganaderia.ganaderia.model.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer>{

	@Query(value="select * from t_usuarios where correo=:correo and contrasena=:contrasena", nativeQuery = true)
	Usuario findByCorreoAndContrasena(String correo, String contrasena);
	
}


