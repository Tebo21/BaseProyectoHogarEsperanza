package com.app.ista.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.ista.model.RegistroFamliares;

@Repository
public interface RegistroFamiliaresRepository extends MongoRepository <RegistroFamliares, Long>{
	
	@Query(value = "{},{idRegistroFamiliares:1}", sort = "{_id: -1}")
	List<RegistroFamliares> id();
	
}
