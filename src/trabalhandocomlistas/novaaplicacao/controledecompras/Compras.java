package trabalhandocomlistas.novaaplicacao.controledecompras;

import java.util.Scanner;

public class Compras {
    private String nomeItem;
    private double preco;
    private double limiteCartao;

//    public Compras(String nomeItem, double preco) {
//        this.nomeItem = nomeItem;
//        this.preco = preco;
//    }

    public String getNomeItem() {
        return nomeItem;
    }

    public double getPreco() {
        return preco;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    Scanner scanner = new Scanner(System.in);


    public void defineLimiteCartao() {
        System.out.println("Digite o limite do cartão de crédito.");
        this.limiteCartao = scanner.nextDouble();

    }

    public void descreveCompra() {
        System.out.println("Digite a descrição da compra:");
        this.nomeItem = scanner.nextLine();
        insereValorCompra();
    }

    public void insereValorCompra() {
        System.out.println("Digite o valor da compra:");
        this.preco = scanner.nextDouble();
        System.out.println("Compra realizada!");
    }
    public void menuLancamentoCompras() {
        int opcao;
        do {

            System.out.println("Digite o limite do cartão de crédito.");
            this.limiteCartao = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite a descrição da compra:");
            this.nomeItem = scanner.nextLine();

            System.out.println("Digite o valor da compra:");
            this.preco = scanner.nextDouble();



            System.out.println("Compra realizada!");

            System.out.println("Digite 0 para sair ou 1 para continuar");
            opcao = scanner.nextInt();

        } while (opcao != 0);

        System.out.println("Saindo da aplicação");

    }
}
