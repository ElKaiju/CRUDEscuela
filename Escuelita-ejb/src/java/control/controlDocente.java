/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import clases.docente;
import java.util.ArrayList;
import javax.ejb.Singleton;

/**
 *
 * @author ztx187
 */
@Singleton
public class controlDocente implements controlDocenteLocal {
    
    private static ArrayList<docente> listaDocente = new ArrayList<>();

    @Override
    public String registrar(String rut, String nombre, String apellido, int edad, String area) {
        try{
            listaDocente.add(new docente(rut, nombre, apellido, edad, area));
            return "Docente agregado";
        }catch(Exception e){
            return "Error al agregar docente: "+e.toString();
        }  
    }

    @Override
    public docente buscarDocente(String rut) {
        
        for (docente aux : listaDocente){
            if(aux.getRut() == rut){
                return aux;
            }
        }
        return null;
    }

    @Override
    public String eliminarDocente(String rut) {
        docente d = this.buscarDocente(rut);
        
        if (d != null){
            this.listaDocente.remove(d);
            return "Docente eliminado";
        }else{
            return "No se puede eliminar Docente";
        }
    }

    @Override
    public String modificarDocente(String rut, String nombre, String apellido, int edad, String area) {
        docente d = this.buscarDocente(rut);
        
        if (d != null){
            d.setRut(rut);
            d.setNombre(nombre);
            d.setApellido(apellido);
            d.setEdad(edad);
            d.setArea(area);
        
            return "Docente modificado";
        }else{
            return "No se puede modificar el docente";
        }
    }    
}
