package Atividade7;

public class ServicoRelatorio {
    private final ExportadorRelatorio exportador;

    public ServicoRelatorio(ExportadorRelatorio exportador) {
        this.exportador = exportador;
    }

    public void gerarRelatorio(Funcionario f) {
        exportador.exportar(f);
    }
}
