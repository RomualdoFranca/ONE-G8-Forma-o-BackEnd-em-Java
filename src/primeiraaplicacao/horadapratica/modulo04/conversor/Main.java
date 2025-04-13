package primeiraaplicacao.horadapratica.modulo04.conversor;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda valor1 = new ConversorMoeda();
        valor1.setValor(100);
        double valorConvertido = valor1.converteDolarParaReal();
        System.out.printf("Valor em Real: R$%.2f\nValor em Dollar: $%.2f\n", valor1.getValor(), valorConvertido);
    }
}
