/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poliejemplo;

/**
 *
 * @author T-102
 */
public class Pollo extends Animal implements ComportamientoAnimal{//sobreescribir dar cuerpo al metodo hacerRuido
    @Override
    public void hacerRuido(){
        System.out.println("Pio-pio-pio");
    }
}
