package primeiraaplicacao.horadapratica.modulo04.calculararea;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRentangular sala1 = new CalculadoraSalaRentangular();
        sala1.setMedidaAltura(3.0);
        sala1.setMedidaLargura(2.9);

        double area = sala1.calcularArea();
        double perimetro = sala1.calcularPerimetro();
        System.out.printf("Medidas:\nLargura: %.2f\nAltura: %.2f\nPerímetro: %.2f\nÁrea: %.2f\n"
                ,sala1.getMedidaLargura(), sala1.getMedidaAltura(), perimetro, area);
    }
}
