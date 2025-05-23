package desafio.appcompras;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite a descrição da compra:");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra:");
            double valor = leitura.nextDouble();
//            leitura.nextLine();
            Compras compras = new Compras(valor, descricao);
            boolean compraRealizada = cartaoDeCredito.lancaCompras(compras);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
//                leitura.nextLine();
            }else {
                System.out.println("Saldo insuficiente");
                sair= 0;
            }
        }

        Collections.sort(cartaoDeCredito.getCompras());
        for (Compras c : cartaoDeCredito.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
    }
}
