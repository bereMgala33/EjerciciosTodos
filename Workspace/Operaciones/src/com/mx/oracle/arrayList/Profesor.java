/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.oracle.arrayList;

import java.util.Objects;

/**
 *
 * @author Oracle
 */
public class Profesor extends Persona{ 
    
       public String especialidad;
       
       public Profesor(){}
       
       public Profesor(String nombre, int edad, String especialidad){
           this.nombre = nombre;
           this.edad = edad;
           this.especialidad = especialidad;
       }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.especialidad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profesor other = (Profesor) obj;
        if (!Objects.equals(this.especialidad, other.especialidad)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", edad=" + edad + ", especialidad=" + especialidad + '}';
    }
    
       
       
    
}
