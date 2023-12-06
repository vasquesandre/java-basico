public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 0; numero <= 7; numero++) {
            if (numero == 3) {
                continue;
            }

            if (numero == 6) {
                break;
            }

            System.out.println(numero);
        }
    }
}
