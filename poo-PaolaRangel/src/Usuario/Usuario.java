/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

/**
 *
 * @author T-10B
 */
public class Usuario {
    String nombre;
    String ocupacion;
    String lugar_estudio;
    String profesion;
    float peso;
    float altura;
    int edad;

    Usuario(String paola) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Usuario(String paola, String estudiante, String unitec, String no, int i, double d, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getLugar_estudio() {
        return lugar_estudio;
    }

    public void setLugar_estudio(String lugar_estudio) {
        this.lugar_estudio = lugar_estudio;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String edad (){
     
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
        return null;
    }
    public String profesion(){
        if(profesion=="si"){
            System.out.println("Tienes una profesión");
        }
        else{
            System.out.println("No tienes una profesión");
        }
        return null;
    }
}
