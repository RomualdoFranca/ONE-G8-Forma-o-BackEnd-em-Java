package primeiraaplicacao.horadapratica.modulo04.minhaversao;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe o tipo de conta:");
        String tipoDeConta = scanner.nextLine();

        System.out.println("Digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();


        String dadosIniciais = """
                ************************************************
                Dados inicias do cliente:
                
                Nome:              %s
                Tipo de conta:     %s 
                Saldo inicial:     %.2f
                ************************************************
                \n""".formatted(nome, tipoDeConta,saldoInicial);

        System.out.println(dadosIniciais);

        String operacoes = """
                Operações
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                Digite a opção desejada:
                """;

        System.out.println(operacoes);
        int numeroDaOperacaoEscolhida = scanner.nextInt();

        while (numeroDaOperacaoEscolhida != 4) {
            double saldoFinal;

            switch (numeroDaOperacaoEscolhida) {
                case 1:
                    System.out.printf("Seu saldo atual: R$%.2f\n", saldoInicial);
                    System.out.println(operacoes);
                    numeroDaOperacaoEscolhida = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Informe o valor do depósito:");
                    double deposito = scanner.nextDouble();
                    saldoFinal = deposito + saldoInicial;
                    System.out.printf("Valor do depósito: R$%.2f\nSaldo após depósito R$%.2f\n",deposito, saldoFinal);
                    System.out.println(operacoes);
                    numeroDaOperacaoEscolhida = scanner.nextInt();
                    break;
                    
            }

        }
    }
}
