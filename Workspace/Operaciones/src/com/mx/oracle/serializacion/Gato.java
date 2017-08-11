/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.oracle.serializacion;

import java.io.Serializable;

/**
 *
 * @author Oracle
 */
public class Gato implements Serializable{
    
    
    private static final long serialVersionUID = -724408345388200680L;
    private String nombre;
    private String raza;

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
    
}
