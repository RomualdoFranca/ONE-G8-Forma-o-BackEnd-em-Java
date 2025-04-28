package trabalhandocomlistas.desafios02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // cria uma lista de objetos
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto01 = new Produto("Floco de milho", 1.45, 500);
        Produto produto02 = new Produto("Leite desnatado", 6.85, 300);
        Produto produto03 = new Produto("Óleo de soja", 8.70, 200);
        // adiciona produtos a lista
        produtos.add(produto01);
        produtos.add(produto02);
        produtos.add(produto03);

        ProdutoPerecivel produtoPerecivel01 = new ProdutoPerecivel("Batata doce", 3.70, 4, 50);
        produtos.add(produtoPerecivel01);

        // imprime os dados do produto utilizando o metodo toString
        System.out.println(produto01.toString());
        //imprime tamanho da lista
        System.out.println("Tamanho da lista: " + produtos.size());
        // recupera produto pelo indice
        System.out.println("Recupera produto pelo indice: \n" + produtos.get(3).toString());

        // imprime a lista completa de produtos
        for (Produto produto: produtos) {
            System.out.println(produto);
        }
    }
}
