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
       
        ArrayList<Opcion> opciones=new ArrayList<>();
        
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
    
        //Creamos la pregunta
        Pregunta pl=new Pregunta();
        pl.setTitulo("¿Cual es el principal causante de cancer?");
        pl.setOpciones(opciones);
        
        Opcion opc1=new Opcion ("Sida", false);
        Opcion opc2=new Opcion ("Cáncer", false);
        Opcion opc3=new Opcion ("Influencia", false);
        Opcion opc4=new Opcion ("Diabetes", true);
        
        ArrayList<Opcion> opciones2=new ArrayList<>();
        
        opciones2.add(opc1);
        opciones2.add(opc2);
        opciones2.add(opc3);
        opciones2.add(opc4);
        
        Pregunta p2=new Pregunta();
        p2.setTitulo("¿Cual es el principal causante de muerte en México?");
        p2.setOpciones(opciones2);
        
        Opcion opci1=new Opcion ("Gripa", false);
        Opcion opci2=new Opcion ("Dolor de cabeza", false);
        Opcion opci3=new Opcion ("Insomnio", false);
        Opcion opci4=new Opcion ("Dolor en el pecho", true);
        
        ArrayList<Opcion> opciones3=new ArrayList<>();
        
        opciones3.add(opci1);
        opciones3.add(opci2);
        opciones3.add(opci3);
        opciones3.add(opci4);
        
        Pregunta p3=new Pregunta();
        p3.setTitulo("¿Cuáles son los signos de alerta de un ataque cardíaco?");
        p3.setOpciones(opciones3);
       
        //Generamos el modelo
        ModeloCuestionario modelo=new ModeloCuestionario();
        modelo.agregarPregunta(pl);
        modelo.agregarPregunta(p2);
        modelo.agregarPregunta(p3);
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


       

    
    
    

        
    

    

