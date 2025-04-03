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
        int numeroDeTentativas = 3;

        System.out.printf("Numero aleatorio: %d\n", numeroAleatorio);

        System.out.println("Estou pensando em um número entre 0 e 10.\nEm qual número estou pensando?");
        System.out.println("Digite seu palpite.");
        int palpiteDoUsuario = scan.nextInt();

        while (numeroDeTentativas > 0) {
            numeroDeTentativas --;

            if (palpiteDoUsuario != numeroAleatorio && numeroDeTentativas == 0) {
                System.out.println("Suas tentativas acabaram.\nInsira mais créditos para continuar jogando.");
                break;

            }else if (palpiteDoUsuario > numeroAleatorio) {
                System.out.println("\nO seu palpite é maior que o número que eu estou pensando.\nDigite seu palpite.");
                System.out.println("Numero de tentativas: " + numeroDeTentativas);
                palpiteDoUsuario = scan.nextInt();

            } else if (palpiteDoUsuario < numeroAleatorio) {
                System.out.println("\nO seu palpite é menor que o número que eu estou pensando.\nDigite seu palpite.");
                System.out.println("Numero de tentativas: " + numeroDeTentativas);
                palpiteDoUsuario = scan.nextInt();

            } else {
                System.out.printf("Parabéns!!O número que eu estava pensando era o %d ", palpiteDoUsuario);
                break;
            }
        }
    }
}
