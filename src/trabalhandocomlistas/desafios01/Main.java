package trabalhandocomlistas.desafios01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        var pessoa01 = new Pessoa("Romualdo Franca", 43);
        var pessoa02 = new Pessoa("Maria Luciana", 36);
        var pessoa03 = new Pessoa("Davi França", 18);
        listaDePessoas.add(pessoa01);
        listaDePessoas.add(pessoa02);
        listaDePessoas.add(pessoa03);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        System.out.println(listaDePessoas.toString());

    }
}
