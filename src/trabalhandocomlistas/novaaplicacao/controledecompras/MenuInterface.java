package trabalhandocomlistas.novaaplicacao.controledecompras;

import java.util.Scanner;

public interface MenuInterface {

    void menuInfor();

    default void defineLimiteCartao(double limite) {
        Scanner scanner = new Scanner(System.in);
        limite = scanner.nextDouble();
        if (limite > 0) {

        }
    }
}
