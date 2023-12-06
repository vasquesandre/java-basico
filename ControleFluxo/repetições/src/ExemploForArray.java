public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "ANDRE", "FELIPE", "NICOLE", "LUANA" };

        for (int x = 1, a = 0; a < alunos.length; x++, a++) {
            System.out.println("O " + x + "º aluno é: " + alunos[a]);
        }
    }
}
