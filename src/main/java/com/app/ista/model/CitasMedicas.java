package com.app.ista.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Spring create a collection in MongoDB 
@Document(collection = "citasMedicas")
public class CitasMedicas {
	@Id
	private int idCitasMedicas;
	private String descripcionCitaMedica;
	private Date fechaRegistro;
	private Date fechaCitaMedica;
	private Persona paciente;
	private Persona acompaniante;
	private String mensaje;
	private Persona trabajadorFundacion;
	private String especialidad;
	private String nota;
	private String idCentroMedico;

	public CitasMedicas(int idCitasMedicas, String descripcionCitaMedica, Date fechaRegistro, Date fechaCitaMedica,
			Persona paciente, Persona acompaniante, String mensaje, Persona trabajadorFundacion,
			String especialidad, String nota, String idCentroMedico) {
		this.idCitasMedicas = idCitasMedicas;
		this.descripcionCitaMedica = descripcionCitaMedica;
		this.fechaRegistro = fechaRegistro;
		this.fechaCitaMedica = fechaCitaMedica;
		this.paciente = paciente;
		this.acompaniante = acompaniante;
		this.mensaje = mensaje;
		this.trabajadorFundacion = trabajadorFundacion;
		this.especialidad = especialidad;
		this.nota = nota;
		this.idCentroMedico = idCentroMedico;
	}

	public int getIdCitasMedicas() {
		return idCitasMedicas;
	}

	public void setIdCitasMedicas(int idCitasMedicas) {
		this.idCitasMedicas = idCitasMedicas;
	}

	public String getDescripcionCitaMedica() {
		return descripcionCitaMedica;
	}

	public void setDescripcionCitaMedica(String descripcionCitaMedica) {
		this.descripcionCitaMedica = descripcionCitaMedica;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaCitaMedica() {
		return fechaCitaMedica;
	}

	public void setFechaCitaMedica(Date fechaCitaMedica) {
		this.fechaCitaMedica = fechaCitaMedica;
	}

	public Persona getPaciente() {
		return paciente;
	}

	public void setPaciente(Persona paciente) {
		this.paciente = paciente;
	}

	public Persona getAcompaniante() {
		return acompaniante;
	}

	public void setAcompaniante(Persona acompaniante) {
		this.acompaniante = acompaniante;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Persona getTrabajadorFundacion() {
		return trabajadorFundacion;
	}

	public void setTrabajadorFundacion(Persona trabajadorFundacion) {
		this.trabajadorFundacion = trabajadorFundacion;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getIdCentroMedico() {
		return idCentroMedico;
	}

	public void setIdCentroMedico(String idCentroMedico) {
		this.idCentroMedico = idCentroMedico;
	}

}
