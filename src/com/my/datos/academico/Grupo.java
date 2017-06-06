package com.my.datos.academico;

import java.util.ArrayList;

public class Grupo {
    
    private int numero;
    private Profesor profesor; 
    private ArrayList<Estudiante> estudiante;

    public Grupo(int numero, Profesor profesor, ArrayList<Estudiante> estudiante) {
        this.numero = numero;
        this.profesor = profesor;
        this.estudiante = estudiante;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(ArrayList<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }
    
        
}
