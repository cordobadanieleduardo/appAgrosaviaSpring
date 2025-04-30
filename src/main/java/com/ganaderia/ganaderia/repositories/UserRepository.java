package com.ganaderia.ganaderia.repositories;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import com.ganaderia.ganaderia.entities.User;



//@Repository no es necesario declararlo aqui por que es un componente
public interface UserRepository extends CrudRepository<User,Long>{


}
