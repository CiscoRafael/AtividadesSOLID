package Atividade7;

public class FuncionarioService {
    private final ServicoNotificacao servicoNotificacao;
    private final ServicoRelatorio servicoRelatorio;
    private final FolhaPagamento folhaPagamento;

    public FuncionarioService(ServicoNotificacao servicoNotificacao, ServicoRelatorio servicoRelatorio,
                              FolhaPagamento folhaPagamento) {
        this.servicoNotificacao = servicoNotificacao;
        this.servicoRelatorio = servicoRelatorio;
        this.folhaPagamento = folhaPagamento;
    }

    public void calcularSalario(Salario salario, double valorBase){
        folhaPagamento.calcularSalario(salario, valorBase);
    }

    public void gerarRelatorio(Funcionario funcionario){
        servicoRelatorio.gerarRelatorio(funcionario);
    }

    public void enviarNotificacao(String destinatario, String mensagem){
        servicoNotificacao.enviarNotificacao(destinatario, mensagem);
    }
}
