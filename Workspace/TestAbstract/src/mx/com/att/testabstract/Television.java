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
public class Television extends LineaBlanca{

    @Override
    public void encender() {
        System.out.println("Encender como un televisor");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar como televisor");

    }

    @Override
    public void tareaDomestica() {
        System.out.println("Ver Netflix");
    }
    
}
