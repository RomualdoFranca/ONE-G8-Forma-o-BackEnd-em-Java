package screenmatch.br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Em alta");
        }else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bem avaliado");
        }else {
            System.out.println("Assista depois");
        }
    }
}
