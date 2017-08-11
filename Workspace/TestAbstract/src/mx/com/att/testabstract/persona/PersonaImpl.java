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
public class PersonaImpl implements IPersona{

    @Override
    public void comer(String comida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reproducirse(String persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void trabajar(String trabajo){
        System.out.println("este es el trabajo sobreescrito");
    }
    
}
