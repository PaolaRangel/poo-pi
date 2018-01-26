/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.paolarangel;

/**
 *
 * @author T-102
 */
public class PooPaolaRangel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tenemos que generar antes los objetos de las clases anterior
        
        Usuario x =new Usuario(); //Constructor de defecto 
        x.setAltura(1.50f);//DEFECTO
        x.setPeso(46.200f); //f significa flotante -DEFECTO
        Imc algo =new Imc (); //Calculamos el imc a traves de su objeto
        algo.u=x; //DEFECTO
        System.out.println(algo.calcular());
           //Tipo de retorno String algo.calcular ()
        
        
    }
    
}
