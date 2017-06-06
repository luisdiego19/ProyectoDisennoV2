package com.my.datos.academico;

public class Persona {
    
    private String ID;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono; 

    public Persona(String ID, String Nombre, String Apellidos, String Correo, String Telefono) {
        this.ID = ID;
        this.nombre = Nombre;
        this.apellidos = Apellidos;
        this.correo = Correo;
        this.telefono = Telefono;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.apellidos = Apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String Correo) {
        this.correo = Correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String Telefono) {
        this.telefono = Telefono;
    }
    
    
    
}
