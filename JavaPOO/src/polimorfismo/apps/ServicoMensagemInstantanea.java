package polimorfismo.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente os filhos e classes do mesmo pacote conhecem este método, no caso o msn, fb e tl
    protected void validarConexaoInternet() {
        System.out.println("Validando conexão com a internet");
    }
}
