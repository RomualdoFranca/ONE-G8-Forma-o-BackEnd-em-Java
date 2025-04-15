package primeiraaplicacao.horadapratica.modulo04.conversortemperatura;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor1 = new ConversorTemperaturaPadrao();
        conversor1.setTemperaturaC(40);
        conversor1.celsiusParaFahrenheit();
        conversor1.setTemperaturaF(104);
        conversor1.fahrenheitParaCelsius();
    }
}
