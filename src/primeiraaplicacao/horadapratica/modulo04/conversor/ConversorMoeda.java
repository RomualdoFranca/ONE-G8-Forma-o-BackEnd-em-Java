package primeiraaplicacao.horadapratica.modulo04.conversor;

public class ConversorMoeda implements ConversaoFinanceira{
    private double valor;

    public double getValor() {

        return valor;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    @Override
    public double converteDolarParaReal() {

        return valor * 5.8;
    }
}
