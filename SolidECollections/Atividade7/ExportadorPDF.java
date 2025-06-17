package Atividade7;

public class ExportadorPDF implements ExportadorRelatorio {
    @Override
    public void exportar(Funcionario f) {
        System.out.println("Exportando relatório em PDF: " + f.getNome() + " - " + f.getCargo());
    }
}
