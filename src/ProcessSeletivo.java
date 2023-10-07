import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessSeletivo {

    public static void main(String[] args) {
        String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		//primeiro um for para selecionar os candidatos
		for(String candidato: candidatosSelecionados) {
			entrandoEmContato(candidato);
		}

    }

    static void entrandoEmContato(String candidato) {
        int tentativasContato = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
          atendeu = atender();
          continuarTentando = !atendeu;
          if (continuarTentando) {
            tentativasContato++;
          } 
        } while(continuarTentando && tentativasContato < 3);
        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasContato + " TENTATIVA");
		else    
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", EM " + tentativasContato + " TENTATIVAS REALIZADAS");
		
    }

    static void imprimirCandidatos() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
        System.out.println("Imprimindo a lista de candidatos abaixo:");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de número " + (i + 1) + " é o " + candidatos[i]);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("candidato " + candidato + " Solicitou um salário de " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("o candidato " + candidato + " selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void AnalisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resutaldo do demais candidatos");
        }
    }

    // métodos auxiliares
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}