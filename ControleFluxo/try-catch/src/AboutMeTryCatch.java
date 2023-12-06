import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeTryCatch {
    public static void main(String[] args) {
        try {
            // criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Agora seu sobrenome");
            String sobrenome = scanner.next();
            
            System.out.println("Sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();
            

            System.out.println("Olá, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "m");

            scanner.close();   
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de que os campos estão preenchidos corretamente.");
        }
    }
}
