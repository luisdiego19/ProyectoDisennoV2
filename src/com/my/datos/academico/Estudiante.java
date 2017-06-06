package com.my.datos.academico;

public class Estudiante extends Persona {
    
    private String carnet;
    
    public Estudiante(String ID, String Nombre, String Apellidos, String Correo, String Telefono) {
        super(ID, Nombre, Apellidos, Correo, Telefono);
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String Carnet) {
        this.carnet = Carnet;
    }            
}
