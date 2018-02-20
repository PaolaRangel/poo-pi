/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;
import java.util.*;

public class AplicacionCuestionario {
    public static void main(String[] args) {
        //Gneramos primero las opciones
        Opcion op1=new Opcion ("Grasa", false);
        Opcion op2=new Opcion ("Contaminacion", false);
        Opcion op3=new Opcion ("Sol", false);
        Opcion op4=new Opcion ("Azucar", true);
        ArrayList<Opcion> opciones;
        opciones=new ArrayList<>();
        
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
        //Creamos la pregunta
        Pregunta pl=new Pregunta();
        pl.setTitulo("¿Cual es el principal causante de cancer?");
        pl.setOpciones(opciones);
        
        //Generamos el modelo
        ModeloCuestionario modelo=new ModeloCuestionario();
        modelo.agregarPregunta(pl);
        ArrayList<Pregunta> c= modelo.obtenerCuestionario();
        
        //Iteremoslo
        for(Pregunta p: c){
            System.out.println(p.getTitulo());
            for(Opcion o: p.getOpciones()){
                System.out.println(o.getTitulo()+" "+o.isCorrecta());
            }
        }
        
        
    }
    
}
