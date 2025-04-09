package primeiraaplicacao.primeiroprojeto.horadapratica.modulo03;

public class NumerosPrimos {
    private int numero;

    public void verificarPrimalidade() {
        if (numero / numero == 1 && numero / 1 == numero) {
            System.out.println("O número não é primo");
        } else {
            System.out.println("O número é primo");

        }
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
