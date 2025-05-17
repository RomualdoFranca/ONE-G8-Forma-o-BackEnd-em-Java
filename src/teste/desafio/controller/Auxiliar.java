package teste.desafio.controller;

import java.util.Scanner;

public interface Auxiliar {

    default void defineLimiteCartao(double valorInput, double limite) {
        if (valorInput < 0) {
            System.out.println("Valor inválido");
        }else {
            limite += valorInput;
            System.out.println("Limite do cartão: " + limite);
        }
    }


}
