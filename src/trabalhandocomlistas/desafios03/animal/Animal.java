package trabalhandocomlistas.desafios03.animal;

public class Animal {
    
    private String especie;
    private String nome;
    private int idadeAnos;

    public Animal(String especie, String nome, int idadeAnos) {
        this.especie = especie;
        this.nome = nome;
        this.idadeAnos = idadeAnos;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNome() {
        return nome;
    }

    public int getidadeAnos() {
        return idadeAnos;
    }
}
