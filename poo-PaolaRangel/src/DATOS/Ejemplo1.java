/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

/**
 *
 * @author T-102
 */
public class Ejemplo1 {
    
    public static void main(String[] args) {
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        //prmocion o casting
        b=(byte)l;//promocion a un tipo de datos forzado
        i=s;//procion directa
        s=b;//procion directa
        s=(short)i;//casting forzada
        i=(int)l;//casting forzada
        
        float f=2.0f;//f para ponerlo como flotante
        double d=2.0;//defecto
        f=(float)d;
        d=f;
        
        char ch='h';
        String x="Hola"; 
        String y="45";//Texto primitivo
        String z="43.2";
        
        float w=Integer.parseInt(y)+Float.parseFloat(z);
        
        
      
    }
    
}
