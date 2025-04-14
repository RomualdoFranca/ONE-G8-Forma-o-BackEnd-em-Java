package primeiraaplicacao.horadapratica.modulo04.tabuada;

public class TabuadaMultiplicacao implements Tabuada{
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public void mostrarTabuada() {
        for (int i = 1; i <= 10; i++) {
            String tabuada = """
                    %d X %d = %d""".formatted(i, numero, (numero * i));
            System.out.println(tabuada);
        }
        System.out.println("");
    }
}
