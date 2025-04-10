package screenmatch.br.com.alura.screenmatch.horadapratica.modulo03.modelos;

public class Series extends Titulo{
    private int numeroTemporadas;
    private int duracaoEpsodio;
    private boolean vencedorGloboDeOuro;
    private boolean estaAtiva;

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getDuracaoEpsodio() {
        return duracaoEpsodio;
    }

    public void setDuracaoEpsodio(int duracaoEpsodio) {
        this.duracaoEpsodio = duracaoEpsodio;
    }

    public boolean isVencedorGloboDeOuro() {
        return vencedorGloboDeOuro;
    }

    public void setVencedorGloboDeOuro(boolean vencedorGloboDeOuro) {
        this.vencedorGloboDeOuro = vencedorGloboDeOuro;
    }

    public boolean isEstaAtiva() {
        return estaAtiva;
    }

    public void setEstaAtiva(boolean estaAtiva) {
        this.estaAtiva = estaAtiva;
    }
}
