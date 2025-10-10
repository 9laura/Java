package primeiroProjeto;

import java.util.Scanner;

public class SistemaCinema {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// Filmes disponíveis por classificação indicativa
			
			String[] filmes = {
			    "1 - Toy Story (Livre)",
			    "2 - Harry Potter (10 anos)",
			    "3 - Os Vingadores (12 anos)",
			    "4 - Deadpool (14 anos)",
			    "5 - O Exorcista (16 anos)"
			};

		    System.out.println("CINEMA SYSTEM");
			System.out.println("Filmes disponíveis:");
			for (String filme : filmes) {
			    System.out.println(filme);
			}

			int idade =-1;
	        do {
	            System.out.print("\nDigite sua idade: ");
	                idade = sc.nextInt();
	                if (idade > 0) {
		                break;
		            } else {
		                System.out.println("Resposta inválida! Digite um número positivo.");
		            }
	        } while (idade < 0);
	        sc.nextLine(); 

	        String estudante = "";
	         do {
	            System.out.print("Você é estudante? (S/N): ");
	            estudante = sc.nextLine().trim().toUpperCase();

	            if (estudante.equals("S") || estudante.equals("N")) {
	                break;
	            } else {
	                System.out.println("Resposta inválida! Digite apenas S ou N.");
	            }
	        } while (true);
	        
	        
	     int tipoFilme = 0;
			do {
			System.out.println("\nTipo de filme:");
			System.out.println("1 - Filme Normal (R$20,00)");
			System.out.println("2 - Filme 3D (R$30,00)");
			System.out.print("Escolha o tipo: ");
			
			
			if (sc.hasNextInt()) {
		        tipoFilme = sc.nextInt();
		        if (tipoFilme != 1 && tipoFilme != 2) {
		        	System.out.println("Opção inválida! Escolha 1 ou 2.");
		        }
		    } else {
		        break;
		       
		    }
			}while (tipoFilme != 1 && tipoFilme !=2 );
			
			
			
			
			int classificacao = 0;
			int opcaoFilme =0;
			while (opcaoFilme < 1 || opcaoFilme > 5 || idade < classificacao) {System.out.print("\nEscolha o filme (1 a 5): ");
            if (sc.hasNextInt()) {
                opcaoFilme = sc.nextInt();
                if (opcaoFilme < 1 || opcaoFilme > 5) {
                    System.out.println("Opção inválida! Escolha entre 1 e 5.");
                }
            } else {
                System.out.println("Entrada inválida! Digite apenas números.");
                sc.next();
            }
        }

        // Definindo nome e classificação do filme
        String nomeFilme = "";
        

        switch (opcaoFilme) {
            case 1:
                nomeFilme = "Toy Story";
                classificacao = 0;
                break;
            case 2:
                nomeFilme = "Harry Potter";
                classificacao = 10;
                break;
            case 3:
                nomeFilme = "Os Vingadores";
                classificacao = 12;
                break;
            case 4:
                nomeFilme = "Deadpool";
                classificacao = 14;
                break;
            case 5:
                nomeFilme = "O Exorcista";
                classificacao = 16;
                break;
        }

        // Verificação da idade mínima
        if (idade > classificacao) {
        	System.out.println("Ok!");
        }else{
            System.out.println("\n"
            		+ "Idade não permitida para assistir a esse filme!");
            sc.next();
        }
        
        
			int quantidade;
			System.out.print("\nQuantos ingressos deseja comprar? ");
			quantidade = sc.nextInt();

			double precoBase = (tipoFilme == 1) ? 20.0 : 30.0;
			double total = precoBase * quantidade;
			

			// Verifica desconto
			boolean desconto = (idade < 12 || idade > 60 || estudante.equals("S"));
			if (desconto) {
			    total = total / 2;
			}

			// Tipo do filme
			String tipo = (tipoFilme == 1) ? "Normal" : "3D";

			System.out.println("\nRESUMO DA COMPRA");
			System.out.println("Filme: " + nomeFilme);
			System.out.println("Tipo: " + tipo);
			System.out.println("Ingressos: " + quantidade);
			System.out.printf("Valor total: R$ %.2f\n", total);
			
		
		System.out.println("\nObrigado por comprar com o Cinema System!");
		
			
			}
	}
	
}