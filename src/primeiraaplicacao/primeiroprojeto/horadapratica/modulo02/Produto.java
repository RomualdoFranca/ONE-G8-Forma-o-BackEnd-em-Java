package primeiraaplicacao.primeiroprojeto.horadapratica.modulo02;

public class Produto {
    private String nome;
    private double preco;

    public void adicionaPreco(double valor){
        preco += valor;
    }
    public void aplicaDesconto() {
        double taxaDesconto = 0.05;
        preco -= preco * taxaDesconto;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
