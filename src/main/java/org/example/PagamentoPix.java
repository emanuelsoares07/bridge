package org.example;

import org.example.Interface.Pagamento;

public class PagamentoPix extends PagamentoAbstract{

    public PagamentoPix(Pagamento pagamento){
        super(pagamento);
    }

    @Override
    public void processarPagamento(){
        System.out.println("Pagamento via pix sendo processado...");
        pagamento.efetuarPagamento();
    }
}
