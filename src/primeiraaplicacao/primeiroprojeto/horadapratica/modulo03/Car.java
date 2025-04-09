package primeiraaplicacao.primeiroprojeto.horadapratica.modulo03;

public class Car {
    /*
    * Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos
    * para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
    * Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir
    * preços e mostrar informações.*/
    private String carModel;
    private int realiseYear;
    private double price;

    public void calculaPrecoMedio(int anoAtual) {
        double taxaDeDepreciacao = price - (price * 0.2);

    }

    public String apresentaInformacoes() {
         return """
                Modelo:              %s
                Ano de lançamento:   %d
                Preço:            R$ %.2f
                """.formatted(getCarModel(), getRealiseYear(),getPrice());
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRealiseYear() {
        return realiseYear;
    }

    public void setRealiseYear(int realiseYear) {
        this.realiseYear = realiseYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
