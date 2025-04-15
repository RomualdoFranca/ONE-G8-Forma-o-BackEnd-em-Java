package primeiraaplicacao.horadapratica.modulo04.conversortemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    private double temperaturaF;
    private double temperaturaC;

    public double getTemperaturaF() {
        return temperaturaF;
    }

    public void setTemperaturaF(double temperaturaF) {
        this.temperaturaF = temperaturaF;
    }

    public double getTemperaturaC() {
        return temperaturaC;
    }

    public void setTemperaturaC(double temperaturaC) {
        this.temperaturaC = temperaturaC;
    }

    @Override
    public void celsiusParaFahrenheit() {
        double temperaturaConvertida = 1.8 * temperaturaC + 32;
        String output = """
                %.0f°C = %.0f°F
                """.formatted(temperaturaC, temperaturaConvertida);
        System.out.println(output);

    }

    @Override
    public void fahrenheitParaCelsius() {
        double temperaturaConvertida = (temperaturaF - 32) / 1.8;
        String output = """
                %.0f°F = %.0f°C
                """.formatted(temperaturaF, temperaturaConvertida);
        System.out.println(output);
    }
}
