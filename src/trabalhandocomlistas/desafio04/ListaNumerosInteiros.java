package trabalhandocomlistas.desafio04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListaNumerosInteiros {
    public static void main(String[] args) {
        // cria uma lista de inteiros
        List<Integer> listaInteiros = new ArrayList<>();

        //adiciona numeros
        listaInteiros.add(900);
        listaInteiros.add(10);
        listaInteiros.add(350);
        listaInteiros.add(499);
        listaInteiros.add(1);

        System.out.println("Lista com elementos na ordem que foram inseridos");
        System.out.println(listaInteiros);

        // usa o método Collection.sort para ordenar
        Collections.sort(listaInteiros);
        System.out.println("Lista ordenada");
        System.out.println(listaInteiros);


    }


}
