package AplicandoPrincípiosSOLID;

public class Main {
    public static void main(String[] args) {
        // 1. Criar um funcionário
        Funcionario funcionario = new Funcionario("Francisco", "Desenvolvedor");

        // 2. Criar as dependências (injeções)
        Notificador notificador = new EmailNotificador(); // Ou new SMSNotificador();
        ExportadorRelatorio exportador = new ExportadorPDF(); // Ou new ExportadorCSV();

        // 3. Criar os serviços
        ServicoNotificacao servicoNotificacao = new ServicoNotificacao(notificador);
        ServicoRelatorio servicoRelatorio = new ServicoRelatorio(exportador);
        FolhaPagamento folhaPagamento = new FolhaPagamento();

        // 4. Criar o serviço principal
        FuncionarioService funcionarioService = new FuncionarioService(
            servicoNotificacao,
            servicoRelatorio,
            folhaPagamento
        );

        // 5. Usar os serviços
        System.out.println("=== Cálculo de Salário ===");
        funcionarioService.calcularSalario("freelancer", 5000.0);

        System.out.println("\n=== Relatório ===");
        funcionarioService.gerarRelatorio(funcionario);

        System.out.println("\n=== Notificação ===");
        funcionarioService.enviarNotificacao("franciscocjn@gmail.com", "Seu pagamento foi processado com sucesso.");
    }
}
