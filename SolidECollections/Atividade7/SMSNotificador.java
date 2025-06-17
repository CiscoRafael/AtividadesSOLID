package Atividade7;

public class SMSNotificador implements Notificador{
    @Override
    public void enviar(String numeroTelefone, String mensagem) {
       System.out.println("Enviando SMS para " + numeroTelefone + ": " + mensagem);
    }

}
