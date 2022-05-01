package MaosNaMassa;

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {

        return 3;
    }

    public static double getTaxaDuasParcelas() {

        return 0.3;
    }

    public static double getTaxaTresParcelas() {

        return 0.45;
    }

//    FINALIDADE... MOSTRAR AS COMUNICAÇÕES ENTRE OS METODOS
    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }

    }
}



// Feito de forma incorreta VVVVVVVVVVVVVV

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Digite o valor a ser calculado: ");
//        int dados = scan.nextInt();
//        int dados2 = scan.nextInt();
//
//        int i = dados;
//        int j = dados2;
//
//        int soma = i + j, subtracao = i - j, divisao = i / j, multiplicacao = i * j;
//
//        System.out.println(i + " + " + j + " = " + soma);
//        System.out.println(i + " - " + j + " = " + subtracao);
//        System.out.println(i + " / " + j + " = " + divisao);
//        System.out.println(i + " x " + j + " = " + multiplicacao);
//
//
//        int vlrInicialEmprestimo, parcelas;
//        float taxas;
//
//        System.out.println("Qual o valor do emprestimo");
//        vlrInicialEmprestimo = scan.nextInt();
//
//        System.out.println("Quantas parcelas");
//        parcelas = scan.nextInt();
//
//        System.out.println("Qual a taxa");
//        taxas = scan.nextFloat();
//
//        int valorParcelas = vlrInicialEmprestimo / parcelas;
//        float porcentagem = taxas / 100;
//        float taxaPorParcela = parcelas * porcentagem;
//        float vlrFinalEmprestimo = (parcelas * (taxaPorParcela + parcelas));
//
//        System.out.println("O Valor Inicial do Emprestimo foi de: R$ " + vlrInicialEmprestimo
//                + "\n Parcelado em " + parcelas + "x"
//                + "\n Valor de Cada Parcela é de: R$" + valorParcelas
//                + "\n Com uma taxa de " + taxas + "% = " + porcentagem
//                + "\n Totalizando Valor De: R$ " + vlrFinalEmprestimo);
//    }

