package com.ganaderia.ganaderia.interfaces;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ganaderia.ganaderia.model.EvaluacionNovillo;

@Repository
public interface IEvaluacionNovillo extends CrudRepository<EvaluacionNovillo, Integer>{

	@Query(value="select * from t_novillo where cod_novillo = :id ", nativeQuery = true)
	EvaluacionNovillo get(String id);
	
	@Query(value="select * from t_novillo where cod_ec = :codEc order by cod_ec", nativeQuery=true)
	List<EvaluacionNovillo> listaNovillos(@Param("codEc") String codEc);
	
}
