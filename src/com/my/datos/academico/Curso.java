package com.my.datos.academico;

import java.io.Serializable;
import java.util.ArrayList;

public class Curso implements Serializable{
    
    private String codigo;
    private String nombre;
    private ArrayList<Grupo> grupos; 
    private Periodo perido;
    private int creditos;

    public Curso(String codigo, String nombre, Periodo perido, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.perido = perido;
        this.creditos = creditos;
    }
        
    public Curso(String codigo, String nombre, ArrayList<Grupo> grupos, Periodo perido, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.grupos = grupos;
        this.perido = perido;
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Periodo getPerido() {
        return perido;
    }

    public void setPerido(Periodo perido) {
        this.perido = perido;
    }

    public int getCretigos() {
        return creditos;
    }

    public void setCreditos(int credigos) {
        this.creditos = credigos;
    }
    
    
    
}
