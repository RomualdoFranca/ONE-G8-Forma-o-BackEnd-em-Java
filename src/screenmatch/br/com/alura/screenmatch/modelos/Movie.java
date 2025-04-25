package screenmatch.br.com.alura.screenmatch.modelos;

import screenmatch.br.com.alura.screenmatch.calculos.Classificavel;

public class Movie extends Title implements Classificavel {
    private boolean isOscarWinner;

    public Movie (String movieName, int realiseYear) {
        super(movieName, realiseYear);
    }
    public boolean isOscarWinner() {

        return isOscarWinner;
    }

    public void setOscarWinner(boolean oscarWinner) {

        isOscarWinner = oscarWinner;
    }

    @Override
    public int getClassificacao() {

        return (int) calculateAverage() / 2;
    }

    @Override
    public String toString() {

        return "Filme: " + this.getMovieName() + "(" + this.getRealiseYear() + ")";
    }
}
