package trabalhandocomlistas.desafios03.produtos;

import java.util.ArrayList;

public class Produtos {
    private String nome;
    private double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }



    @Override
    public String toString() {
        return  """
                Nome do produto:    %s
                Preço:              R$%.2f
                """.formatted(getNome(), getPreco());
    }

    public void listaPreco() {

    }
}
