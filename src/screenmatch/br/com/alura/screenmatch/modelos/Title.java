package screenmatch.br.com.alura.screenmatch.modelos;

public class Title {

    private  String movieName;
    private int realiseYear;
    private  boolean isIncludedInPlan;
    private double movieRating;
    private double ratingCount;
    private int runTimeMinutes;

    public String getMovieName() {

        return movieName;
    }

    public int getRealiseYear() {

        return realiseYear;
    }

    public boolean isIncludedInPlan() {

        return isIncludedInPlan;
    }

    public double getRatingCount() {

        return ratingCount;
    }

    public int getRunTimeMinutes() {

        return runTimeMinutes;
    }

    public double getMovieRating() {


        return movieRating;
    }


    public void setRealiseYear(int realiseYear) {

        this.realiseYear = realiseYear;
    }

    public void setIncludedInPlan(boolean includedInPlan) {

        isIncludedInPlan = includedInPlan;
    }

    public void setRunTimeMinutes(int runTimeMinutes) {

        this.runTimeMinutes = runTimeMinutes;
    }

    public void displayMovieDetails() {
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

    public void calculateTotalRating(double rating) {
        movieRating += rating;
        ratingCount++;
    }

    public double calculateAverage() {

        return movieRating / ratingCount;
    }

}
