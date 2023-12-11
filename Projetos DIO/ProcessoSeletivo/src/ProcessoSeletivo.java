import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        ArrayList<String> candidatoSelecionados = selecaoCandidatos();

        System.out.println("Os candidatos selecionados foram: ");
        for (String candidato : candidatoSelecionados) {
            System.out.println(candidato);
        }

        for (String candidato : candidatoSelecionados) {
            ligacaoCandidato(candidato);
        }
    }

    static boolean atender() {
        return ThreadLocalRandom.current().nextInt(3) == 1;
    }

    static void ligacaoCandidato(String candidato) {
		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa");
		else
			System.out.println("Não conseguimos contato com " + candidato +", número máximo de tentativas (" + tentativasRealizadas + ") realizada");
		
		
	}

    static ArrayList<String> selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        ArrayList<String> candidatosSelecionados = new ArrayList<>();

        int candidatosSelecionadosCount = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionadosCount < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionadosCount++;
                candidatosSelecionados.add(candidato);
            }

            candidatoAtual++;
        }

        return candidatosSelecionados;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com uma contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
