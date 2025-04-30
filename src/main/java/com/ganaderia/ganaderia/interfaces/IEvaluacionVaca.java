package com.ganaderia.ganaderia.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ganaderia.ganaderia.model.EvaluacionVaca;

@Repository
public interface IEvaluacionVaca extends CrudRepository<EvaluacionVaca, Integer>{

	@Query(value="select * from t_vaca where id = :id ", nativeQuery = true)
	EvaluacionVaca get(String id);
	
//	@Query(value="select cod_ec from t_ec where nombre_finca = :cod", nativeQuery = true)
	
	
}
