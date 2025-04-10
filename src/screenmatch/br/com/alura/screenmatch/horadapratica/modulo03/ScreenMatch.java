package screenmatch.br.com.alura.screenmatch.horadapratica.modulo03;

import screenmatch.br.com.alura.screenmatch.horadapratica.modulo03.modelos.Titulo;

public class ScreenMatch {
    public static void main(String[] args) {
        Titulo titulo = new Titulo();
        titulo.setNome("Avatar");
        titulo.setGenero("Ficção");
        titulo.setAnoLancamento(2010);
        titulo.setAvaliacao(3);
        titulo.setDuracaoMinutos(180);

        titulo.exibeFichaTecnica();
        titulo.avalia();
    }
}
