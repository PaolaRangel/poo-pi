/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion2;

/**
 *
 * @author T-102
 */
public class Empleado {
    String nombre;
    String peterno;
    String materno;
    float sueldoBase;
    String departamento;
    
    @Override
   public String toString() {
       return "Empleado{" + "nombre=" + nombre + ", peterno=" + peterno + ", materno=" + materno + ", sueldoBase=" + sueldoBase + ", departamento=" + departamento + '}';
    }

    public Empleado() {
    }

    public Empleado(String nombre, String peterno, String materno, float sueldoBase, String departamento) {
        this.nombre = nombre;
        this.peterno = peterno;
        this.materno = materno;
        this.sueldoBase = sueldoBase;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeterno() {
        return peterno;
    }

    public void setPeterno(String peterno) {
        this.peterno = peterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
