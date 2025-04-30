package com.ganaderia.ganaderia.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ganaderia.ganaderia.model.EvaluacionCorrales;

@Repository
public interface IEvaluacionCorrales extends CrudRepository<EvaluacionCorrales, Integer> {
//	select * from t_evco where cod_finca = (select cod_finca from t_ec where cod_ec = 5);
	// @Query(value = "select * from t_evco", nativeQuery = true)
	// List<EvaluacionCorrales> findAll();

	@Query(value = "select * from t_evco where cod_ec = :codEc order by id", nativeQuery = true)
	List<EvaluacionCorrales> listaCorrales(@Param("codEc") String codEc);
	

	@Query(value = "select * from t_evco where id = :id", nativeQuery = true)
	EvaluacionCorrales getEvaluacionCorrales(@Param("id") String id);

	@Query(value = "delete from t_evco where id = :id", nativeQuery = true)
	void deleteEvaluacionCorrales(@Param("id") String id);

	@Query(value = "select ecq05 from t_ec where cod_ec = :codEc and cod_finca = :codFinca", nativeQuery = true)
	String numCorrales(String codEc , String codFinca);
}
