package AplicandoPrincípiosSOLID;

public class ServicoNotificacao {
    private final Notificador notificador;

    public ServicoNotificacao(Notificador notificador) {
        this.notificador = notificador;
    }

    public void enviarNotificacao(String destinatario, String mensagem) {
        notificador.enviar(destinatario, mensagem);
    }
}
