
package com.ganaderia.ganaderia.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ganaderia.ganaderia.model.EvaluacionVaca;

@Repository
public interface IEvaluacionAnimalesVaca extends CrudRepository<EvaluacionVaca, Integer> {

	@Query(value="select * from t_vaca where cod_elvaca = :id", nativeQuery=true)
	EvaluacionVaca getEvaluacionLibertadVaca(@Param("id") String id);
	
}
