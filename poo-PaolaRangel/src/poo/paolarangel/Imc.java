/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.paolarangel; // Libreria

/**
 *
 * @author T-102
 */
public class Imc {
    Usuario u; //El atributo es de tipo composicion-agregacion
    
    //Metodo
    public String calcular (){ //Clase usuario y imc para calcular
        
        float imc= u.peso/(u.altura*u.altura);
      return "Tu resultado es "+imc ; //Diseño a bajo nivel o detalle return "Aqui resultado" 
    }

    
}
