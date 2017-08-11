/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.client;

import com.oracle.consultas.personalexception.MiException;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Oracle
 */
public class SalsaBaile {
    
    public static void main(String[] args) {
        try{
          SalsaBaile.validarEntrar("Juan",17);
        }catch(MiException ex){
            StringBuilder strBuild = new StringBuilder();
            strBuild.append( "Fecha: " ).append(ex.getDate());
            strBuild.append(" | Código error:").append(ex.getCode());
            strBuild.append(" | Descripción: ").append( ex.getDescription());
            strBuild.append(" | MensajeEx: ").append(ex.getMessage());
            JOptionPane.showMessageDialog(null, strBuild.toString());
        }
    }
    
    public static boolean validarEntrar(String name, int edad) throws MiException{
           boolean edadValida = false;
        if(edad >= 18){
            System.out.println("Bienvenido " + name);
            edadValida = true;
        }else{
            throw new MiException(500, "Ocurre cuando un menor de edad quiere entrar al bar", Calendar.getInstance().getTime(), "Intenta entrar un menor de edad");
        }
        return edadValida;
    }
    
    
    
}
