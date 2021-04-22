package com.app.ista.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//lombok anotation
@Data
//Spring create a collection in MongoDB 
@Document(collection = "citasMedicas")
public class CitasMedicas {
	@Id
	private String idCitasMedicas;
	private String descripcionCitaMedica;
	private Date fechaRegistro;
	private Date fechaCitaMedica;
	private Persona paciente;
	private Persona acompaniante;
	private String mensaje;
	private Persona trabajadorFundacion;
	private Especialidad especialidad;
	private String nota;
	private String idCentroMedico;
	
}
