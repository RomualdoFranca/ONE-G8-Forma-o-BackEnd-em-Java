package primeiraaplicacao.horadapratica.modulo04.tabuada;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TabuadaMultiplicacao tabuadaNum = new TabuadaMultiplicacao();
        tabuadaNum.setNumero(2);
        tabuadaNum.mostrarTabuada();
        tabuadaNum.setNumero(7);
        tabuadaNum.mostrarTabuada();
//        tabuadaNum2.mostrarTabuada();



    }
//    public static void mostrarTabuada(int numero) {
//
//        for (int i = 1; i <= 10; i++) {
//            int multiplicacao = numero * i;
//            String resultado = """
//                    %d X %d = %d""".formatted(numero, i, multiplicacao);
//            System.out.println(resultado);
//        }
//    }




}
