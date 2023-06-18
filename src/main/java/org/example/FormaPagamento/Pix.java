package org.example.FormaPagamento;

import org.example.Interface.Pagamento;

public class Pix implements Pagamento {
    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento via pix em andamento...");
        System.out.println("Pagamento via pix aprovado");
    }
}
