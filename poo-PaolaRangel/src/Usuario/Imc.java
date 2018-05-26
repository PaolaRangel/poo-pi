/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

/**
 *
 * @author T-10B
 */
public class Imc {
    Usuario u; //El atributo es de tipo composicion-agregacion
    
    //Metodo
    public String calcular (){ //Clase usuario y imc para calcular
        
        String retornar;
        float IMC= u.getPeso()/(u.getAltura()*u.getAltura());
      //return "Tu IMC es "+imc ; //Diseño a bajo nivel o detalle return "Aqui resultado" 
      	if (IMC >= 0 && IMC <= 18.5) {
		 retornar=("Peso insuficiente"); 
	}
	else if (IMC >= 18.5 && IMC <= 25) {
		 retornar=("Peso adecuado");
	}
	else if (IMC >= 25 && IMC <= 27) {
		 retornar=("sobrepeso grado I"); 
	}
	else if (IMC >= 27 && IMC <=30 ) {
		 retornar=("Sobrepeso grado II");  
	}
	else if (IMC >= 30 && IMC <= 35) {
		retornar=("Obesidad de tipo I");  
	}
	else if (IMC >= 35 && IMC <= 40) {
		retornar=("Obesidad de tipo II"); 
	}
	else if (IMC >= 40 && IMC <= 50) {
		retornar=("Obesidad de tipo II (morbida)");
	}
	else if (IMC >50) {
		retornar=("Obesidad de tipo IV");  
	}
	else {
		retornar=("Fuera de rango- Verifica tus datos"); 
	}
        return retornar;
    }
    public static void main(String[] args) {
        Usuario u=new Usuario("Paola","Estudiante","UNITEC","no",47,1.50,20);
        Imc algo= new Imc ();
        System.out.println(algo.calcular());
        
    }
}

