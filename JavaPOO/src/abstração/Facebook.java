package abstração;

public class Facebook extends ServicoMensagemInstantanea {

    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem do Facebook");
    }
    
}
