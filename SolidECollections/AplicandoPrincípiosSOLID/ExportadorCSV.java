package AplicandoPrincípiosSOLID;

public class ExportadorCSV implements ExportadorRelatorio {
    @Override
    public void exportar(Funcionario f) {
        System.out.println("Exportando relatório em CSV: " + f.getNome() + "," + f.getCargo());
    }
}
