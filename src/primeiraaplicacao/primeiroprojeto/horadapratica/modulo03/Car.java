package primeiraaplicacao.primeiroprojeto.horadapratica.modulo03;

import java.util.Arrays;

public class Car {
    /*
    * Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos
    * para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
    * Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir
    * preços e mostrar informações.*/


    public void apresentaMaiorMenorValor(double precoAno1, double precoAno2, double precoAno3) {
        double [] precos = {precoAno1, precoAno2, precoAno3};
        Arrays.sort(precos);
        String valores = """
                Menor valor: R$ %.2f
                Maior valor: R$  %.2f
                """.formatted(precos[0], precos[2]);
        System.out.println(valores);
    }
    public String defineNomeModelo(String nome, String fabricante) {
        return """
                Nome:   %s
                Modelo: %s
                """.formatted(nome, fabricante);
    }

}
