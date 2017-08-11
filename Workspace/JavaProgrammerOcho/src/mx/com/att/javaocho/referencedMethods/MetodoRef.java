/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.att.javaocho.referencedMethods;

import java.util.Arrays;

/**
 *
 * @author Oracle
 */
public class MetodoRef {
    
    public static void main(String[] args) {
        MetodoRef.referenciaMetodosObjetos();
    }
    public static void referenciaMetodosObjetos(){
        String[] nombres = {"Armando", "Zuri", "Gerardo"};
        
       /*  Arrays.sort(nombres, new Comparator<String>(){
           @Override
           public int compare(String s1, String s2){
                return s1.compareTo(s2);
           }  
        });*/
       
       Arrays.sort(nombres, String::compareToIgnoreCase);
       
       for(String nombre: nombres){
           System.out.println(nombre);
       }
    }
    
}
