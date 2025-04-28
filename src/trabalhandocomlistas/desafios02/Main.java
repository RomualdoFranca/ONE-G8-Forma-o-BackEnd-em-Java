package trabalhandocomlistas.desafios02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // cria uma lista de objetos
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto01 = new Produto("Floco de milho", 1.45, 500);
        Produto produto02 = new Produto("Leite desnatado", 6.85, 300);
        Produto produto03 = new Produto("Óleo de soja", 8.70, 200);
        Produto produto04 = new Produto("Batata doce", 3.70, 4);
        // adiciona produtos a lista
        produtos.add(produto01);
        produtos.add(produto02);
        produtos.add(produto03);
        produtos.add(produto04);
        // imprime os dados do produto utilizando o metodo toString
        System.out.println(produto01.toString());
        //imprime tamanho da lista
        System.out.println("Tamanho da lista: " + produtos.size());
        // recupera produto pelo indice
        System.out.println("Recupera o primeiro produto da lista: \n" + produtos.get(1).toString());
    }
}
