/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author T-102
 */
public class TerceraForma {
    public static void main(String[] args) {
        Thread t1= new Thread(new Runnable(){
            public void run(){
                //implementación del método run
                //de la thread pero es abstracta
                System.out.println("Yo soy un thread bueno");
            }
        }//se cierra la interna anonima
        );//se cierra el cursor
        t1.start();
    }//se cierra el método main
    
}//se cierra la clase
