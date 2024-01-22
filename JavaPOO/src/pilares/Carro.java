package pilares;

public class Carro extends Veiculo {

    public void ligar() {
        verificarCambio();
        verificarCombustivel();
        System.out.println("Carro ligado");
    }

    private void verificarCombustivel() {
        System.out.println("Verificando combustível");
    }

    private void verificarCambio() {
        System.out.println("Câmbio em P");
    }
}
