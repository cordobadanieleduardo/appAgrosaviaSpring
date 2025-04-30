package com.ganaderia.ganaderia.interfaces;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ganaderia.ganaderia.model.EvaluacionHorro;

@Repository
public interface IEvaluacionHorro extends CrudRepository<EvaluacionHorro, Integer>{

	@Query(value="select * from t_horro where cod_horro = :id ", nativeQuery = true)
	EvaluacionHorro get(String id);
	
	@Query(value="select * from t_horro where cod_ec = :codEc order by cod_ec", nativeQuery=true)
	List<EvaluacionHorro> listaHorros(@Param("codEc") String codEc);
	
}
