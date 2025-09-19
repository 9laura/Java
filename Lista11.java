package primeiroProjeto;

import java.util.Scanner;

public class Lista11 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//Contador
			
			int cont = 1;
			do {
				System.out.println(cont);
				cont+=2;
			} while ( cont <=31 );
			
			// Advinhação de número 
			
			System.out.println("--------------------------------");
			int cont1 = 1;
			int num;
			do {
				System.out.println("Informe um número");
				num = sc.nextInt();
				cont1 ++;
				if(num != 100) {
					System.out.println("Tente novamente");
				}
			} while (num != 100);
			System.out.println("Acertou!!");
			
			// Menu interativo
			
			System.out.println("--------------------------------");
			int opcao;
			do {
				System.out.println("Escolha uma opção de navegação");
				System.out.println("1 - Continuar");
				System.out.println("2 - Sair");
				System.out.println();
				opcao = sc.nextInt();
				if (opcao == 1 ) {
					System.out.println("Você escolheu continuar!");
					System.out.println();
				} else if (opcao != 1 & opcao != 2) {
					System.out.println("ERRO");
					System.out.println("Resposta invalida");
					System.out.println();
				}
			} while (opcao != 2);
			System.out.println("Você escolheu sair");
			
			// Classificação de números
			
			System.out.println("--------------------------------");
			System.out.println("Informe cinco números: ");
			int num1;
			int contador1 = 1;
			do {
				num1 = sc.nextInt();
				if(num1 < 10) {
					System.out.println("Tipo A");
				} else if (num1 < 20) {
					System.out.println("Tipo B");
				} else {
					System.out.println("Fora da categoria");
				}
				contador1++;
			}while (contador1 <= 5);
			
			// Temperatura do forno
			
			System.out.println("--------------------------------");
	        int temperatura;
	        do {
	            System.out.println("Digite a temperatura do forno:");
	            temperatura = sc.nextInt();

	            if (temperatura >= 200) {
	                System.out.println("ALERTA! Temperatura muito alta!");
	            }
	        } while (temperatura >= 200);
	        System.out.println("Temperatura dentro da faixa segura!");

	        // Verificação de bateria
	        System.out.println("------------------------");
	        int bateria;
	        do {
	            System.out.println("Digite o nível da bateria (%):");
	            bateria = sc.nextInt();

	            if (bateria <= 20) {
	                System.out.println("Bateria baixa!");
	            }
	        } while (bateria <= 20);
	        System.out.println("Bateria em nível seguro!");

	        // Deseja fazer uma conta?
	        System.out.println("------------------------");
	        String resposta;
	        System.out.println("Deseja fazer uma conta? (sim/não)");
	        resposta = sc.next();

	        if (resposta.equalsIgnoreCase("sim")) {
	            System.out.println("Digite o primeiro número:");
	            int n1 = sc.nextInt();
	            System.out.println("Digite o segundo número:");
	            int n2 = sc.nextInt();
	            int soma = n1 + n2;
	            System.out.println("Resultado da soma: " + soma);
	        }      
			
		}

	}
