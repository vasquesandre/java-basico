package abstração;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem do Telegram");
    }
}
