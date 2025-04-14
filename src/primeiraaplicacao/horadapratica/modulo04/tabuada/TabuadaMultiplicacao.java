package primeiraaplicacao.horadapratica.modulo04.tabuada;

public class TabuadaMultiplicacao implements Tabuada{
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public int[] calculaTabuada() {
        int[] tabuada = new int[10];
        for (int i = 1; i <= 10; i++) {
            tabuada[i - 1] = i * numero;
        }
        return tabuada;
    }
    @Override
    public String mostrarTabuada() {
        for (int i = 0; i < calculaTabuada().length; i++) {
            return """
                    num = %s""".formatted(calculaTabuada());
        }
        return null;
    }
}
