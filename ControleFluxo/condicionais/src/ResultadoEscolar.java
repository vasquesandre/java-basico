import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Sua média foi " + media + ". Você está APROVADO!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Sua média foi " + media + ". Você está de RECUPERAÇÃO!");
        } else {
            System.out.println("Sua média foi " + media + ". Você está REPROVADO!");
        }

        // OU

        /**
         * String resultado = media >= 7 ? "APROVADO" : media >=5 && media < 7 ? "de RECUPERAÇÃO" : "REPROVADO";
         * System.out.println("Sua média foi " + media + ". Você está " + resultado);
         */

        sc.close();
    }
}
