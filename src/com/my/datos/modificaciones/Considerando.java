package com.my.datos.modificaciones;

public class Considerando {
    
    private int codigo; 
    private String anotacion;

    public Considerando(int codigo, String anotacion) {
        this.codigo = codigo;
        this.anotacion = anotacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }            
}
