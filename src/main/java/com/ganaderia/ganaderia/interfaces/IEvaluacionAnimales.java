
package com.ganaderia.ganaderia.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ganaderia.ganaderia.model.EvaluacionAnimales;

@Repository
public interface IEvaluacionAnimales extends CrudRepository<EvaluacionAnimales, Integer> {
//	select * from t_evan where cod_finca = (select cod_finca from t_ec where cod_ec = 5);
//	@Query(value="select * from t_evan", nativeQuery=true)
//	List<EvaluacionAnimales> findAll();
//	
	@Query(value="select * from t_evan where cod_finca = (select cod_finca from t_ec where cod_ec = :codEc)", nativeQuery=true)
	List<EvaluacionAnimales> findByAnimalesAll(@Param("codEc") String id);
	
	@Query(value="select ec_muestra from t_ec where cod_ec = :id", nativeQuery=true)
	String numeroAnimales(@Param("id") String codEc);
	
	@Query(value="select cod_finca from t_ec where cod_ec = :codEc", nativeQuery=true)
	String obtenerFinca(@Param("codEc") String codEc);

	@Query(value="select * from t_evan where cod_ec = :codEc order by cod_ec", nativeQuery=true)
	List<EvaluacionAnimales> listaAnimales(@Param("codEc") String codEc);

	@Query(value="select * from t_evan where cod_ev_an = :id", nativeQuery=true)
	EvaluacionAnimales getEvaluacionAnimales(@Param("id") String codEvAn);
	
	@Query(value="delete from t_evan where cod_ev_an = :codEvAn", nativeQuery=true)
	void deleteEvaluacionAnimales(@Param("codEvAn") String codEvAn);
	
}
