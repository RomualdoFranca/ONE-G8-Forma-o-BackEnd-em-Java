package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("B.Y.O.B");
        musica.setAlbum("Mezmerize");
        musica.setCantor("System of A Down");
        musica.setGenero("nu metal");

        Podcast podcast = new Podcast();
        podcast.setTitulo("Medo e Delírio em Brasília");
        podcast.setApresentador("Cristiano Botafogo");

        for (int i = 0; i < 500; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            musica.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);

    }
}
