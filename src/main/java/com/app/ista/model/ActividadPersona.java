package com.app.ista.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//Spring create a collection in MongoDB 
@Document(collection = "actividadPersona")
public class ActividadPersona {

	@Id
	private int idActividadPersona;
	private String cedulaPersona;
	private Date fechaActividad;
	private String descripcionActividad;
	private List<String> tipoActividad;

	public ActividadPersona(int idActividadPersona, String cedulaPersona, Date fechaActividad,
			String descripcionActividad, List<String> tipoActividad) {
		this.idActividadPersona = idActividadPersona;
		this.cedulaPersona = cedulaPersona;
		this.fechaActividad = fechaActividad;
		this.descripcionActividad = descripcionActividad;
		this.tipoActividad = tipoActividad;
	}

	public int getIdActividadPersona() {
		return idActividadPersona;
	}

	public void setIdActividadPersona(int idActividadPersona) {
		this.idActividadPersona = idActividadPersona;
	}

	public String getCedulaPersona() {
		return cedulaPersona;
	}

	public void setCedulaPersona(String cedulaPersona) {
		this.cedulaPersona = cedulaPersona;
	}

	public Date getFechaActividad() {
		return fechaActividad;
	}

	public void setFechaActividad(Date fechaActividad) {
		this.fechaActividad = fechaActividad;
	}

	public String getDescripcionActividad() {
		return descripcionActividad;
	}

	public void setDescripcionActividad(String descripcionActividad) {
		this.descripcionActividad = descripcionActividad;
	}

	public List<String> getTipoActividad() {
		return tipoActividad;
	}

	public void setTipoActividad(List<String> tipoActividad) {
		this.tipoActividad = tipoActividad;
	}

}
