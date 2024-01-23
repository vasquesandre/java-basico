package interfaces.estabelecimento;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.copiadora.Xerox;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.digitalizadora.Scanner;
import interfaces.equipamentos.impressora.Deskjet;
import interfaces.equipamentos.impressora.Impressora;
import interfaces.equipamentos.impressora.Laserjet;
import interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressoraEM = em;
        impressoraEM.imprimir();
        Impressora impressoraDesk = new Deskjet();
        impressoraDesk.imprimir();
        Impressora impressoraLaser = new Laserjet();
        impressoraLaser.imprimir();

        Digitalizadora digitalizadoraEM = em;
        digitalizadoraEM.digitalizar();
        Digitalizadora digitalizadora = new Scanner();
        digitalizadora.digitalizar();

        Copiadora copiadoraEM = em;
        copiadoraEM.copiar();
        Copiadora copiadora = new Xerox();
        copiadora.copiar();
    }
}
