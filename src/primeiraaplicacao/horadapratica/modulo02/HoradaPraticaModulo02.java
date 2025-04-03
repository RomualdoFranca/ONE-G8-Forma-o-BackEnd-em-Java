package primeiraaplicacao.horadapratica.modulo02;

public class HoradaPraticaModulo02 {
    public static void main(String[] args) {
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 5.5;
        double nota2 = 8.4;
        double media = (nota1 + nota2) / 2;

        String msgMedia = """
                A média das notas %.2f e %.2f é igual a %.2f
                """.formatted(nota1, nota2, media);
        System.out.println(msgMedia);

        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double var1 = 7.343;
        int var2 = (int) var1;
        System.out.println("Realizando casting da variável double: " + var2);

        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        // Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 14.75;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Preço total da compra: " + valorTotal);

        /*
        Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o
        resultado formatado.
        * */
        double valorEmDolares = 120.0;
        double cambio = 4.94;
        double conversao = valorEmDolares * cambio;
        String msgCambio = """
                O valor de $%.2f dolares em real equivale a R$%.2f
                """.formatted(valorEmDolares, conversao);

        System.out.println(msgCambio);

        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de
        // um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao
        // produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço
        // com desconto.

        double precoOriginal = 1840.00;
        double percentualDeDesconto = 0.1;
        double precoComDesconto = precoOriginal - ( precoOriginal * percentualDeDesconto);
        String msgDesconto = """
                Preço do produto sem desconto: R$ %.2f. 
                Preço com desconto de 10 porcento: R$ %.2f 
                """.formatted(precoOriginal, precoComDesconto);
        System.out.println(msgDesconto);
    }
}
