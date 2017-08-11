/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.oracle.arrayList.ordenar;

/**
 *
 * @author Oracle
 */
public class Alumno implements Comparable<Alumno>{
    
    private String nombre;
    private Integer edad;

    public Alumno(){}
    
    public Alumno(String nombre, Integer edad){
      this.nombre = nombre;
      this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Alumno t) {
           return this.edad.compareTo(t.edad);
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + '}';
    } 
    
}
