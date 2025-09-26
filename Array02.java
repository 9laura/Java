package primeiroProjeto;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			/*1 - Criando um vetor de cores
			 Crie um vetor de 6 posições para armazenar
			 nomes de cores. Peça para o usuário digitar
             as cores e depois mostre todas na tela.*/
			
			 String[] cores = new String[6];
			 for (int i = 0; i < cores.length; i++) {
			 System.out.print("Digite a " + (i + 1) + "° cor: ");
			 cores[i] = sc.nextLine();
			 }
			 System.out.println("\nCores digitadas: ");
			 for (String cor : cores) {
			 System.out.println(cor);
			 }
			
			/*2 - Vetor de números decimais
			 Crie um vetor com 8 posições para guardar números
			 decimais (double). Leia os valores digitados pelo
			 usuário e depois exiba todos os valores digitados.*/  
			 
			 double[] num = new double[8];
			 for (int i = 0; i < num.length; i++) {
			 System.out.print("Digite o " + (i + 1) + " número: ");
			 num[i] = sc.nextDouble();
			 }
			 System.out.println("\nNúmeros digitadas: ");
			 for (double n : num) {
			 System.out.println(n);
			 }
	  
            /*3 - Mostrando apenas os pares
            Leia 10 números inteiros, guarde-os em um vetor e
            depois mostre apenas os números pares digitados.*/
             
			 int[] inteiro = new int[10];
			 inteiro [0] = 1;
			 inteiro [1] = 2;
			 inteiro [2] = 3;
			 inteiro [3] = 4;
			 inteiro [4] = 5;
			 inteiro [5] = 6;
			 inteiro [6] = 7;
			 inteiro [7] = 8;
			 inteiro [8] = 9;
			 inteiro [9] = 10;
			 
			 for (int i = 0; i < 10; i++) {
				 System.out.print("Digite o " + (i + 1) + "° número: ");
			     inteiro [i] = sc.nextInt();
			 } 
			 for (int i = 0; i < 10; i++) {
			 if (inteiro [i] % 2 == 0) {
				 System.out.println(inteiro[i]);
				 }}
             
            /*4 - Menores que 50
            Leia 12 números. Se um número for menor que 50,
            mostre a mensagem: “menor que 50”; caso contrário,
            apenas continue.*/
			 
			 int[] n = new int[12];
			 
			 for (int i = 0; i < 12; i++) {
				 System.out.print("Digite o " + (i + 1) + "° número: ");
			     n [i] = sc.nextInt();
			     if (n [i] < 50) {
					 System.out.println("Menor que 50");}
			 }
			 
            /*5 - Procurando um nome no vetor
            Leia 5 nomes e depois peça um nome extra para procurar
            no vetor. Informe se o nome existe ou não.*/
			 
			 String [] nomes = new String [5];
			 
			 nomes[0] = "Laura";
			 nomes[1] = "Eduarda";
			 nomes[2] = "Kath";
			 nomes[3] = "Luis";
			 nomes[4] = "Bel";
			 
			 for (int i = 0; i < 5; i++) {
				 System.out.print("Digite o " + (i + 1) + "° nome: ");
				 String pesquisa = sc.nextLine();
				 boolean encontrado = false;
				 
			        
			     for (String nome : nomes) {
			            if (nome.equalsIgnoreCase(pesquisa)) { // ignore maiúsculas/minúsculas
			                encontrado = true;
			                break; // já achou, pode sair do loop
			            }
			        }

			        // Mostrar resultado
			     if (encontrado) {
			            System.out.println("Nome encontrado!");
			        } else {
			            System.out.println("Nome não encontrado.");
			        }
			 
			 }
            /*6 - Produto e preço
            Crie dois vetores: um para nomes de produtos e outro
            para preços. Leia os dados de 4 produtos e depois mostre
            as frases no formato: “O produto X custa R$Y”.*/
			 
			 String[] produtos = new String[4];
				double[] precos = new double[4];
				for (int i = 0; i < 4; i++) {
					System.out.println("Digite o " + (i+1) + "° produto ");
					produtos[i] = sc.next();
					System.out.println("Digite o preço do produto[" + i + "]: ");
					precos[i] = sc.nextDouble();
				}
				System.out.println("Mostrando os produtos e preços");
				for (int i = 0; i < 4; i++) {
					System.out.println("O produto " + produtos[i] + " custa R$" + precos[i]);
				}
			 
            /*7 - Verificação de notas
            Leia um vetor com 6 notas (double). Para cada nota menor
            que 6, mostre a mensagem: “aluno reprovado”, para cada nota
            entre 6 e 7 mostre “aluno em recuperação” e para acima de 7
            mostre “aluno aprovado”*/
			 
				double[] notas = new double[6];
				for (int i = 0; i < 6; i++) {
					System.out.println("Digite a " + (i+1) + "° nota");
					notas[i] = sc.nextDouble();
				}
				System.out.println("Resultado dos alunos");
				for (int i = 0; i < 6; i++) {
					if (notas[i] < 6) {
						System.out.println("Nota " + (i+1) + " = " + notas[i] + " Aluno reprovado");
					} else if (notas[i] >= 6 && notas[i] <= 7) {
						System.out.println("Nota " + (i+1) + " = " + notas[i] + " Aluno em recuperação");
					} else {
						System.out.println("Nota " + (i+1) + " = " + notas[i] + " Aluno aprovado");
					}
				}
			 
            /*8 - Promoção de ingressos
            Crie um vetor de 5 posições para armazenar preços de
            ingressos. Se o preço for maior que 100, mostre a mensagem:
            “Ingresso com promoção disponível!”.*/

				double[] ingressos = new double[5];
				for (int i = 0; i < 5; i++) {
					System.out.println("Digite o preço do ingresso do " + (i+1)+": ");
					ingressos[i] = sc.nextDouble();
				}
				System.out.println("Verificando promoções");
				for (int i = 0; i < 5; i++) {
					if (ingressos[i] > 100) {
						System.out
								.println("ingressos " + (i+1)  + " = R$" + ingressos[i] + " -> Ingresso com promoção disponível!");
					} else {
						System.out.println("ingressos " + (i+1) + " = R$" + ingressos[i]);
					}
			
				}
	}
}

