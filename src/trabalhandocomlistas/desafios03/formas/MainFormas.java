package trabalhandocomlistas.desafios03.formas;

import java.util.ArrayList;

public class MainFormas {
    public static void main(String[] args) {
        Quadrado quadrado01 = new Quadrado(3);
        Quadrado quadrado02 =new Quadrado(5);

        Circulo circulo01 = new Circulo(3);
        Circulo circulo02 = new Circulo(5);

        quadrado01.calcularArea();
        circulo01.calcularArea();

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(quadrado01);
        formas.add(quadrado02);
        formas.add(circulo01);
        formas.add(circulo02);

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }


    }
}
