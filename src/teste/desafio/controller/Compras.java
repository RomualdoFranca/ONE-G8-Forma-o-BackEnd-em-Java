package teste.desafio.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compras {
    private double limiteCartao;

    private String nomeProduto;
    private double valorCompra;
    public Compras() {

    }

    public Compras(String nomeProduto, double valorCompra) {
        this.nomeProduto = nomeProduto;
        this.valorCompra = valorCompra;
    }
    //    public Compras(String nomeProduto, double valorCompra) {
//        this.valorCompra = valorCompra;
//        this.nomeProduto = nomeProduto;
//    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }


    public double getLimiteCartao() {
        return limiteCartao;
    }

    List<Compras> compras = new ArrayList<>();
    public void efetuaCompra() {
        Scanner scanner = new Scanner(System.in);
        int opcaoMenu = 1;
        while (opcaoMenu == 1) {
            System.out.println("Digite o nome do produto:");
            this.nomeProduto = scanner.nextLine();

            System.out.println("Digite o valor do produto:");
            this.valorCompra = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Compra realizada!");
            adicionaComprasNaLista(compras);
//            System.out.println(compras);

            System.out.println("Para continuar digite 1.\nPara sair da aplicação digite 0.");
            opcaoMenu = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Finalizada a aplicação.");
        imprimeLista();
        System.out.println(compras.size());

    }

    public void adicionaComprasNaLista(List<Compras> compras){
        compras.add(new Compras(this.nomeProduto, this.valorCompra));
    }
    public void imprimeLista() {

        System.out.println("********EXTRATO********\n");
        for (Compras c : compras) {
            System.out.println(c);// imprime apenas os valores dos atributos

        }
        System.out.println("\n********************");
        //System.out.println(compras); imprime a cada iteração e mostra o colchete padrão
    }

    @Override
    public String toString() {
//        return """
//                Nome do produto:        %s
//                Valor do produto:       %.2f
//                """.formatted(getNomeProduto(), getValorCompra());
        return "%s  -   %.2f".formatted(getNomeProduto(), getValorCompra());

    }
}
