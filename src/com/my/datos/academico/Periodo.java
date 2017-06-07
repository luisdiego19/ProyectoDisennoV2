package com.my.datos.academico;

import java.io.Serializable;

public class Periodo implements Serializable{
    
    private int codigo; 
    private String nombre;
    private int anno; 

    public Periodo(int codigo, String nombre, int anno) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anno = anno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
                        
}
