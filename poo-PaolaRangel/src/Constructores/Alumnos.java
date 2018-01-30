/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

/**
 *
 * @author T-102
 */
public class Alumnos {
    private String Nombre;
    private int Edad;
    private boolean Aprobado;


    public Alumnos (int x){
        
    }
    
    public void setAprobado(boolean Aprobado) {
        this.Aprobado = Aprobado;
    }

    public boolean isAprobado() {
        return Aprobado;
    }
    

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}
