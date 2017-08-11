/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.oracle.arrayList.ordenar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Oracle
 */
public class TestOrderList {
    
    public static void main(String[] args) {
           ArrayList<Alumno> lstAlumnos = new ArrayList<>();
           
           lstAlumnos.add(new Alumno("Juan", 34));
           lstAlumnos.add(new Alumno("Armando", 25));
           lstAlumnos.add(new Alumno("Saúl", 40));
           lstAlumnos.add(new Alumno("Berenice", 33));
           
           System.out.println("LISTA SIN ORDENAR");
           for(Alumno alumno: lstAlumnos){
               System.out.println(alumno.toString());
           }
           
           Collections.sort(lstAlumnos);
           
           System.out.println("============");
           System.out.println("LISTA ORDENADA POR EDAD...");
           for(Alumno alumno: lstAlumnos){
               System.out.println(alumno.toString());
           }
    
    }
    
}
