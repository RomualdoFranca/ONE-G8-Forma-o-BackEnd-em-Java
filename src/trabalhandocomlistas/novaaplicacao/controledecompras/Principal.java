package trabalhandocomlistas.novaaplicacao.controledecompras;

public class Principal {
    public static void main(String[] args) {
        Compras compras01 = new Compras();
        compras01.menuLancamentoCompras();
        System.out.println(compras01.getLimiteCartao());
    }
}
