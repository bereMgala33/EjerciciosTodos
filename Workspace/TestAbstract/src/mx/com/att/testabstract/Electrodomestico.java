/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.att.testabstract;

/**
 *
 * @author Oracle
 */
public abstract class Electrodomestico {
    
    public String name;
    
    
    public void medirEnergiaElectrica(){
    }
            
    public abstract void encender();
    
    
    public abstract  void apagar();
  
}
