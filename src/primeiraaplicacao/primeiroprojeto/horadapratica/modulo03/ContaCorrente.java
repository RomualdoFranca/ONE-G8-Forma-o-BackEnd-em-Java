package primeiraaplicacao.primeiroprojeto.horadapratica.modulo03;

public class ContaCorrente extends ContaBancaria {

    public void cobrarTarifaMensal() {
        double tarifa = 35.00;
        if (getSaldo() < tarifa) {
            double depositoTarifa = tarifa - getSaldo();
            System.out.printf("Sua conta será cancelada." +
                    "\nRealize um depósito de no mínimo R$%.2f para continuar utlizando essa conta\n", depositoTarifa);
        }else {
            sacar(tarifa);
            System.out.println("Valor da tarifa mensal: R$" + tarifa + "\nSaldo: R$" + getSaldo());
        }
    }
}
