package primeiraaplicacao.primeiroprojeto;

public class StreamApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Screen Match. Your new streaming platform.");
        System.out.println("Movie: Top Gun Maverick");

        String movieName = "Top Gun Maverick";
        int reliaseYear = 2022;
        System.out.println("Realise year: " + reliaseYear);
        boolean isIncludedInPlan = true;
        double movieRating = 8.1;

        // Average calculated from the 3 user ratings
        double averageMovieRating = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(averageMovieRating);

        String synopsis = """
                SYNOPSIS
                Movie: %s
                Realise year: %d
                Movie rating: %.1f
                Average movie rating: %.1f
                """.formatted(movieName, reliaseYear, movieRating, averageMovieRating);
        System.out.println(synopsis);
    }
}
