package com.my.controlador.gestor.dao;

import com.my.controlador.dto.DTOSolicitud;
import com.my.controlador.singleton.ConfigurationPaths;
import com.my.datos.modificaciones.Solicitud;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DAOSolicitudes {
    
    public void actualizarSolicitud(DTOSolicitud DTOsolicitud) throws Exception
    {
        salvarSolicitud(DTOsolicitud);           
    }
    
    public void salvarSolicitud(DTOSolicitud DTOsolicitud) throws Exception
    {       
        Solicitud solicitud = convertirDTOSolicitud(DTOsolicitud);
        FileOutputStream fileOutputStream = new FileOutputStream(
                ConfigurationPaths.getInstance().getPathSolicitudesLocal() + "\\" + solicitud.getCodigo() + ".sol");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(solicitud);
        fileOutputStream.close();
        objectOutputStream.close();        
    }
    
    private Solicitud convertirDTOSolicitud(DTOSolicitud DTOsolicitud)
    {
        Solicitud solicitud = new Solicitud( 
                DTOsolicitud.getCodigo(),
                DTOsolicitud.getSolicitante(),
                DTOsolicitud.getEstudiante(),
                DTOsolicitud.getFecha(),
                DTOsolicitud.getDescripcion(),
                DTOsolicitud.getEvidencia(),
                DTOsolicitud.getPathResolucion()
        );
        solicitud.setTipoInconsistencia(DTOsolicitud.getTipoInconsistencia());
        solicitud.setEstado(DTOsolicitud.getEstado());         
        return solicitud;
    }
            
    public Solicitud verSolicitud(String codigo) throws Exception
    {
        FileInputStream fileInputStream = new FileInputStream(ConfigurationPaths.getInstance().getPathSolicitudesLocal() + "\\" + codigo + ".sol");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Solicitud solicitud = (Solicitud) objectInputStream.readObject();        
        return solicitud; 
    }          
    
    public ArrayList<DTOSolicitud> cargarSolicitudes() throws Exception
    {
        ArrayList<DTOSolicitud> solicitudesLocales = new ArrayList<>();
        File folder = new File(ConfigurationPaths.getInstance().getPathSolicitudesLocal());
        File[] listaArchivos = folder.listFiles();
        for(int i = 0; i < listaArchivos.length; i++)
        {
            if(listaArchivos[i].isFile()){
                FileInputStream fileInputStream = new FileInputStream(listaArchivos[i]);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                Solicitud solicitud = (Solicitud)objectInputStream.readObject();    
                DTOSolicitud DTOsolicitud = convertirSolicitud(solicitud);
                solicitudesLocales.add(DTOsolicitud);
            }
        }
        return solicitudesLocales;                     
    }
    
    private DTOSolicitud convertirSolicitud(Solicitud solicitud)
    {
        DTOSolicitud DTOsolicitud = new DTOSolicitud( 
                solicitud.getCodigo(),
                solicitud.getSolicitante(),
                solicitud.getEstudiante(),
                solicitud.getFecha(),
                solicitud.getDescripcion(),  
                solicitud.getTipoInconsistencia(),
                solicitud.getEstado()
                );
        return DTOsolicitud;        
    }         
}
