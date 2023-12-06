import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do plano para saber mais (BASIC, MID, TURBO): ");
        String plano = sc.nextLine();

        System.out.println("No plano " + plano + " você tem: ");

        switch (plano) {
            case "TURBO": {
                System.out.println("5GB de YouTube.");
            }
            case "MID": {
                System.out.println("WhatsApp e Instagram ilimitados");
            }
            case "BASIC": {
                System.out.println("100 minutos de ligação");
            }
        }

        sc.close();
    }
}
