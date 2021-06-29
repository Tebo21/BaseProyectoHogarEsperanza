package com.app.ista.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "observacionespersona")
public class ObservacionesPersona {
    @Id
    private int idObservacionesPersona;
    private String cedulaPersona;
    private Date fechaRegistro;
    private String descripcionobservacion;
    public ObservacionesPersona() {
    }
    public ObservacionesPersona(int idObservacionesPersona, String cedulaPersona, Date fechaRegistro,
            String descripcionobservacion) {
        this.idObservacionesPersona = idObservacionesPersona;
        this.cedulaPersona = cedulaPersona;
        this.fechaRegistro = fechaRegistro;
        this.descripcionobservacion = descripcionobservacion;
    }
    public int getIdObservacionesPersona() {
        return idObservacionesPersona;
    }
    public void setIdObservacionesPersona(int idObservacionesPersona) {
        this.idObservacionesPersona = idObservacionesPersona;
    }
    public String getCedulaPersona() {
        return cedulaPersona;
    }
    public void setCedulaPersona(String cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }
    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public String getDescripcionobservacion() {
        return descripcionobservacion;
    }
    public void setDescripcionobservacion(String descripcionobservacion) {
        this.descripcionobservacion = descripcionobservacion;
    }    
}
