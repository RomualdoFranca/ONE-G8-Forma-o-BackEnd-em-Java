package screenmatch;

public class Movie {

    String movieName;
    int realiseYear;
    boolean isIncludedInPlan;
    double movieRating;
    double ratingCount;
    int runTimeMinutes;

    void displayMovieDetails() {
        String movieDetails = """
                Movie Details
                Title: %s
                Realise year: %d
                Movie rating: %.1f
                Average movie rating: %.1f
                Is included in plan: %s
                Run time minutes: %d
                """.formatted(movieName, realiseYear,  movieRating, calculateAverage(), isIncludedInPlan ,runTimeMinutes);
        System.out.println(movieDetails);
    }

    void calculateTotalRating(double rating) {
        movieRating += rating;
        ratingCount++;
    }

    double calculateAverage() {

        return movieRating / ratingCount;
    }

}
