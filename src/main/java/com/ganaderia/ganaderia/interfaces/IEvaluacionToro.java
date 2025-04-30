package com.ganaderia.ganaderia.interfaces;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ganaderia.ganaderia.model.EvaluacionToro;

@Repository
public interface IEvaluacionToro extends CrudRepository<EvaluacionToro, Integer>{

	@Query(value="select * from t_toro where cod_horro = :id ", nativeQuery = true)
	EvaluacionToro get(String id);
	
	@Query(value="select * from t_toro where cod_ec = :codEc order by cod_ec", nativeQuery=true)
	List<EvaluacionToro> listaToros(@Param("codEc") String codEc);
	
}
