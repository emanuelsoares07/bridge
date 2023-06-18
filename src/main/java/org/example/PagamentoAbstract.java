package org.example;

import org.example.Interface.Pagamento;

public abstract class PagamentoAbstract {
    protected Pagamento pagamento;

    public PagamentoAbstract(Pagamento pagamento){
        this.pagamento = pagamento;
    }
        public abstract void processarPagamento();

}
