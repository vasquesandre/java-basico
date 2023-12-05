public class Metodos {
    public static double somar(int n1, int n2) {
        double x = n1 + n2;
        return x;
    }

    public static void imprimir(String nomeUm, String nomeDois) {
        String nome = nomeUm + nomeDois;
        System.out.println(nome);
    }

    public static void main(String[] args) {
        System.out.println(somar(2, 2));
        imprimir("andre", "vasques");
    }
}