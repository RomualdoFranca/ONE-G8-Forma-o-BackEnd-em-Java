package trabalhandocomlistas.desafios03;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {

        /*
        *       for (Title title : lista) {
            // Conversão de tipos (typing casting)
            //Foi necessario realizar um casting porque se tentarmos conseguir a classificação da variavel 'title' com title.getClassificacao(),
            // vai apresentar erro, pois o metodo getClassificacao não está em Title, só estar em Movie.
           Movie movie = (Movie) title;
          System.out.println("Classificacao: " + movie.getClassificacao());

            // uma forma menos elegante de evitar o erro é usadno o 'instanceof'
            if (title instanceof Movie movie) {
                System.out.println("Classificação: " + movie.getClassificacao());
            }
        }

        // imprime os itens da lista usando um forEach
        System.out.println("Resultado do forEach");
        lista.forEach(item -> System.out.println(item));

        //imprime usando Method Reference
        System.out.println("Method Reference");
        lista.forEach(System.out::println);
        * */
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        //percorre elementos com forEach
        strings.forEach(item->System.out.printf( item));
        System.out.println();
        strings.forEach(item->System.out.println(item));
        System.out.println("Expressão lambda");
        strings.forEach(System.out::println);
    }
}
