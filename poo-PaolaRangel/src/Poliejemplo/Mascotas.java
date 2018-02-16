/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poliejemplo;
import java.util.*;

public class Mascotas {
    public static void main(String[] args) {
      Animal animales[]=new Animal [12];
        
        //Primero generamos a los gatos
        animales [0]=new Gato();      
        animales [1]=new Gato();    
        animales [2]=new Gato();     
        
        //Siguen los perros
         animales [3]=new Perro();
         animales [4]=new Perro();
         
         //Siguen los patos
         animales [5]=new Pollo();
         animales [6]=new Pollo();
         animales [7]=new Pollo();
         animales [8]=new Pollo();
         animales [9]=new Pollo();
         
         animales[10]=new Raton();
         animales[11]=new Raton();
         
         //La magia del polimorfismo
         //for (ComportamientoAnimal){
         //  System.out.println("");
         ServicioAnimal s=new ServicioAnimal();
         for (Animal a:animales){
             s.servicioHacerRuido((ComportamientoAnimal)a);//expresión expresiva
         }
         //VAMOS A GENERAR UN ARRAYLIST Y PONER OTROS ANIMALES
         ArrayList<Animal> animalitos=new ArrayList<>();
         animalitos.add(new Pollo ());//creación de objetos de forma anonimal
         //new Pollo es lo mismo que Pollo pi= new Pollo()
         animalitos.add(new Raton());
         animalitos.add(new Raton ());
         animalitos.add(new Perro());
         animalitos.add(new Gato());
         for(Animal a: animalitos){
             s.servicioHacerRuido((ComportamientoAnimal)a);
             
         }
         animalitos.get(0).setEdad(1);
         System.out.println(animalitos.get(0).getEdad());
         }
    }
        
         





