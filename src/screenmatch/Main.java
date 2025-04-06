package screenmatch;

import screenmatch.br.com.alura.screenmatch.modelos.Movie;

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

    }
}
