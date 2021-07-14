package com.app.ista.repository;

import java.util.List;

import com.app.ista.model.DocumentosBeneficiario;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentosBeneficiarioRepository extends MongoRepository <DocumentosBeneficiario, Long> {
    @Query(value = "{},{idDocumentos:1}", sort = "{_id: -1}")
    List<DocumentosBeneficiario> id();
    DocumentosBeneficiario findByCedulaPersona(String cedulaPersona);
    DocumentosBeneficiario deleteByCedulaPersona(String cedulaPersona);
}
