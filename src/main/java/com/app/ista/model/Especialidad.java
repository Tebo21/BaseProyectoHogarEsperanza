package com.app.ista.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Spring create a collection in MongoDB 
@Document(collection = "especialidad")
public class Especialidad {
	
	@Id
	private int idEspecialidad;
	private String nombreEspecialidad;
	private String idCentroMedico;
	
	public Especialidad(int idEspecialidad, String nombreEspecialidad, String idCentroMedico) {
		this.idEspecialidad = idEspecialidad;
		this.nombreEspecialidad = nombreEspecialidad;
		this.idCentroMedico = idCentroMedico;
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}

	public String getIdCentroMedico() {
		return idCentroMedico;
	}

	public void setIdCentroMedico(String idCentroMedico) {
		this.idCentroMedico = idCentroMedico;
	}
}
