/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.att.javaocho.streams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oracle
 */
public class StreamsApp {
    
    private List<String> lista;
    private List<String> numeros;
    
    public StreamsApp(){
        lista = new ArrayList<>();
        lista.add("Juan");
        lista.add("Javier");
        lista.add("Rosaura");
        lista.add("Angelica");
        
        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
    }
    
    public void filtrar(){
        lista.stream().filter(x -> x.startsWith("J")).forEach(System.out::println);
    }
    
    public void ordenar(){
        lista.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
    }
    
    public void limitar(){
    
    }
    
    public static void main(String[] args) {
         StreamsApp streamApp = new StreamsApp();
         
            streamApp.filtrar();
    }
}
