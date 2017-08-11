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
public class Usuario {
    
    public static void main(String[] args) {
        
        System.out.println("\n======== Pedido MÉXICO ==========");
        Pedido pedidoMexico = new PedidoMexico();
            pedidoMexico.setImporteSinIVA(10000);
            pedidoMexico.calcularPrecioConIVA();
            pedidoMexico.visualiza();
            System.out.println("\n======= Pedido ESPAÑA ===========");
            
        Pedido pedidoEspania = new PedidoEspania();
            pedidoEspania.setImporteSinIVA(10000);
            pedidoEspania.calcularPrecioConIVA();
            pedidoEspania.visualiza();
    }
    
}
