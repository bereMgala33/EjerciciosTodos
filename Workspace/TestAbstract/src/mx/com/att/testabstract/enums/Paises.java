/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.att.testabstract.enums;

/**
 *
 * @author Oracle
 */
public enum Paises {
    MEXICO(0.16f, "www.sat.gob"), 
    ESPAÑA(0.21f),
    ARGENTINA(0.20f), 
    PARIS(0.30f);  
    
    private float iva;
    private String contacto;
    
    private Paises(float iva){
        this.iva = iva;
    }
    
    private Paises(float iva, String contacto){
        this.iva = iva;
        this.contacto = contacto;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    
  
}


