/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.att.javaocho.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Oracle
 */
public class OrdenarSinLambda {
    
    public static void main(String[] args) {
        List<Persona> clientes = new ArrayList<>();
        
        clientes.add(new Persona("Lety"));
        clientes.add(new Persona("Alberto"));
        clientes.add(new Persona("Carlos"));
        clientes.add(new Persona("Yesica"));
        
        Collections.sort(clientes, new Comparator<Persona>(){
            @Override
            public int compare(Persona c1, Persona c2){
                return c1.getNombre().compareTo(c2.getNombre());
            }
        });
        
        for(Persona cliente : clientes){
            System.out.println(cliente);
        }
    }
    
}
