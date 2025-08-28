package primeiroProjeto;

import java.util.Scanner;

public class OperadoresLogicos2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/* 1 - Classificação de Filme
		
		Peça a idade do espectador. Se for
		menor que 16 ou maior que 70, exiba
		"Classificação especial".  Senão exiba
		“Classificação regular”*/
		
		System.out.println("Qual a sua idade? ");
		int idade = scanner.nextInt();
		if (idade < 16 || idade > 70) {
			System.out.println("Classificação especial");
		} else {
			System.out.println("Classificação regular");
		}
		
		/*2 - Promoção de Produto
		
		Peça o valor do produto e 
		a quantidade comprada. Se 
		o valor total (valor * quantidade) 
		for maior que 200 e a quantidade for
		maior que 5, aplique 15% de desconto.*/
		
		System.out.println("Qual o valor do produto? ");
		double valorP = scanner.nextDouble();
		System.out.println("Qual a quantidade comprada? ");
		int quantidade = scanner.nextInt();
		double valorTotal = valorP * quantidade;
		double desconto = (valorTotal / 100) * 15;
		if (valorTotal > 200 && quantidade > 5) {
			System.out.println("Você tem 15% de desconto na sua compra! De R$ " + valorP + " para R$ " + desconto);
		} else {
			System.out.println("Você não desconto");
		}
		
		/*3 - Alerta de Saúde
		
		Peça a frequência cardíaca (em bpm) e
		se o paciente sente tontura (sim ou não).
		Se a frequência for maior ou igual a 100,
		ou o paciente sentir tontura, exiba
		"Procure atendimento médico". Senão exiba
		“Sem sinais de alerta”*/
		
	    System.out.println("Qual a sua frequência cardíaca? (em bpm)");
	    double frequencia = scanner.nextDouble();
	    System.out.println("Você sente tontura? (sim ou não)");
	    String tontura = scanner.next();
	    if (frequencia >= 100 || tontura.equalsIgnoreCase("sim")) {
	    	System.out.println("Procure atendimento médico");
	    } else {
	    	System.out.println("Sem sinais de alerta");
	    }
		
		/*4 - Participação em Concurso
		
		Peça a idade e se o candidato é
		residente do estado (sim ou não).
		Só pode participar se tiver entre
		18 e 30 anos (inclusive) e for
		residente, se as informações forem
		verdadeiras exiba "Elegível para o
		concurso" senão "Não elegível para
		o concurso".*/
		
		System.out.println("Qual a sua idade? ");
		int idade2 = scanner.nextInt();
		System.out.println("Você é residente do estado? (sim ou não)");
		String residente = scanner.next();
		if (idade2 >= 18 || idade2 <= 30 && residente.equalsIgnoreCase("sim")) {
			System.out.println("Elegível para o concurso");
		} else {
			System.out.println("Não elegível para o concurso");
		}
		
		/*5 - Recompensa por Desempenho
		
		Peça o número de projetos concluídos
		e o número de erros reportados.
		Se tiver mais de 10 projetos concluídos
		e menos de 3 erros, exiba "Recompensa
		concedida", senão, mostre “Sem recompensa”*/
		
		System.out.println("Qual o número de projetos concluídos? ");
		int concluidos = scanner.nextInt();
		System.out.println("Qual o número de erros reportados? ");
		int reportados = scanner.nextInt();
		if (concluidos > 10 && reportados < 3) {
			System.out.println("Recompensa concedida");
		} else {
			System.out.println("Sem recompensa");
		}
		
		/*6 - Autorização para Viagem

		Peça a idade e se possui passaporte
		válido (sim ou não). Pode viajar se
		tiver 18 anos ou mais e possuir
		passaporte, se sim exiba "Viagem
		autorizada" senão "Viagem não autorizada".*/
		
		System.out.println("Qual a sua idade?");
		int idade3 = scanner.nextInt();
		System.out.println("Você tem passaporte válido? (sim ou não)");
		String passaporte = scanner.next();
		if (idade3 >= 18 && passaporte.equalsIgnoreCase("sim")) {
			System.out.println("Viagem autorizada");
		} else {
			System.out.println("Viagem não autorizada");
		}
		
		/*7 - Aprovação em Curso Online

		Peça a nota final (0 a 100) e o
		número de aulas assistidas (0 a 50).
		O aluno é aprovado se tiver nota maior
		ou igual a 70 e assistir pelo menos 80%
		das aulas (40 aulas). Se as informações
		forem verdadeiras exiba "Aprovado" senão
		"Reprovado".*/

		System.out.println("Qual a sua nota final? (0 a 100)");
		double nota = scanner.nextDouble();
		System.out.println("E o número de aulas assistidas? (0 a 50)");
		int aulas = scanner.nextInt();
		if (nota >= 70 && aulas >= 40) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		/*8 - Controle de Irrigação

		Peça a umidade do solo e a temperatura.
		O sistema deve irrigar se a umidade
		for menor que 30% ou a temperatura for
		maior que 30°C, se sim, exiba "Irrigação
		necessária" senão "Irrigação não necessária".*/
		
		System.out.println("Qual a umidade do solo? ");
		int umidade = scanner.nextInt();
		System.out.println("E a temperatura? ");
		int temp = scanner.nextInt();
		if (umidade < 30 || temp > 30) {
			System.out.println("Irrigação necessária");
		} else {
			System.out.println("Irrigação não necessária");
		}
		
		/*9 - Inscrição em Feira Profissional
		Peça a idade e se o candidato possui
		experiência prévia (sim ou não). Só
		pode se inscrever se tiver entre 20
		e 40 anos (inclusive) e possuir
		experiência. Se as informações forem
		positivas, exiba "Inscrição aceita"
		senão "Inscrição não permitida".*/

		System.out.println("Qual a sua idade? ");
		int idade4 = scanner.nextInt();
		System.out.println("Você possui experiência prévia? (sim ou não)");
		String experiencia = scanner.next();
		if (idade4 >= 20 || idade4 <= 40 && experiencia.equalsIgnoreCase("sim")) {
			System.out.println("Inscrição aceita");
		} else {
			System.out.println("Inscrição não permitida");
		}

	}

}
