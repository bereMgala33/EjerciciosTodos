/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.oracle.serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Oracle
 */
public class TestGato {
    
    public static void main(String[] args) {
        Gato benito = new Gato();
        benito.setNombre("Benito");
        benito.setRaza("Angora");
        /*
        try {
            FileOutputStream fs = new FileOutputStream("C:/BMG/testSer.ser");
            ObjectOutputStream os;
                 os = new ObjectOutputStream(fs);
                 os.writeObject(benito);
                 os.close();
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException exIO) {
           exIO.printStackTrace();
        }*/
        try {
            FileInputStream fis = new FileInputStream("C:/BMG/testSer.ser");
            ObjectInputStream objIS = new ObjectInputStream(fis);
            Gato nuevoGato = (Gato) objIS.readObject();
            System.out.println("::: Gato recuperado: " + nuevoGato.toString());
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException exIO) {
            exIO.printStackTrace();
        } catch (ClassNotFoundException exNotFound) {
            exNotFound.printStackTrace();
        }
        
        
    }
    
}
