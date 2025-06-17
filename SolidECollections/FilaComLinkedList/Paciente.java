package FilaComLinkedList;

public class Paciente {
    private String nome, cpf;
    private int senha;
    private static int senhas = 0;

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = ++senhas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getSenha() {
    return String.format("%03d", senha);
}

    
}
