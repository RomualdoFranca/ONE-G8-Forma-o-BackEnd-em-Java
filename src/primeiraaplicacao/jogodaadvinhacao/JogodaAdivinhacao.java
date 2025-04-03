package primeiraaplicacao.jogodaadvinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogodaAdivinhacao {
    public static void main(String[] args) {
/*
* Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que
* o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado
* pelo usuário é maior ou menor do que o número gerado.

Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop.*/

        Scanner scan = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(10);

        System.out.println("Estou pensando em um número entre 0 e 10.\nEm qual número estou pensando?\nDigite seu palpite.");
        int palpiteDoUsuario = scan.nextInt();
    }
}
