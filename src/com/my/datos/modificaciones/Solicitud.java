package com.my.datos.modificaciones;

import com.my.datos.academico.Estudiante;
import com.my.datos.academico.Persona;

public class Solicitud {
    
    private String codigo;
    private Persona solicitante;
    private Estudiante estudiante; 
    private String fecha; 
    private String descripcion; 
    private Object evidencia; 
    private String tipoInconsistencia = "Modificación Acta"; 
    private String pathResolucion; 
    private EstadoEnum estado = EstadoEnum.PENDIENTE; 

    public Solicitud(String codigo, Persona solicitante, Estudiante estudiante, String date, String descripcion) {
        this.codigo = codigo;
        this.solicitante = solicitante;
        this.estudiante = estudiante;
        this.fecha = date;
        this.descripcion = descripcion;
    }

    public Solicitud(Persona solicitante, Estudiante estudiante, String fecha, String descripcion) {
        this.solicitante = solicitante;
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Solicitud(Persona solicitante, Estudiante estudiante, String fecha, String descripcion, Object evidencia) {
        this.solicitante = solicitante;
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.evidencia = evidencia;
    }
        
    public Solicitud(String codigo, Persona solicitante, Estudiante estudiante, String date, String descripcion, Object evidencia, String pathResolucion) {
        this.codigo = codigo;
        this.solicitante = solicitante;
        this.estudiante = estudiante;
        this.fecha = date;
        this.descripcion = descripcion;
        this.evidencia = evidencia;
        this.pathResolucion = pathResolucion;
    }

    public Solicitud(String codigo, Persona solicitante, Estudiante estudiante, String fecha, String descripcion, String pathResolucion) {
        this.codigo = codigo;
        this.solicitante = solicitante;
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.pathResolucion = pathResolucion;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setDate(String date) {
        this.fecha = date;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Object getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(Object evidencia) {
        this.evidencia = evidencia;
    }

    public String getTipoInconsistencia() {
        return tipoInconsistencia;
    }

    public void setTipoInconsistencia(String tipoInconsistencia) {
        this.tipoInconsistencia = tipoInconsistencia;
    }

    public String getPathResolucion() {
        return pathResolucion;
    }

    public void setPathResolucion(String pathResolucion) {
        this.pathResolucion = pathResolucion;
    }

    public EstadoEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnum estado) {
        this.estado = estado;
    }
            
}
