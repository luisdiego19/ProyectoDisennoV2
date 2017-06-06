package com.my.datos.modificaciones;

import java.util.ArrayList;

public class Resolucion {
    
    private String numero;
    private ArrayList<Considerando> considerandos;
    private String resultadoUnico; 
    private String resuelvo;

    public Resolucion(ArrayList<Considerando> considerandos, String resultadoUnico, String resuelvo) {
        this.considerandos = considerandos;
        this.resultadoUnico = resultadoUnico;
        this.resuelvo = resuelvo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Considerando> getConsiderandos() {
        return considerandos;
    }

    public void setConsiderandos(ArrayList<Considerando> considerandos) {
        this.considerandos = considerandos;
    }

    public String getResultadoUnico() {
        return resultadoUnico;
    }

    public void setResultadoUnico(String resultadoUnico) {
        this.resultadoUnico = resultadoUnico;
    }

    public String getResuelvo() {
        return resuelvo;
    }

    public void setResuelvo(String resuelvo) {
        this.resuelvo = resuelvo;
    }                
}
