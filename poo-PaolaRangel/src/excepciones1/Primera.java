/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones1;

/**
 *
 * @author T-102
 */
public class Primera {
    public static void main(String[] args) {
        
        //Vamos a crear un arreglo
        int [] valores={2,6,-8,5};
        
        for(int i=0;i<=valores.length;i++){
           // System.out.println("valor "+valores[i]);
            
        }
        //Esta excepción es muy truculenta
       // int x=5; int aritmetica
        float x=5; // racional infity
        int y=0;
       // System.out.println(x/y); ArithmeticException con int
       int z=Integer.parseInt("x"); //parse excepcion a veces
        System.out.println(z*2);//NumberFormatException z no es un numero
    }
    
}
