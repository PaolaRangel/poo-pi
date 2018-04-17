/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

/**
 *
 * @author T-102
 */
public class Alumno {
    
    private String nombre;
    private String paterno;
    private String materno;
    private long cuenta;
    private Examen examen;

    public Alumno(String nombre, String paterno, String materno, long cuenta, Examen examen) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.cuenta = cuenta;
        this.examen = examen;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

  
    
    

   
}
