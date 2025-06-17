package Atividade1;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private List<Operacao> historico = new ArrayList<>();

    public void registrarOperacao(String placaVeiculo, TipoOperacao tipo) {
        Operacao op = new Operacao(placaVeiculo, tipo, LocalDateTime.now());
        historico.add(op);
        System.out.println("O carro " + placaVeiculo + " deu " + tipo.getDescricao());
    }

    public void exibirHistorico() {
        for (Operacao op : historico) {
            System.out.printf("Placa: %s\nOperação: %s\nData: %s\n\n",
                op.getPlacaVeiculo(), op.getTipo().getCodigo(), op.getDataHora());
        }
    }
}
