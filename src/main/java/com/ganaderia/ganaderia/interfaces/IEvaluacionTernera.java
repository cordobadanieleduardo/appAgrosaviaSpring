package com.ganaderia.ganaderia.interfaces;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ganaderia.ganaderia.model.EvaluacionTernera;

@Repository
public interface IEvaluacionTernera extends CrudRepository<EvaluacionTernera, Integer>{

	@Query(value="select * from t_ternera where cod_ternera = :id ", nativeQuery = true)
	EvaluacionTernera get(String id);
	
	@Query(value="select * from t_ternera where cod_ec = :codEc order by cod_ec", nativeQuery=true)
	List<EvaluacionTernera> listaTerneras(@Param("codEc") String codEc);
	
}
