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
public class DefaultTest{
    
    public static void main(String[] args) {
        
        PersonaA personaA;
        personaA = () -> {System.out.println("Caminar desde A");};
        PersonaB personaB;
        personaB = () -> {System.out.println("Caminar desde B");};
        
        personaA.hablar();
        personaA.caminar();
        personaB.hablar();
        personaB.caminar();
    }
}
