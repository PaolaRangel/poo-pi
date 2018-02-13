/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poliejemplo;

public class Gato extends Animal implements ComportamientoAnimal{ // extends ya hay lo de Animal

    @Override
    public void hacerRuido() {
        System.out.println("Miau-miau-miau");
    }
    
}
