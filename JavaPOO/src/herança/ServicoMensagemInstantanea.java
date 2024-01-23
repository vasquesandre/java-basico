package herança;

public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMnesagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    private void validarConexaoInternet() {
        System.out.println("Validando conexão com a internet");
    }

    private void salvarHistoricoMnesagem() {
        System.out.println("Mensagem salva");
    }
}
