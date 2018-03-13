/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author T-102
 */
public class PersistenciaEmpleado {
    ArrayList<Empleado> empleados;//atributo
    
    public PersistenciaEmpleado(){ // constructor de defecto este hace algo
        empleados= new ArrayList<>();
    }

    public void guardar(Empleado e){
        
        File file=new File("empleados.yo"); //cualquier nombre
        if (file.exists ()){
          empleados=  buscarTodos();
        }
        //Despues lo abrimos para escribir sobre el
        try{
         //abrir el archivo y escribir sobre el
         // se le Llama encadenamiento por constructor estan enlazados
        FileOutputStream fos=new FileOutputStream(file);
        //Luego serializamos            
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //Guardamos nuestro usuario
        empleados.add(e);
        oos.writeObject(empleados);
        //Ponemos mensaje
            System.out.println("Objeto guardado con exito!!");
        
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            
        }

    }

    public ArrayList<Empleado> buscarTodos (){
        File file= new File("empleados.yo");
        try{
            FileInputStream fis= new FileInputStream(file);
                ObjectInputStream ois= new ObjectInputStream(fis);
                empleados=(ArrayList < Empleado >)ois.readObject();
        }catch(Exception e){
            
        }
        return empleados;
    }
}
