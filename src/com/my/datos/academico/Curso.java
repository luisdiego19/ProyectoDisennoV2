package com.my.datos.academico;

import java.util.ArrayList;

public class Curso {
    
    private String codigo;
    private String nombre;
    private ArrayList<Grupo> grupos; 
    private Periodo perido; 
    private int credigos; 

    public Curso(String codigo, String nombre, ArrayList<Grupo> grupos, Periodo perido, int credigos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.grupos = grupos;
        this.perido = perido;
        this.credigos = credigos;
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

    public int getCredigos() {
        return credigos;
    }

    public void setCredigos(int credigos) {
        this.credigos = credigos;
    }
    
    
    
}
