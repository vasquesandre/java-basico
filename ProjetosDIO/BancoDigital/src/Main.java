public class Main {
    public static void main(String[] args) {
        Cliente andre = new Cliente();
        andre.setNome("Andre");

        Conta corrente = new ContaCorrente(andre);
        Conta poupanca = new ContaPoupanca(andre);

        corrente.depositar(100);
        corrente.transferir(50, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
