package desafio.appcompras;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compras> compras;

    // Os outros atributos da classe foram inicializados dentro do contrutor sem a necessidade de adicionar parametros
    // no construtor para atribuir os valores
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>(); //inicializa compras com uma ArrayList<>()
    }

    public boolean lancaCompras(Compras compras) {
        if (this.saldo >= compras.getValor()) {
           this.saldo -= compras.getValor();
           this.compras.add(compras); // se a compra foi realizada, adiciona a compra na lista
           return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }
}
