/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

import java.io.File;
import java.io.ObjectInput;
import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class PersistenciaAlumno {
    ArrayList<Alumno> alumnos;
    public PersistenciaAlumno(){
        alumnos=new ArrayList<>();
    }
    public ArrayList<Alumno> leerTodos(){
        File file= new File("alumnos");
        ObjectInputStream ois= new ObjectInputStream(fis);
    }catch(Exception e){
    
}
}
