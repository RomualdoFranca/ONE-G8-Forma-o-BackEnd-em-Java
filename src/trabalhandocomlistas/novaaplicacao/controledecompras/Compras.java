package trabalhandocomlistas.novaaplicacao.controledecompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compras {
    private String nomeItem;
    private double preco;
    private double limiteCartao;
    private double somaTotal;

    public Compras() {

    }

    public Compras(String nomeItem, double preco) {
        this.nomeItem = nomeItem;
        this.preco = preco;
    }

    public String getNomeItem() {

        return nomeItem;
    }

    public double getPreco() {

        return preco;
    }

    public double getLimiteCartao() {

        return limiteCartao;
    }

    public double getSomaTotal() {

        return somaTotal;
    }


    Scanner scanner = new Scanner(System.in);
    public void realizaCompra() {
        int opcaoContinuaFinaliza = 1;

        defineLimite();

        //loop para realizar compras
        while (opcaoContinuaFinaliza == 1) {
            System.out.println("Digite a descrição da compra:");
            this.nomeItem = scanner.nextLine();

            System.out.println("Digite o valor da compra:");
            this.preco = scanner.nextDouble();
            scanner.nextLine();
            adicionaCompras();

            System.out.println("Compra realizada.");
            System.out.println("Para continuar, digite 1. Para sair, digite 0.");
            opcaoContinuaFinaliza = scanner.nextInt();
            scanner.nextLine();
        }
        imprimeLista();
        System.out.println("\nSaindo da aplicação.");

    }

    List<Compras> compras = new ArrayList<>();
    private void adicionaCompras() {
        compras.add(new Compras(this.nomeItem, this.preco));
    }

    private void imprimeLista() {
        System.out.println("Extrato");
        for (Compras item : compras) {
            System.out.println(item);
        }
    }
    private void defineLimite() {

        System.out.println("Digite o limite do cartão:");
        this.limiteCartao = scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public String toString() {
        return "%s  -   %.2f".formatted(getNomeItem(), getPreco());

//                """
//                Limite do cartão: R$%.2f
//                Descrição do produto: %s
//                Valor do produto: %.2f
//                Valor total das compras: %.2f
//                """.formatted(getLimiteCartao(), getNomeItem(), getPreco(), getSomaTotal());
    }

    // metodo que soma os valores das compras
//    public void somaCompras(double valor) {
//        double somaParcial = 0;
//        somaParcial += valor;
//
//        if (somaParcial <= limiteCartao) {
//            this.somaTotal += somaParcial;
//        }else {
//            System.out.println("Compra não realizada\nSaldo insuficiente:");
//        }
//    }


}
