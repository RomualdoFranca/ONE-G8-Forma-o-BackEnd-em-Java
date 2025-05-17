package trabalhandocomlistas.novaaplicacao.controledecompras;

import java.util.Scanner;

public class Compras {
    private String nomeItem;
    private double preco;
    private double limiteCartao;
    private double somaTotal;

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

    public double getSomaTotal() {
        return somaTotal;
    }

    Scanner scanner = new Scanner(System.in);

    public void menuLancamentoCompras() {
        int opcao;
        System.out.println("Digite o limite do cartão de crédito.");
        this.limiteCartao = scanner.nextDouble();
        scanner.nextLine();


        do {

            System.out.println("Digite a descrição da compra:");
            this.nomeItem = scanner.nextLine();

            System.out.println("Digite o valor da compra:");
            this.preco = scanner.nextDouble();
            somaCompras(this.preco);
            scanner.nextLine();

            System.out.println("Compra realizada!");
            String msg = toString();
            System.out.println(msg);

            System.out.println("Digite 0 para sair ou 1 para continuar");
            opcao = scanner.nextInt();
            scanner.nextLine();

        } while (opcao != 0 );

        System.out.println("Saindo da aplicação");


    }

    @Override
    public String toString() {
        return """
                Limite do cartão: R$%.2f
                Descrição do produto: %s
                Valor do produto: %.2f
                Valor total das compras: %.2f
                """.formatted(getLimiteCartao(), getNomeItem(), getPreco(), getSomaTotal());
    }

    // metodo que soma os valores das compras
    public void somaCompras(double valor) {
        double somaParcial = 0;
        somaParcial += valor;

        if (somaParcial <= limiteCartao) {
            this.somaTotal += somaParcial;
        }else {
            System.out.println("Compra não realizada\nSaldo insuficiente:");
        }
    }

    public void verificaLimite() {
        if(somaTotal <= limiteCartao) {

        }
    }
}
