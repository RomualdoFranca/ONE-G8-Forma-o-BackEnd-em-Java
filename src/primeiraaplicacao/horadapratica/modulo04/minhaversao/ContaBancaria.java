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

        int[] numerosValidoss = {1, 2, 3, 4};
        boolean opcaoValida = false;
        int numeroDaOperacaoEscolhida = scanner.nextInt();


        for (int numero : numerosValidoss) {

            if (numero == numeroDaOperacaoEscolhida) {
                System.out.println("Opção válida");
                opcaoValida = true;
                break;

            } else {
                System.out.println("Opção inválida");
                break;

            }
        }
        System.out.println("Valor da opção válida: " + opcaoValida);

        while (numeroDaOperacaoEscolhida != 4) {

            switch (numeroDaOperacaoEscolhida) {
                case 1:
                    System.out.printf("Seu saldo atual: R$%.2f\n", saldoInicial);
                    System.out.println(operacoes);
                    numeroDaOperacaoEscolhida = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Informe o valor do depósito:");
                    double deposito = scanner.nextDouble();
                    saldoInicial += deposito;
                    System.out.printf("Valor do depósito: R$%.2f\nSaldo após depósito R$%.2f\n",deposito, saldoInicial);
                    System.out.println(operacoes);
                    numeroDaOperacaoEscolhida = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Informe o valor da transferência:");
                    double transferencia = scanner.nextDouble();
                    saldoInicial -= transferencia;
                    System.out.printf("Valor da transferência: R$%.2f\nSaldo após a transferêcia: R$%.2f\n", transferencia, saldoInicial);
                    System.out.println(operacoes);
                    numeroDaOperacaoEscolhida = scanner.nextInt();
                    break;



            }

        }
    }
}
