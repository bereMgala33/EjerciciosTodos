/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.att.javaocho.defaultMethods;

/**
 *
 * @author Oracle
 */
public class OperacionTest {
    public static void main(String[] args) {
        double valor = OperacionTest.operar(10, 50);
        
        System.out.println("Resultado: " + valor);
    }
    
    public static double operar(double x, double y){
        Operacion op = (double d1, double d2) -> { return d1+d2;};
        return op.calcular(x, y);
    }
}
