
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
public interface IPersona {
    
    String NACIONALIDAD = "Mexicana";
    
    public void comer(String comida);
    
    public void reproducirse (String persona);
    
    public default void trabajar(String trabajo){
        System.out.println(trabajo);
    }
}
