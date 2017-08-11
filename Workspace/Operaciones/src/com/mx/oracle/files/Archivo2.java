/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.oracle.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Oracle
 */
public class Archivo2 {
    public static void main(String[] args) {
        File file = new File("C:/BMG/Archivo2.txt");
        
        try {
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(file);
            
            pw.println("Producto: Lavadora");
            pw.println("Precio: 10000");
            
            pw.flush();
            pw.close();
            
            FileReader fr= new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String data = br.readLine();
            
            System.out.println(data);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
