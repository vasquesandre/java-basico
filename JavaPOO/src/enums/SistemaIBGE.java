package enums;

public class SistemaIBGE {
    public static void main(String[] args) {
        for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMiausculo());
        System.out.println(eb.getIbge() );
    }
}
