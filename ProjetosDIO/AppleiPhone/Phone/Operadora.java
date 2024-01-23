package ProjetosDIO.AppleiPhone.Phone;

public class Operadora implements Phone {
    public void ligar() {
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Recebendo chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
