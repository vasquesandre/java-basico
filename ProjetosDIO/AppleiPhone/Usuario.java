package ProjetosDIO.AppleiPhone;

import ProjetosDIO.AppleiPhone.AppleMusic.AppleMusic;
import ProjetosDIO.AppleiPhone.Phone.Phone;
import ProjetosDIO.AppleiPhone.Safari.Safari;
import ProjetosDIO.AppleiPhone.iPhone.IPhone;

public class Usuario {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        Phone telefone = (Phone) iphone;
        AppleMusic music = (AppleMusic) iphone;
        Safari safari = (Safari) iphone;

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        music.reproduzir();
        music.pausar();
        music.selecionarMusica();

        safari.adicionarNovaAba();
        safari.atualizarPagina();
        safari.exibirPagina();
    }
}
