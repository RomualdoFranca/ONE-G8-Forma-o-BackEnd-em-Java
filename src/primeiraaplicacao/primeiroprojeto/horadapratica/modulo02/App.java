package primeiraaplicacao.primeiroprojeto.horadapratica.modulo02;

public class App {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Puga");
        pessoa1.setIdade(18);
        pessoa1.verificarIdade();

        Produto produto1 = new Produto();
        produto1.setNome("Ovos");
        produto1.adicionaPreco(14.50);
        double valorSemDesconto = produto1.getPreco();
        produto1.aplicaDesconto();
        double valorComDesconto = produto1.getPreco();
        System.out.printf("Valor sem desconto: %.2f\nValor com desconto %.2f", valorSemDesconto, valorComDesconto);
    }
}
