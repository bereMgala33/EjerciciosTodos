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
public class Lavadora extends LineaBlanca{

    @Override
    public void tareaDomestica() {
        System.out.println("Lavar ropa...");
    }

    @Override
    public void encender() {
        System.out.println("Encendido automático...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar cuando termine de lavar...");
    }
    
}
