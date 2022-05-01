package MaosNaMassa;

import java.util.Scanner;

public class Calculadora {
    //    4 operacoes basicas com 2 valores cada
//    a partir da hora do dia, informar bom dia/tarde/noite
//    valor final de um emprestimo a partir do valor solicitado(considerando taxa sobre parcelas) DEFINIR FAIXARS QUE INFLUENCIAM OS VALORES

    public static void calculadora(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor a ser calculado: ");
        int dados = scan.nextInt();
        int dados2 = scan.nextInt();

        int i = dados;
        int j = dados2;

        int soma = i + j, subtracao = i - j, divisao = i / j, multiplicacao = i * j;

        System.out.println(i + " + " + j + " = " + soma);
        System.out.println(i + " - " + j + " = " + subtracao);
        System.out.println(i + " / " + j + " = " + divisao);
        System.out.println(i + " x " + j + " = " + multiplicacao);

    }
}