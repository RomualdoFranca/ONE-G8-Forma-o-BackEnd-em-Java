package screenmatch.br.com.alura.screenmatch.modelos;

import screenmatch.br.com.alura.screenmatch.calculos.Classificavel;

public class Movie extends Title implements Classificavel {
    private boolean isOscarWinner;

    public boolean isOscarWinner() {
        return isOscarWinner;
    }

    public void setOscarWinner(boolean oscarWinner) {
        isOscarWinner = oscarWinner;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
