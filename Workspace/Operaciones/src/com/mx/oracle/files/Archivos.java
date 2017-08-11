/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.oracle.files;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oracle
 */
public class Archivos {
    
    public static void main(String[] args) {
        File file = new File("C:/BMG/Registro.txt");
        char[] in = null;
        
        
        if(!file.exists()){
            try {
                if(file.createNewFile()){
                    System.err.println("Se creo exitosamente continua el trabajo.");
                }else{
                    System.out.println("No se creo el archivo.");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else{
            System.out.println("El archivo ya existe.");
        }
        
        //ESCRIBIR EN ARCHIVO
        FileWriter fw;
        try {
            fw = new FileWriter(file);
            fw.write("..Escribiendo en mi archivo Registro.");
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        //LEER EL CONTENIDO DEL ARCHIVO
        FileReader fr;
        try {
            fr = new FileReader(file);
            in = new char[100];
            int size = fr.read(in);
            System.out.println("size:: " + size);
             
             
             for(char c: in){
                 System.out.println(c);
             }
        } catch (FileNotFoundException exNotFound) {
            exNotFound.printStackTrace();
        } catch (IOException exIO) {
            exIO.printStackTrace();
        }
       
        
    }
    
}
