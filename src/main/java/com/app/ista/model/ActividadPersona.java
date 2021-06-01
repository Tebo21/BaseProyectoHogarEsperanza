package com.app.ista.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Spring create a collection in MongoDB 
@Document(collection = "actividadPersona")
public class ActividadPersona {

	@Id
	private int idActividadPersona;
	private Persona cedulaPersona;
	private Date fechaActividad;
	private String horaInicio;
	private String horaFin;
	private String descripcionActividad;
	private TipoServicio tipoActividad;


	public ActividadPersona() {
	}


	public ActividadPersona(int idActividadPersona, Persona cedulaPersona, Date fechaActividad, String horaInicio, String horaFin, String descripcionActividad, TipoServicio tipoActividad) {
		this.idActividadPersona = idActividadPersona;
		this.cedulaPersona = cedulaPersona;
		this.fechaActividad = fechaActividad;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.descripcionActividad = descripcionActividad;
		this.tipoActividad = tipoActividad;
	}

	

	public String getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public Persona getCedulaPersona() {
		return this.cedulaPersona;
	}

	public void setCedulaPersona(Persona cedulaPersona) {
		this.cedulaPersona = cedulaPersona;
	}


	public int getIdActividadPersona() {
		return idActividadPersona;
	}

	public void setIdActividadPersona(int idActividadPersona) {
		this.idActividadPersona = idActividadPersona;
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


	public TipoServicio getTipoActividad() {
		return this.tipoActividad;
	}

	public void setTipoActividad(TipoServicio tipoActividad) {
		this.tipoActividad = tipoActividad;
	}


}
