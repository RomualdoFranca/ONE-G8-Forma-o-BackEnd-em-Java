package trabalhandocomlistas.desafio04;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public int compareTo(Titulo outroNome) {
        return this.nome.compareTo(outroNome.getNome());
    }

    @Override
    public String toString() {
        return getNome();
    }
}
