package Atividade1;

import java.time.LocalDateTime;

public class Operacao {
    private final String placaVeiculo;
    private final TipoOperacao tipo;
    private final LocalDateTime dataHora;

    public Operacao(String placaVeiculo, TipoOperacao tipo, LocalDateTime dataHora) {
        this.placaVeiculo = placaVeiculo;
        this.tipo = tipo;
        this.dataHora = dataHora;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public TipoOperacao getTipo() {
        return tipo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

}
