package org.example.FormaPagamento;

import org.example.Interface.Pagamento;

public class CartaoCredito implements Pagamento {

    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento via Cartão de Crédito em andamento...");
        System.out.println("Pagamento via Cartão de Crédito aprovado!");
    }
}
