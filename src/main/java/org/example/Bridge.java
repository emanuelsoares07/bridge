package org.example;

import org.example.FormaPagamento.CartaoCredito;
import org.example.FormaPagamento.Pix;
import org.example.Interface.Pagamento;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecion o método de pagamento:");
        System.out.println("1 - Cartão de Crédito");
        System.out.println("2 - Pix");

        int instrucao = scanner.nextInt();

        Pagamento impl = (instrucao == 1) ? new CartaoCredito() : (instrucao == 2) ? new Pix() : null;
        PagamentoAbstract pagamento = (instrucao == 1) ? new PagamentoCartao(impl) : (instrucao == 2) ? new PagamentoPix(impl) : null;

        if(pagamento != null) {
            pagamento.processarPagamento();
        }else {
            System.out.println("Opção inválida!");
        }

    }
}
