package SimuladorDeEstacionamento;

public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();

        // Registrando algumas operações
        estacionamento.registrarOperacao("ABC-1234", TipoOperacao.ENTRADA);
        estacionamento.registrarOperacao("XYZ-9876", TipoOperacao.ENTRADA);
        estacionamento.registrarOperacao("ABC-1234", TipoOperacao.SAIDA);

        System.out.println("\n=== Histórico de Operações ===");
        estacionamento.exibirHistorico();
    }
}
