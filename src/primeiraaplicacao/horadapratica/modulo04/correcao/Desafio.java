package primeiraaplicacao.horadapratica.modulo04.correcao;

public class Desafio {
    public static void main(String[] args) {
        //Inicializando os dados do cliente
        String nome = "Puga";
        String tipoDeConta = "Corrente";
        double saldo = 1599.99;

        String dadosIniciais = """
                ************************************************
                Dados inicias do cliente:
                Nome:              %s
                Tipo de conta:     %s 
                Saldo inicial:     %.2f
        
                ************************************************
                
                \n""".formatted(nome, tipoDeConta, saldo);
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

        int opcao = 0;

        while (opcao != 4) {

        }



    }
}
