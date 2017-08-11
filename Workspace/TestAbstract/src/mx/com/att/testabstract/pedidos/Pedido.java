/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.att.testabstract.pedidos;

/**
 *
 * @author Oracle
 */
public abstract class Pedido {
    
    
    protected String pais;
    
    protected double importeSinIVA;
    protected double importeConIVA;
    protected double importeIVA;
    
    protected abstract void calcularIVA();
    
    public void calcularPrecioConIVA(){
        this.calcularIVA();
        this.importeConIVA = importeSinIVA + importeIVA;
    }
    
    public void setImporteSinIVA(double importeSinIVA){
        this.importeSinIVA = importeSinIVA;
    }
    
    public void visualiza(){
        System.out.println("Pedido:");
        System.out.println("Importe sin IVA: " + this.importeSinIVA);
        System.out.println("Importe con IVA: " + this.importeConIVA);
    }
}
