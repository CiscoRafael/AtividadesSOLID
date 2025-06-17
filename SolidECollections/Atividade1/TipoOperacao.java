package Atividade1;

public enum TipoOperacao {
    ENTRADA("IN", "Entrada no estacionamento"),
    SAIDA("OUT", "Saída do estacionamento");

    private final String codigo;
    private final String descricao;

    TipoOperacao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}