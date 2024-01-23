package polimorfismo;

import polimorfismo.apps.Facebook;
import polimorfismo.apps.MSNMessenger;
import polimorfismo.apps.ServicoMensagemInstantanea;
import polimorfismo.apps.Telegram;

public class Computador {
    public static void main(String[] args) {
        
        ServicoMensagemInstantanea smi = null;

        /*
         * Não se sabe qual app será escolhido, mas qualquer um deve enviar e receber mensagem
         */

        String appEscolhido = "fb";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fb")) {
            smi = new Facebook();
        } else if (appEscolhido.equals("tl")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}