package primeiraaplicacao.primeiroprojeto.horadapratica.modulo03;

public class ContaBancaria {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void sacar(double valorSaque) {
        saldo -= valorSaque;
    }

    public void consultarSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }
}
