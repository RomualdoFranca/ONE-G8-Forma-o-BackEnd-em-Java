package trabalhandocomlistas.desafios02;

public class ProdutoPerecivel extends Produto{
    private int dataValidadeDias;

    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataValidadeDias) {
        super(nome, preco, quantidade);
        this.dataValidadeDias = dataValidadeDias;
    }

    @Override
    public String toString() {
        return """
                Nome do produto:        %s
                Preço:                  R$ %.2f
                Quantidade:             %d unidade(s)
                Validade em dias:       %d dias
                """.formatted(getNome(), getPreco(), getQuantidade(), dataValidadeDias);
    }
}
