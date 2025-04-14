package primeiraaplicacao.horadapratica.modulo04.tabuada;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TabuadaMultiplicacao tabuadaNum2 = new TabuadaMultiplicacao();
        tabuadaNum2.setNumero(2);
        tabuadaNum2.calculaTabuada();
        tabuadaNum2.mostrarTabuada();



    }
    public static void mostrarTabuada(int numero) {

        for (int i = 1; i <= 10; i++) {
            int multiplicacao = numero * i;
            String resultado = """
                    %d X %d = %d""".formatted(numero, i, multiplicacao);
            System.out.println(resultado);
        }
    }




}
