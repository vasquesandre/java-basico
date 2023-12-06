 public class Operadores {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String conc = "?";
        conc = 1+1+1+"1";
        System.out.println(conc);
        conc = 1+"1"+1+1;
        System.out.println(conc);
        conc = 1+"1"+1+"1";
        System.out.println(conc);
        conc = "1"+1+1+1;
        System.out.println(conc);
        conc = "1"+(1+1+1);
        System.out.println(conc);

        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);
        numero = - numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        int increm = 0;
        System.out.println(increm);
        increm++;
        System.out.println(increm);
        System.out.println(++ increm );
        increm--;
        System.out.println(increm);
        System.out.println(-- increm);

        boolean variavel = true;
        System.out.println(!variavel);
        variavel = !variavel;
        System.out.println(variavel);

        // ternario, <expressao condicional> ? <caso seja verdadeira> : <caso seja falsa>
        int a, b;
        a = 5;
        b = 6;
        //String resultado = "";
        //if (a==b)
        //    resultado = "verdadeiro";
        //else 
        //    resultado = "falso";
        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //RELACIONAIS, ==, !=, >, <, >=, <=
        int n1 = 1;
        int n2 = 2;

        boolean simNao = n1 == n2;
        System.out.println(simNao);

        simNao = n1 != n2;
        System.out.println(simNao);

        if (n1 > n2) {
            System.out.println("verdadeira");
        } else {
            System.out.println("falsa");
        }

        String nomeUm = "Andre";
        String nomeDois = new String("Andre");
        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

        //LOGICOS, && "E", || "OU"
        boolean cond1 = true;
        boolean cond2 = false;

        if (cond1 && cond2) {
            System.out.println("verdadeiras");
        } else {
            System.out.println("falsas");
        }

        if (cond1 || cond2) {
            System.out.println("verdadeira");
        }
    }
}
