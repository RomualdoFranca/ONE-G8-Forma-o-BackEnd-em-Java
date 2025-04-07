package primeiraaplicacao.primeiroprojeto.horadapratica.modulo02;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;


    public void saldo(double valor) {
        saldo += valor;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
