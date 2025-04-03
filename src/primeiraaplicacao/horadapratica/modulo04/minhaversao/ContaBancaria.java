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
                """;

        System.out.println(operacoes);
    }
}
