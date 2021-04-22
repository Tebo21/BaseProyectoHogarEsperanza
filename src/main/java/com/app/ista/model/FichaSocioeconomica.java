package com.app.ista.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


//lombok anotation
@Data
//Spring create a collection in MongoDB 
@Document(collection = "fichaSocioeconomica")
public class FichaSocioeconomica {
	@Id
	private String idFichaSocioeconomica;
	private String cedulaPersona;
	private String situacionEconomica;
	private String tipoVivienda;
	private String descripcionVivienda;
	private String seguro;
	private boolean discapacidad;
	private String discapacidadDescipcion;
	private String nacionalidad;
	private String estadoCivil;
	private double salario;
	private Date fechaRegistro;
	private boolean adultoMayor;
	private boolean viveConOtros;
	
	

}
