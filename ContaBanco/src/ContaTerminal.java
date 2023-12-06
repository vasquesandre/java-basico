import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número do seu usuário:");
        int usuario = sc.nextInt();

        System.out.println("Digite o número da agência:");
        String agencia = sc.next();

        sc.nextLine();

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Valor que quer depositar:");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + usuario + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        sc.close();
    }
}
