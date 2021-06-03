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
	private String id_paciente;
	private String id_acompaniante;
	private String mensaje;
	private String id_trabajadorFundacion;
	private String especialidad;
	private String nota;
	private String idCentroMedico;

	public CitasMedicas(int idCitasMedicas, String descripcionCitaMedica, Date fechaRegistro, Date fechaCitaMedica,
			String id_paciente, String id_acompaniante, String mensaje, String id_trabajadorFundacion, String especialidad,
			String nota, String idCentroMedico) {
		this.setIdCitasMedicas(idCitasMedicas);
		this.setDescripcionCitaMedica(descripcionCitaMedica);
		this.setFechaRegistro(fechaRegistro);
		this.setFechaCitaMedica(fechaCitaMedica);
		this.setId_paciente(id_paciente);
		this.setId_acompaniante(id_acompaniante);
		this.setMensaje(mensaje);
		this.setId_trabajadorFundacion(id_trabajadorFundacion);
		this.setEspecialidad(especialidad);
		this.setNota(nota);
		this.setIdCentroMedico(idCentroMedico);
	}

	public String getIdCentroMedico() {
		return idCentroMedico;
	}

	public void setIdCentroMedico(String idCentroMedico) {
		this.idCentroMedico = idCentroMedico;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getId_trabajadorFundacion() {
		return id_trabajadorFundacion;
	}

	public void setId_trabajadorFundacion(String id_trabajadorFundacion) {
		this.id_trabajadorFundacion = id_trabajadorFundacion;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getId_acompaniante() {
		return id_acompaniante;
	}

	public void setId_acompaniante(String id_acompaniante) {
		this.id_acompaniante = id_acompaniante;
	}

	public String getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(String id_paciente) {
		this.id_paciente = id_paciente;
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

	public String getDescripcionCitaMedica() {
		return descripcionCitaMedica;
	}

	public void setDescripcionCitaMedica(String descripcionCitaMedica) {
		this.descripcionCitaMedica = descripcionCitaMedica;
	}

	public int getIdCitasMedicas() {
		return idCitasMedicas;
	}

	public void setIdCitasMedicas(int idCitasMedicas) {
		this.idCitasMedicas = idCitasMedicas;
	}

}
