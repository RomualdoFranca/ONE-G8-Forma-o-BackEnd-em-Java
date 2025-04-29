package trabalhandocomlistas.desafios03.formas;

public class Circulo implements Forma{

    private double raio;
    private final double PI = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(raio, 2);

    }
}
