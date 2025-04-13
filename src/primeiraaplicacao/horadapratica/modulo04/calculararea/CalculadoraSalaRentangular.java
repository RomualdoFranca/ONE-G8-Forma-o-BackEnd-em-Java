package primeiraaplicacao.horadapratica.modulo04.calculararea;

public class CalculadoraSalaRentangular implements CalculoGeometrico{
    private double medidaAltura;
    private double medidaLargura;

    public double getMedidaAltura() {
        return medidaAltura;
    }

    public void setMedidaAltura(double medidaAltura) {
        this.medidaAltura = medidaAltura;
    }

    public double getMedidaLargura() {
        return medidaLargura;
    }

    public void setMedidaLargura(double medidaLargura) {
        this.medidaLargura = medidaLargura;
    }

    @Override
    public double calcularArea() {
        return medidaLargura * medidaAltura;
    }

    @Override
    public double calcularPerimetro() {
        return (medidaAltura * 2) + (medidaLargura * 2);
    }
}
