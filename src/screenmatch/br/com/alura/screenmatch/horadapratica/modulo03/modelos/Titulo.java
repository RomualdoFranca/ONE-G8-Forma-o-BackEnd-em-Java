package screenmatch.br.com.alura.screenmatch.horadapratica.modulo03.modelos;

public class Titulo {
    private String nome;
    private String genero;
    private int duracaoMinutos;
    private double avaliacao;
    private int anoLancamento;

    public void avalia() {
        if (avaliacao >= 9) {
            System.out.println("Estrelas: * * * * *");
        } else if (avaliacao >= 6) {
            System.out.println("Estrelas: * * * *");
        } else if (avaliacao >= 4) {
            System.out.println("Estrelas: * * * ");

        }else {
            System.out.println("Estrelas: *  ");

        }
    }
    public void exibeFichaTecnica() {
        String informacoes = """
                Nome: %s
                Gênero: %s
                Ano de lançamento: %d
                Avaliação: %.1f
                Duração em minutos: %d
                """.formatted(getNome(), getGenero(), getAnoLancamento(), getAvaliacao(), getDuracaoMinutos());
        System.out.println(informacoes);
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
