/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.oracle.arrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Oracle
 */
public class TestArrayList {
    
    public static void main(String[] args) {
         
        ArrayList<Persona> lstPersona = new ArrayList();
        
        Profesor  profesor1 = new Profesor("Angelica", 40, "Físico Matemáticas");
        Profesor  profesor2 = new Profesor("Micaela", 50, "Ciencias Sociales");
        
        Persona persona1 = new Persona ("Josue", 35);
        
        lstPersona.add(persona1);
        lstPersona.add(profesor1);
        lstPersona.add(profesor2);
        
        System.out.println("Lista SIN ordenar:: ");
        for(Persona persona : lstPersona){
            System.out.println(persona.toString());
        }

        ArrayList<String> lstStrings = new ArrayList();
       
        //TODO revisar como se define en base a qué atributo
       // Collections.sort(lstNombre,);
        
        
    }
    
}
