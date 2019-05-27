/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import clases.curso;
import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author ztx187
 */
@Local
public interface controlCursoLocal {

    String registrar(int idCurso, String nombre, int alumnos, String rutDocente);

    curso buscarCurso(int idCurso);

    String eliminarCurso(int idCurso);

    String modificarCurso(int idCurso, String nombre, int alumnos, String rutDocente);

    ArrayList<curso> getlist();

}
