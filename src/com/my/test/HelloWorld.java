/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.test;

import com.my.controlador.dto.DTOSolicitud;
import com.my.controlador.gestor.dao.DAOSolicitudes;
import com.my.controlador.singleton.ConfigurationPaths;
import com.my.datos.academico.Curso;
import com.my.datos.academico.Estudiante;
import com.my.datos.academico.Periodo;
import com.my.datos.modificaciones.FechaHora;
import com.my.datos.modificaciones.Solicitud;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ldieg
 */
public class HelloWorld {
    
     public static void main(String args[])
    { 
        try{
            
            crearSolicitud();
            cargarSolicitudes();
                  
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }            
    }
    
     
    public static void crearSolicitud() throws Exception
    {
        
            Estudiante estudiante = new Estudiante("183920212",
                "Giovanni", "Villalobos",
                "gvillalobos@gmail.com", 
                "8291832",
                "2014098812");
            
            String fechaString = "5/22/2017 13:07:21";
            String fecha = fechaString.split("\\s+")[0];
            String tiempo = fechaString.split("\\s+")[1];                    
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaDate = (Date) df.parse(fecha);
            FechaHora fechaHora = new FechaHora(fechaDate, tiempo);
            
            Curso curso = new Curso("IC-5714", "Compiladores",
                    new Periodo(9282, "I Semestre 2017", 2017),
                    4);
            
            int numGrupo = 1;
            
            String descripcion = "Kirstein me bajo puntos y no se porque";
            
            Solicitud solicitud = new Solicitud(estudiante, estudiante, fechaHora, curso, numGrupo, descripcion);           
            
            
            DAOSolicitudes DAOsolicitudes = new DAOSolicitudes();            
            ConfigurationPaths.getInstance().setPathSolicitudesLocal("C:\\Users\\USER\\Desktop\\Solicitudes");                                    
            DAOsolicitudes.salvarSolicitud(DAOsolicitudes.convertirSolicitud(solicitud));
        
    }
     
    public static void cargarSolicitudes() throws Exception{
        DAOSolicitudes DAOsolicitudes = new DAOSolicitudes();
        ConfigurationPaths.getInstance().setPathSolicitudesLocal("C:\\Users\\USER\\Desktop\\Solicitudes");   
         ArrayList<DTOSolicitud> solicitudesCargadas = DAOsolicitudes.cargarSolicitudes();
            
            for(DTOSolicitud dto : solicitudesCargadas)
            {
                Solicitud sol = DAOsolicitudes.convertirDTOSolicitud(dto);
                System.out.println(sol.getCodigo());
                System.out.println(sol.getSolicitante().getNombre() + " " + sol.getSolicitante().getApellidos());
            }                  
    }
    
}
