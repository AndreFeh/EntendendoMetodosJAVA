package MaosNaMassa;

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
//    4 operacoes basicas com 2 valores cada
//    a partir da hora do dia, informar bom dia/tarde/noite
//    valor final de um emprestimo a partir do valor solicitado(considerando taxa sobre parcelas) DEFINIR FAIXARS QUE INFLUENCIAM OS VALORES

//    FINALIDADE... MOSTRAR AS COMUNICAÇÕES ENTRE OS METODOS

        //Mensagem
        System.out.println("Exercicio Mensagens");
        Mensagem.mensagem(5);
        Mensagem.mensagem(07);
        Mensagem.mensagem(80);
        Mensagem.mensagem(15);
        Mensagem.mensagem(22);

        //Financiamento
        System.out.println("Exercicio Financiamento");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
