package trabalhandocomlistas.desafios02;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return """
                Nome do produto:        %s
                Preço:                  R$ %.2f
                Quantidade:             %d unidade(s)
                """.formatted(nome, preco, quantidade);
    }


}
