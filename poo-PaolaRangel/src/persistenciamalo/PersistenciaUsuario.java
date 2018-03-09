/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciamalo;
import java.io.*;

public class PersistenciaUsuario {
    Usuario u;
    //Generamos el metodo para serializar a nuestro usuario

    public void guardar(){
        //Para serializar el primer paso es generar el archivo fisico donde 
        //estara nuestro objeto de tipo usuario
        File file=new File("archivaldo.yo");
        //Despues lo abrimos para escribir sobre el
        try{
         //abrir el archivo y escribir sobre el
         // se le Llama encadenamiento por constructor estan enlazados
         FileOutputStream fos=new FileOutputStream(file);
        //Luego serializamos            
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //Guardamos nuestro usuario
        oos.writeObject(u);
        //Ponemos mensaje
            System.out.println("Objeto guardado con exito!!");
        
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }

    }
    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
   
    public Usuario recobrarUsuario(){
        File file=new File("archivaldo.yo");
        Usuario recobrado=null;
        //El proceso inverso
        try{
             FileInputStream fis=new FileInputStream(file);
             ObjectInputStream ois= new ObjectInputStream(fis);
             recobrado= (Usuario) ois.readObject();
        }catch(Exception e){
            
        }
       return recobrado;
    }
    
}
