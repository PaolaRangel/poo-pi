/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.paolarangel;

public class ValidarCantidades {
    
    public static void ValidarValorNegativo(float valor)throws NumeroNegativoException {
        if(valor<0) throw new NumeroNegativoException();
        
        
    }
    
}
