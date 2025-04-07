package primeiraaplicacao.primeiroprojeto.horadapratica.modulo02;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private double notas;

    // futuras implementações: inserir um menu para escolha da máteria e escolha de tipo de atividade
//    public void apresentaMenu() {
//        String menuMaterias = """
//                    Ecolha a Matéria
//                    1- Português
//                    2- Matemática
//                    3- Ciências
//                    4- História
//                """
//    }
    public void insereNotas(double nota) {
        notas += nota;
    }

    public void calcularmedia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a opção desejada:\n1- Inserir nota\n2- Sair");
        int opcaoDoMenu = scanner.nextInt();
        int numeroDeNotasInseridas = 0;

        while (opcaoDoMenu != 2) {
            System.out.println("Insira o valor da nota:");
            insereNotas(scanner.nextDouble());
            numeroDeNotasInseridas++;
            System.out.println("Quantidade de notas: " + numeroDeNotasInseridas);
            System.out.println("Soma das notas: " + getNotas());
            System.out.println("Digite a opção desejada:\n1- Inserir nota\n2- Calcular média");
            opcaoDoMenu = scanner.nextInt();
        }
        double media  = notas / numeroDeNotasInseridas;
        System.out.printf("Valor da média final: %.2f\n", media);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getNotas() {
        return notas;
    }
}
