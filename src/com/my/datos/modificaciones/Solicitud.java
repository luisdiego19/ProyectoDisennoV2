package com.my.datos.modificaciones;

import com.my.datos.academico.Curso;
import com.my.datos.academico.Estudiante;
import com.my.datos.academico.Persona;
import java.io.Serializable;

public class Solicitud implements Serializable{
    
    private String codigo;
    private Persona solicitante;
    private Estudiante estudiante; 
    private FechaHora fecha; 
    private Curso curso; 
    private int numGrupo;
    private String descripcion; 
    private Object evidencia; 
    private String tipoInconsistencia = "Modificación Acta"; 
    private String pathResolucion; 
    private EstadoEnum estado = EstadoEnum.PENDIENTE; 

    public Solicitud(Persona solicitante, Estudiante estudiante, FechaHora fecha, Curso curso, int numGrupo, String descripcion) {
        this.solicitante = solicitante;
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.curso = curso;
        this.numGrupo = numGrupo;
        this.descripcion = descripcion;
        this.codigo = generarCodigo();
    }

    public Solicitud(String codigo, Persona solicitante, Estudiante estudiante, FechaHora fecha, Curso curso, int numGrupo, String descripcion) {
        this.codigo = codigo;
        this.solicitante = solicitante;
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.curso = curso;
        this.numGrupo = numGrupo;
        this.descripcion = descripcion;
    }

    public Solicitud(Persona solicitante, Estudiante estudiante, FechaHora fecha, Curso curso, int numGrupo, String descripcion, Object evidencia) {
        this.solicitante = solicitante;
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.curso = curso;
        this.numGrupo = numGrupo;
        this.descripcion = descripcion;
        this.evidencia = evidencia;
        this.codigo = generarCodigo();
    }

    public Solicitud(String codigo, Persona solicitante, Estudiante estudiante, FechaHora fecha, Curso curso, int numGrupo, String descripcion, Object evidencia, String pathResolucion) {
        this.codigo = codigo;
        this.solicitante = solicitante;
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.curso = curso;
        this.numGrupo = numGrupo;
        this.descripcion = descripcion;
        this.evidencia = evidencia;
        this.pathResolucion = pathResolucion;
    }

    public Solicitud(String codigo, Persona solicitante, Estudiante estudiante, FechaHora fecha, Curso curso, int numGrupo, String descripcion, String pathResolucion) {
        this.codigo = codigo;
        this.solicitante = solicitante;
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.curso = curso;
        this.numGrupo = numGrupo;
        this.descripcion = descripcion;
        this.pathResolucion = pathResolucion;
    }
       
    public Solicitud(String codigo, Persona solicitante, Estudiante estudiante, FechaHora fecha, Curso curso, int numGrupo, String descripcion, Object evidencia, String pathResolucion,
            String tipoInconsistencia, EstadoEnum estado) {
        this.codigo = codigo;
        this.solicitante = solicitante;
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.curso = curso;
        this.numGrupo = numGrupo;
        this.descripcion = descripcion;
        this.evidencia = evidencia;
        this.pathResolucion = pathResolucion;
        this.tipoInconsistencia = tipoInconsistencia;
        this.estado = estado;
    }
    
    
    private String generarCodigo()
    {
        String uno = fecha.getTime().split(":")[0];
        String dos = fecha.getTime().split(":")[1];
        String tres = fecha.getTime().split(":")[2];
        String milis = String.valueOf(fecha.getDate().getTime());
        return milis+uno+dos+tres;                
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getNumGrupo() {
        return numGrupo;
    }

    public void setNumGrupo(int numGrupo) {
        this.numGrupo = numGrupo;
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

    public FechaHora getFecha() {
        return fecha;
    }

    public void setDate(FechaHora date) {
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
