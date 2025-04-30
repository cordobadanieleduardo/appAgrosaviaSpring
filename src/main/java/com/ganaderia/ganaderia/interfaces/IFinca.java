package com.ganaderia.ganaderia.interfaces;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ganaderia.ganaderia.model.Finca;

@Repository
public interface IFinca extends CrudRepository<Finca, Integer> {

	@Query(value ="SELECT * FROM t_fincas where cod_finca = :id" , nativeQuery = true)
	Finca getFinca(@Param("id") int id);

	@Query(value ="SELECT * FROM t_fincas where identificacion = :id" , nativeQuery = true)
	List<Finca> listar(@Param("id") String id);

	@Query(value ="SELECT * FROM t_fincas " , nativeQuery = true)
	List<Finca> listarAll();
	
}