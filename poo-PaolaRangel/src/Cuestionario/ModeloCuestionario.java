/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;
import java.util.*;


public class ModeloCuestionario {
    ArrayList<Pregunta>preguntas;
    
    public ModeloCuestionario(){
        //Aqui generamos nuestro cuestionario
        
        preguntas= new ArrayList<>(); //Inicializar el arreglo
    }
    public void agregarPregunta(Pregunta p){
        preguntas.add(p);
    }
    public ArrayList<Pregunta>obtenerCuestionario(){
        return preguntas;
    }
}
