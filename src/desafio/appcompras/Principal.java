package desafio.appcompras;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão");

        double limite = leitura.nextDouble();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(1000);

        int sair = 1;
        while (sair != 1) {
            System.out.println("Digite a descrição da compra:");
            String descricao = leitura.nextLine();

            System.out.println("Digite o valor da compra:");
            double valor = leitura.nextDouble();

            Compras compras = new Compras(valor, descricao);
            boolean compraRealizada = cartaoDeCredito.lancaCompras(compras);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
            }
        }
    }
}
