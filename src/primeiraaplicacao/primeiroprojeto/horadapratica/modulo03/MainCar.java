package primeiraaplicacao.primeiroprojeto.horadapratica.modulo03;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCarModel("HB20");
        car1.setRealiseYear(2020);
        car1.setPrice(50000.00);
        System.out.println(car1.apresentaInformacoes());

    }
}
