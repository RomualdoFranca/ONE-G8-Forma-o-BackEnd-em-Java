package teste.desafio.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCompras {
    List<Compras> compras = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    public void insereCompras(String item, double valor) {
        int opcaoMenu = 1;
        while (opcaoMenu == 1) {
            System.out.println("Digite o nome do produto:");


            System.out.println("Para continuar digite 1.\nPara sair da aplicação digite 0.");
            opcaoMenu = scanner.nextInt();
        }
    }

}


