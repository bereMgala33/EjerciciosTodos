/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.att.javaocho.referencedMethods;

/**
 *
 * @author Oracle
 */
@FunctionalInterface
public interface IPersona {
    
    public Persona crear(int id, String nombre);
    
}
