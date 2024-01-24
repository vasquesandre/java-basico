package ProjetosDIO.AppleiPhone.iPhone;

import ProjetosDIO.AppleiPhone.AppleMusic.AppleMusic;
import ProjetosDIO.AppleiPhone.Phone.Phone;
import ProjetosDIO.AppleiPhone.Safari.Safari;

public class IPhone implements AppleMusic, Phone, Safari {
    public void ligar() {
        System.out.println("Ligando pelo iPhone");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página pelo iPhone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba pelo iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página pelo iphone");
    }

    public void atender() {
        System.out.println("Atendendo telefone pelo iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo iphone");
    }

    public void reproduzir() {
        System.out.println("Reproduzindo música pelo iphone");
    }

    public void pausar() {
        System.out.println("Pausando música pelo iphone");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música pelo iphone");
    }
}
