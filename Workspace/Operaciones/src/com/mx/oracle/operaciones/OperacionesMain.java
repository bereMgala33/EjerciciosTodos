/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.oracle.operaciones;

/**
 *
 * @author Oracle
 */
public class OperacionesMain {
    
        public static void main(String[] args) {
            Operaciones op = new Operaciones();
            int resultadoSuma = op.sumar(5, 4);
            
            System.out.println("El resultado de la suma es: " + resultadoSuma);
            
            int resultadoResta = op.restar(10, 3);
            
            System.out.println("El resultado de la resta es: " + resultadoResta);
            
            
    }
}
