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
	private String paciente;
	private String acompaniante;
	private String mensaje;
	private String trabajadorFundacion;
        private String centroMedico;
	private String especialidad;
	private String nota;

    public CitasMedicas(int idCitasMedicas, String descripcionCitaMedica, Date fechaRegistro, Date fechaCitaMedica, String paciente, String acompaniante, String mensaje, String trabajadorFundacion, String centroMedico, String especialidad, String nota) {
        this.idCitasMedicas = idCitasMedicas;
        this.descripcionCitaMedica = descripcionCitaMedica;
        this.fechaRegistro = fechaRegistro;
        this.fechaCitaMedica = fechaCitaMedica;
        this.paciente = paciente;
        this.acompaniante = acompaniante;
        this.mensaje = mensaje;
        this.trabajadorFundacion = trabajadorFundacion;
        this.centroMedico = centroMedico;
        this.especialidad = especialidad;
        this.nota = nota;
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

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getAcompaniante() {
        return acompaniante;
    }

    public void setAcompaniante(String acompaniante) {
        this.acompaniante = acompaniante;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTrabajadorFundacion() {
        return trabajadorFundacion;
    }

    public void setTrabajadorFundacion(String trabajadorFundacion) {
        this.trabajadorFundacion = trabajadorFundacion;
    }

    public String getCentroMedico() {
        return centroMedico;
    }

    public void setCentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
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
	

}