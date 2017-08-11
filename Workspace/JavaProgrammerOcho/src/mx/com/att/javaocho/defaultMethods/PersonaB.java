/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.att.javaocho.defaultMethods;

/**
 *
 * @author Oracle
 */
public interface PersonaB {
    
    public void caminar();
    
    default public void hablar(){
        System.out.println("Hablando desde Persona B.");
    }
    
}
