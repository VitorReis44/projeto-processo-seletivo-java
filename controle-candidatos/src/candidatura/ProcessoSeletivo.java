package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
public static void main(String[] args) {
	String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PABLO", "AUGUSTO"};
	for(String candidato : candidatos) {
		entrandoEmContato(candidato);
	}
}

static void entrandoEmContato(String candidato) {
	int tentativasRealizadas = 1;
	boolean continuarTentando = true;
	boolean atendeu = false;
	do {
		atendeu = atender();
		continuarTentando = !atendeu;
		if(continuarTentando)
			tentativasRealizadas++;
		else
			System.out.println("CONTATO REALIZADO COM O CANDIDATO");
	}while(continuarTentando && tentativasRealizadas < 3);
	
	if(atendeu)
		System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
	else
		System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas);
}

//método auxiliar
 static boolean atender() {
	 return new Random().nextInt(3) == 1;
 }

 static void imprimirSelecionados() {
	 String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PABLO", "AUGUSTO"};
	 System.out.println("Imprimindo lista de candidatos informando o índice do elemento");
	 //forma simples
	 for(int indice = 0; indice < candidatos.length; indice++ ) {
		 System.out.println("O candidato de n° " + (indice + 1) + " é " + candidatos[indice]);
		 
		 //forma abreviada
		 System.out.println("Forma abreviada de impressão for each");
		 
		 for(String candidato : candidatos) {
			 System.out.println("O candidato selecionado foi: " + candidato);
		 }
	 }

 }

 static void selecaoCandidatos() {
	String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PABLO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
	
	int candidatosSelecionados = 0;
	int candidatoAtual = 0;
	Double salarioBase = 2000.0;
	while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
		String candidato = candidatos[candidatoAtual];
		Double salarioPretendido = valorPretendido();
		
		System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
		if(salarioBase >= salarioPretendido) {
			System.out.println("O candidato " + candidato + " foi selecionado para vaga");
			candidatosSelecionados++;
		}
		candidatoAtual++;
	}
}

 static double valorPretendido() {
	return ThreadLocalRandom.current().nextDouble(1800, 2200);
}

 static void analisarCandidato(Double salarioPretendido){
	Double salarioBase = 2000.0;
	
	if(salarioBase > salarioPretendido){
		System.out.println("LIGAR PARA O CANDIDATO");
	}else if(salarioBase == salarioPretendido) {
		System.out.println("LIGA COM CONTRAPROPOSTA");
	}else {
		System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
	}
}
}

