package com.app.ista.controller;

import java.util.List;

import com.app.ista.model.DocumentosBeneficiario;
import com.app.ista.service.DocumentosBeneficiarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documentosBeneficiarios")
@CrossOrigin(origins = "*")
public class DocumentosBeneficiarioController {
    @Autowired
    DocumentosBeneficiarioService documentosBeneficiarioService;

    @PostMapping(value = "/addDocumentos")
    public ResponseEntity<String> guardarDocumentoBeneficiaros(@RequestBody DocumentosBeneficiario documentosBeneficiario){
        documentosBeneficiarioService.guardarDocumentos(documentosBeneficiario);
        return ResponseEntity.ok("Ok");
    }
    @GetMapping(path = "/listadoDocumentos", produces = "application/json")
    public List<DocumentosBeneficiario>listadoDocumentos(){
      return documentosBeneficiarioService.listardoDocumetnos();
    }
    @GetMapping(path = "/listadoporcedula/{cedula}", produces = "application/json")
    public DocumentosBeneficiario porCedula(@PathVariable String cedula){
        return documentosBeneficiarioService.porCedula(cedula);
    }
    @PutMapping("/updateDocumentos")
    public DocumentosBeneficiario actualizaDocumentos(@RequestBody DocumentosBeneficiario documentosBeneficiario){
        DocumentosBeneficiario documentosBeneficiario2= documentosBeneficiarioService.porCedula(documentosBeneficiario.getCedulaPersona());
        documentosBeneficiario2.setDocPersonasBeneficiarios(documentosBeneficiario.getDocPersonasBeneficiarios());
        documentosBeneficiarioService.guardardoc(documentosBeneficiario2);
        return documentosBeneficiario2;
    }
}
