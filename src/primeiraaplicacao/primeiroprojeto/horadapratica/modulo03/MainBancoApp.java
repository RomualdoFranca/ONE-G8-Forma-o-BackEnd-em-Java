package primeiraaplicacao.primeiroprojeto.horadapratica.modulo03;

public class MainBancoApp {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        conta1.consultarSaldo();

        conta1.depositar(100);
        conta1.consultarSaldo();
        conta1.sacar(80);
        conta1.consultarSaldo();
        conta1.cobrarTarifaMensal();

    }
}
