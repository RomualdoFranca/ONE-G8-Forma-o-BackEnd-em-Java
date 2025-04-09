package primeiraaplicacao.primeiroprojeto.horadapratica.modulo03;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new CarModel();

        car1.defineNomeModelo("Toro", "Fiat");
        car1.apresentaMaiorMenorValor(180000.00, 135000.00, 100000.00);

        CarModel carModel1 = new CarModel();
        carModel1.defineNomeModelo("Uno", "Fiat");
        carModel1.apresentaMaiorMenorValor(45.000, 32.000,27.000);
//        car1.setCarModel("HB20");
//        car1.setRealiseYear(2020);
//        car1.setPrice(50000.00);
//        System.out.println(car1.apresentaInformacoes());

    }
}
