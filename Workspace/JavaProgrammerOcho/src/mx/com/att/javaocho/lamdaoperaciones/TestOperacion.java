/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.att.javaocho.lamdaoperaciones;

/**
 *
 * @author Oracle
 */
public class TestOperacion {
    
    public static void main(String[] args) {
        
        TestOperacion test = new TestOperacion();
        
    }

    public TestOperacion() {
        Operacion operacion = (double x, double y) -> (x+y)/2;
        System.out.println(operacion.calcularPromedio(10, 20));
    }
    
}
