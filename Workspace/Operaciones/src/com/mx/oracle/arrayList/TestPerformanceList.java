/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.oracle.arrayList;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Oracle
 */
public class TestPerformanceList {
    
    public static void main(String[] args) {
        
        long tiempoInicioSinTamanio = System.nanoTime();
        
        List<String> lstStrings2 = new ArrayList();
        
        for(int cont=0; cont <= 10000000; cont ++){
            lstStrings2.add("Registro " + cont+1);
        }
        
        System.out.println("=================================");
        
        long tiempoFinSinTamanio = System.nanoTime();
        
        System.out.println("TOTAL TIEMPO SIN DEFINIR TAMAÑO: " + (tiempoFinSinTamanio - tiempoInicioSinTamanio));
        
        long tiempoInicioTamanio = System.nanoTime();
        
        List<String> lstStrings = new ArrayList(10000000);
        
        for(int cont=0; cont <= 10000000; cont ++){
            lstStrings.add("Registro " + cont+1);
        }
        
        long tiempoFinTamanio = System.nanoTime();
        
        System.out.println("TOTAL TIEMPO DEFINIENDO TAMAÑO: " + (tiempoFinTamanio - tiempoInicioTamanio));
        
    }
    
}
