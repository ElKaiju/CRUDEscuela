/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import clases.docente;
import javax.ejb.Local;

/**
 *
 * @author ztx187
 */
@Local
public interface controlDocenteLocal {

    String registrar(String rut, String nombre, String apellido, int edad, String area);

    docente buscarDocente(String rut);

    String eliminarDocente(String rut);

    String modificarDocente(String rut, String nombre, String apellido, int edad, String area);
    
}
