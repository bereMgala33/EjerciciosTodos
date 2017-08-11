/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.att.testabstract.persona;

/**
 *
 * @author Oracle
 */
public abstract class PersonaAbstract {
    
    public abstract void metodoAbstract();
    
    public void metodoConcretoEnAbstract(){
         System.out.println("metodo concreto en Abstract");
    }
    
}
