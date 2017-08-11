/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.att.testabstract.pedidos;

import mx.com.att.testabstract.enums.Paises;

/**
 *
 * @author Oracle
 */
public class PedidoEspania extends Pedido{
    
    @Override
    protected void calcularIVA() {
            this.pais = Paises.ESPAÑA.toString();
            importeIVA = importeSinIVA * Paises.ESPAÑA.getIva();
    }

}
