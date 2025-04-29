package trabalhandocomlistas.desafios03.produtos;

import java.util.ArrayList;
import java.util.Arrays;

public class MainProdutos {
    public static void main(String[] args) {

        Produtos produto01 = new Produtos("Leite", 4.78);
        Produtos produto02 = new Produtos("Óleo", 7.80);
        Produtos produto03 = new Produtos("Sazon", 5.40);
        Produtos produto04 = new Produtos("Peixe", 25.30);

        var produtos = new ArrayList<Produtos>();
        produtos.add(produto01);
        produtos.add(produto02);
        produtos.add(produto03);
        produtos.add(produto04);
        produtos.forEach(item -> System.out.println(item));


        System.out.println("Contem o objeto: " + produtos.contains(produto01));
        System.out.println("Tamanho da lista: " + produtos.size());

        double media = 0;
        for (int i = 0; i <= produtos.size() - 1; i++) {
            media += produtos.get(i).getPreco();
        }


        System.out.println("Soma total dos preços: R$" + media);
        System.out.println("Media de preços: R$" + media / produtos.size() );


        

        //adicionando usando Arrays.asList() com addAll()
//        produtos.addAll(Arrays.asList(
//                new Produtos("Leite", 4.78),
//                new Produtos("Óleo", 7.80),
//                new Produtos("Sazon", 5.40),
//                new Produtos("Peixe", 25.30)
//        ));

    }
}
