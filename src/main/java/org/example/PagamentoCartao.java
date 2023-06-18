package org.example;

import org.example.Interface.Pagamento;

public class PagamentoCartao extends PagamentoAbstract{

    public PagamentoCartao(Pagamento pagamento){
        super(pagamento);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Cartão de Crédito sendo processado...");
        pagamento.efetuarPagamento();
    }
}
