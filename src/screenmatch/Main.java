package screenmatch;

import screenmatch.br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import screenmatch.br.com.alura.screenmatch.modelos.Episodio;
import screenmatch.br.com.alura.screenmatch.modelos.Movie;
import screenmatch.br.com.alura.screenmatch.modelos.Series;

public class Main {
    public static void main(String[] args) {

        Movie filme1 = new Movie();
        filme1.setMovieName("First Blood");
        filme1.setRealiseYear(1982);
        filme1.setRunTimeMinutes(193);
        filme1.setIncludedInPlan(true);

        filme1.calculateTotalRating(5);
        filme1.calculateTotalRating(10);
        filme1.calculateAverage();

        filme1.displayMovieDetails();

        Series serie1 = new Series();
        serie1.setMovieName("Arcane");
        serie1.setRealiseYear(2023);
        serie1.setSeasonCount(2);
        serie1.setEpisodesPerSeason(10);
        serie1.setEpisodeDurationMinutes(45);
        serie1.displayMovieDetails();
        System.out.println("Season duration in minutes: " + serie1.getRunTimeMinutes());

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(filme1);
        calc.inclui(serie1);
        System.out.println("Tempo total: " + calc.getTempoTotal());

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVizualizacoes(300);
        FiltroRecomendacao filtro0 = new FiltroRecomendacao();
        filtro0.filtra(episodio);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

    }
}
