public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        /// string
        String meuNome = "Andre";
        System.out.println(meuNome); 

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // quando vamos transformar um numero mais abrangente em um menos abrangente, declamaramos qual
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        // variavel pode ser alterada
        int numero = 1;
        numero = 2;
        System.out.println(numero);

        //nao pode ser alterado, com final e o nome da variavel em maisculo
        final int NUMERO = 1;
        //NUMERO = 5;
        System.out.println(NUMERO);

    }
}
