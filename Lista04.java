package primeiroProjeto;

import java.util.Scanner;

public class Lista04 {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner (System.in)) {
		
		    // 1 - Verificar maioridade
			
			System.out.println("Qual a sua idade? ");
			int idade = scanner.nextInt();
			if (idade >= 18) {
				System.out.println("Você tem " + idade + " anos e é maior de idade");
			} else {
				System.out.println("Você tem " + idade + " anos e é menor de idade");
			}
		    
			// 2 - Comparar dois números
	        System.out.print("Informe o primeiro número ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Informe o segundo número ");
	        double num2 = scanner.nextDouble();
	        if (num1 > num2) {
	        	System.out.println("O primeiro número é maior que o segundo.");
	        } else {
	        	System.out.println("O segundo número é maior ou eles são iguais.");
	        }
			
	        // 3 - Aprovação por nota
	        double nota;
			System.out.println("Informe sua nota. ");
			nota = scanner.nextDouble();
			
			if (nota >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
			   
			// 4 - Verificar número positivo
			System.out.println("Informe um número. ");
			double nmr = scanner.nextDouble();
			
			if (nmr > 0) {
				System.out.println("O número " + nmr + " é positivo");
			} else {
				System.out.println("O número " + nmr + " é negativo ou zero");
			}
			
			// 5 - Cálculo de frete
			System.out.println("Qual a distância de entrega em km? ");
			double dist = scanner.nextDouble();
			double freteAlto = (dist * 0.5);
			if (dist <= 50) {
				System.out.println("Valor do frete: R$ 10,00");
			} else {
				System.out.println("Valor do frete: R$ " + freteAlto);
			}
			
			// 6 - O Número é 10?
			System.out.println("Informe um número. ");
			double n = scanner.nextDouble();
			if (n == 10) {
				System.out.println("O número é 10.");
			} else {
				System.out.println("O número não é 10.");
			}
			
			// 7 - Desconto para Associados
			System.out.println("Você é associado da loja? Responda com 'Sim' ou 'Não'");
			String resp = scanner.next();
			if (resp == "Sim") {
				System.out.println("Você tem desconto.");
			} else {
				System.out.println("Você não tem desconto.");
			}
			
			// 8 - Cálculo de bônus por horas extras
			System.out.println("Qual o seu número de horas extras trabalhadas? ");
			double extras = scanner.nextDouble();
			double bonusMenor = extras * 20;
			double bonusMaior = extras * 15;
			if (extras < 10) {
				System.out.println("Bônus por hora extra: R$ " + bonusMenor);
			} else {
				System.out.println("Bônus por hora extra: R$ " + bonusMaior);
			}
			   
		}

	}

}
