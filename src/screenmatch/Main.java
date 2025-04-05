package screenmatch;

public class Main {
    public static void main(String[] args) {

        Movie filme1 = new Movie();
        filme1.movieName = "First Blood";
        filme1.realiseYear = 1982;
        filme1.runTimeMinutes = 193;
        filme1.isIncludedInPlan = true;

        filme1.calculateTotalRating(5);
        filme1.calculateTotalRating(10);
        filme1.calculateAverage();

        filme1.displayMovieDetails();

    }
}
