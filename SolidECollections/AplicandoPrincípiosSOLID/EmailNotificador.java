package AplicandoPrincípiosSOLID;

public class EmailNotificador implements Notificador{

    @Override
    public void enviar(String email, String mensagem) {
        System.out.println("Enviando e-mail para " + email + ": " + mensagem);
    }
    
}
