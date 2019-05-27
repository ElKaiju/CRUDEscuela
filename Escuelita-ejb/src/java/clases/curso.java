/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
/**
 *
 * @author ztx187
 */
public class curso {
    private int idCurso;
    private String nombre;
    private int alumnos;
    private String rutDocente;

    public curso(int idCurso, String nombre, int alumnos, String rutDocente) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.alumnos = alumnos;
        this.rutDocente = rutDocente;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setRutDocente(String rutDocente) {
        this.rutDocente = rutDocente;
    }
   
}
