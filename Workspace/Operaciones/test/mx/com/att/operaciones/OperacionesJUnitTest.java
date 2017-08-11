package mx.com.att.operaciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mx.oracle.operaciones.Operaciones;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Oracle
 */
public class OperacionesJUnitTest {
    
    public OperacionesJUnitTest() {
    }
    
    @Test
   public void testOperaciones(){
       Operaciones op = new Operaciones();
       int resultado = op.sumar(5, 4);
       
       Assert.assertEquals(9, resultado);
   }
}
