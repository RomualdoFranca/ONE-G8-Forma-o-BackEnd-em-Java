package desafio.appcompras;

public class Compras implements Comparable<Compras>{
    private double valor;
    private String descricao;

    public Compras(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Compra\nDescrição: " + descricao + "\nValor: R$" + valor;
    }


    @Override
    public int compareTo(Compras outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
