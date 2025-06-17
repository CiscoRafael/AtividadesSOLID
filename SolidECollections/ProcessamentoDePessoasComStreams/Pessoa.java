package ProcessamentoDePessoasComStreams;

public class Pessoa {
    private String nome, cidade;
    private int idade;
    
    public Pessoa(String nome, String cidade, int idade) {
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + "[Cidade=" + cidade + ", idade=" + idade + "]";
    }

    

}
