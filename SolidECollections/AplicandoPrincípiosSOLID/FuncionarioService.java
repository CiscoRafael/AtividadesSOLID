package AplicandoPrincípiosSOLID;

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

    public void calcularSalario(String tipo, double valorBase){
        folhaPagamento.calcularSalario(tipo, valorBase);
    }

    public void gerarRelatorio(Funcionario funcionario){
        servicoRelatorio.gerarRelatorio(funcionario);
    }

    public void enviarNotificacao(String destinatario, String mensagem){
        servicoNotificacao.enviarNotificacao(destinatario, mensagem);
    }
}
