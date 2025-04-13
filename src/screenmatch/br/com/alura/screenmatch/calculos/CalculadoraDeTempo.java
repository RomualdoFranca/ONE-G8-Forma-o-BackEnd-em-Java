package screenmatch.br.com.alura.screenmatch.calculos;

import screenmatch.br.com.alura.screenmatch.modelos.Title;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {

        return tempoTotal;
    }

    public void inclui(Title title) {
        this.tempoTotal += title.getRunTimeMinutes();
    }
}
