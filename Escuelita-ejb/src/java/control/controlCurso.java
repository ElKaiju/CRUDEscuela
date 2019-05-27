/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import clases.curso;
import java.util.ArrayList;
import javax.ejb.Singleton;

/**
 *
 * @author ztx187
 */
@Singleton
public class controlCurso implements controlCursoLocal {

    private static ArrayList<curso> listaCurso = new ArrayList<>();

    @Override
    public String registrar(int idCurso, String nombre, int alumnos, String rutDocente) {
        
        try{
            listaCurso.add(new curso(idCurso, nombre, alumnos, rutDocente));
            return "Curso agregado con éxito";
        }catch (Exception e){
            return "Error al ingresar curso: "+e.toString();
        }
    }

    @Override
    public curso buscarCurso(int idCurso) {
        for(curso aux : listaCurso){
           if (aux.getIdCurso() == idCurso){
                return aux;
           }
        }
        return null;
    }

    @Override
    public String eliminarCurso(int idCurso) {
        curso c = this.buscarCurso(idCurso);
        
        if (c != null){
            this.listaCurso.remove(c);
            return "Curso eliminado";
        }else{
            return "No se puede eliminar";
        }        
    }

    @Override
    public String modificarCurso(int idCurso, String nombre, int alumnos, String rutDocente) {
        curso c = this.buscarCurso(idCurso);
        
        if (c != null){
            c.setIdCurso(idCurso);
            c.setNombre(nombre);
            c.setAlumnos(alumnos);
            c.setRutDocente(rutDocente);
            
            return "Curso modificado";
        }else {
            return "No se puede modificar curso";
        }
    }  

    @Override
    public ArrayList<curso> getlist() {
        return null;
    }
}
