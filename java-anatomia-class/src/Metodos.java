
public class Metodos {
    public static void main(String[] args) {
        String primeiroNome = "Andre";
        String segundoNome = "Vasques";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}