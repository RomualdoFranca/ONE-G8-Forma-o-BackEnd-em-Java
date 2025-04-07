package primeiraaplicacao.primeiroprojeto.horadapratica.modulo02;

public class IdadePessoa {
    private int idade;
    private String nome;

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("Pessoa maior de idade");
        } else {
            System.out.println("Pessoa menor de idade.");
        }
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
