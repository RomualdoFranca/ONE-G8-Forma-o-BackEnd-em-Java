package trabalhandocomlistas.desafio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TituloMain {
    public static void main(String[] args) {
        Titulo titulo01 = new Titulo("Eu Robô");
        Titulo titulo02 = new Titulo("Zaratustra");
        Titulo titulo03 = new Titulo("Troia");

        List<Titulo> listaTitulo = new ArrayList<>();
        listaTitulo.add(titulo01);
        listaTitulo.add(titulo02);
        listaTitulo.add(titulo03);

        System.out.println("Lista na ordem que os objetos foram adicionados");
        System.out.println(listaTitulo);

        System.out.println("Lista ordenada");
        Collections.sort(listaTitulo);
        System.out.println(listaTitulo);

        for (Titulo titulo: listaTitulo) {
            System.out.println(titulo.getNome());
        }
    }
}
