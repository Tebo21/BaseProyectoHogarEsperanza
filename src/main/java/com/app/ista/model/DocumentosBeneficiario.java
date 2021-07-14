package com.app.ista.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "documentosFamiliares")
public class DocumentosBeneficiario {
    @Id
    private int idDocumentos;
	private String cedulaPersona;
    private List<Object> docPersonasBeneficiarios;
    public DocumentosBeneficiario(int idDocumentos, String cedulaPersona, List<Object> docPersonasBeneficiarios) {
        this.idDocumentos = idDocumentos;
        this.cedulaPersona = cedulaPersona;
        this.docPersonasBeneficiarios=docPersonasBeneficiarios;
    }
    
    public List<Object> getDocPersonasBeneficiarios() {
        return docPersonasBeneficiarios;
    }

    public void setDocPersonasBeneficiarios(List<Object> docPersonasBeneficiarios) {
        this.docPersonasBeneficiarios = docPersonasBeneficiarios;
    }

    public DocumentosBeneficiario() {
    }
    public int getIdDocumentos() {
        return idDocumentos;
    }
    public void setIdDocumentos(int idDocumentos) {
        this.idDocumentos = idDocumentos;
    }
    public String getCedulaPersona() {
        return cedulaPersona;
    }
    public void setCedulaPersona(String cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }
}
