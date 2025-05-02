package screenmatch.br.com.alura.screenmatch.principal;

import screenmatch.br.com.alura.screenmatch.modelos.Movie;
import screenmatch.br.com.alura.screenmatch.modelos.Series;
import screenmatch.br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie movie01 = new Movie("Conclave", 2025);
        movie01.calculateTotalRating(9);
        Movie movie02 = new Movie("Nosferatur", 2024);
        movie02.calculateTotalRating(6);
        Series series01 = new Series("The Last of Us", 2023, 10, 50);
        series01.calculateTotalRating(9);

      // a lista foi parametrizada com Title para suportar tanto Movie quando Serie
        ArrayList<Title> lista = new ArrayList<>();
        lista.add(movie01);
        lista.add(movie02);
        lista.add(series01);
        for (Title title : lista) {
            // Conversão de tipos (typing casting)
            //Foi necessario realizar um casting porque se tentarmos conseguir a classificação da variavel 'title' com title.getClassificacao(),
            // vai apresentar erro, pois o metodo getClassificacao não está em Title, só estar em Movie.
//            Movie movie = (Movie) title;
//            System.out.println("Classificacao: " + movie.getClassificacao());

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

        ArrayList<String> buscarPorArtistas = new ArrayList<>();
        buscarPorArtistas.add("Adam Sandler");
        buscarPorArtistas.add("Paulo");
        buscarPorArtistas.add("Jaqueline");
        System.out.println(buscarPorArtistas);

        System.out.println("Ordena em ordem alfabética");
        Collections.sort(buscarPorArtistas);
        System.out.println(buscarPorArtistas);

        Collections.sort(lista);
        System.out.println(lista);
    }
}
