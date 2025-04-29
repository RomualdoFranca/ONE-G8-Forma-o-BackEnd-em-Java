package trabalhandocomlistas.desafios03.animal;

public class Cachorro extends Animal{

    private String raca;
    private String porte;

    public Cachorro(String especie, String nome, int idade, String raca, String porte) {
        super(especie, nome, idade);
        this.raca = raca;
        this.porte = porte;
    }
}
