package pilares;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("456165");
        jeep.ligar();

        Moto z1000 = new Moto();
        z1000.setChassi("187454");
        z1000.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();
    }
}