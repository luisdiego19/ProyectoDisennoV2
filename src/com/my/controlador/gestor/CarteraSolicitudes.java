package com.my.controlador.gestor;
import com.my.controlador.gestor.dao.DAOSolicitudes;
import java.util.ArrayList;


public class CarteraSolicitudes extends GestorGeneral {
         
    @Override
    public boolean agregar(Object object) {
       return true; 
    }

    @Override
    public boolean consultar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Object object) {
       return true; 
    }

    @Override
    public boolean eliminar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList cargarDatos() {        
        return null; 
    }
               
}
