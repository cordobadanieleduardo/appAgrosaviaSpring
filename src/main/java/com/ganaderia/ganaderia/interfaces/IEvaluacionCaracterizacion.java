package com.ganaderia.ganaderia.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ganaderia.ganaderia.model.EvaluacionCaracterizacion;

@Repository
public interface IEvaluacionCaracterizacion extends CrudRepository<EvaluacionCaracterizacion, Integer>{

	@Query(value="select cod_finca from t_fincas where nombre_finca = :nombre", nativeQuery = true)
	String buscarFinca(String nombre);
	
	
	@Query(value="select cod_finca from t_fincas where nombre_finca = :nombre", nativeQuery = true)
	String gerFinca(String nombre);

	@Query(value="select * from t_ec where identificacion = :id", nativeQuery = true)
	List<EvaluacionCaracterizacion> listar(String id);

	@Query(value="select cod_finca from t_ec where cod_ec = :id", nativeQuery = true)
	String getcodFinca(String id);
	
	@Query(value="select * from t_ec where cod_ec = :id", nativeQuery = true)
	EvaluacionCaracterizacion getec(String id);
	
}
