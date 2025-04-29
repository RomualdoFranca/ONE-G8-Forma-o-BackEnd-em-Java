package trabalhandocomlistas.desafios03.formas;

public class Quadrado implements Forma{
    private double medidaLado;

    public Quadrado(double medidaLado) {
        this.medidaLado = medidaLado;
    }

    public double getMedidaLado() {
        return medidaLado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(medidaLado, 2);

    }

    @Override
    public String toString() {
        return """
                Área do quadrado: %.2f
                Área do círculo:  %.2f
                """.formatted();
    }
}
