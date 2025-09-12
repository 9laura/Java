package primeiroProjeto;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*1 - Contador:
		Mostre os números de 10 a 30 no console.*/
		
		System.out.println("Números de 10 a 30");
		int contador = 10;
		while (contador <= 30) {
			System.out.println(contador++);
		}
		
		/*2 - Soma de Números Digitados:
		Peça 3 números inteiros ao usuário repetidamente
		usando um laço while. Some todos os números digitados e mostre o total.*/
		
		System.out.println("---------------------------------------");
		System.out.println("Soma de 3 números inteiros");
		int cont=1;
		int soma = 0;
		while (cont<=3) {
			System.out.println("Digite o número "+cont);
			int num = scanner.nextInt();
			soma = soma + num ;
			cont++;
		}
		System.out.println("A soma é: " + soma);
		
		/*3 - Multiplicação de Números Digitados:
		Peça 5 números inteiros ao usuário repetidamente
		usando um laço while. Multiplique todos os números digitados e mostre o total.*/
		
		System.out.println("---------------------------------------");
		System.out.println("Multiplicação de 5 números inteiros");
		int con=1;
		int mult = 1;
		while (con<=5) {
			System.out.println("Digite o número "+con);
			int num1 = scanner.nextInt();
			mult = mult * num1 ;
			con++;
		}
		System.out.println("O resultado da multiplicação é: " + mult);
		
		/*4 - Contar até o número informado:
		Peça um número inteiro para o usuário e mostre a sequência
		numérica (começando no 1) até o número informado.*/
		
		System.out.println("---------------------------------------");
		System.out.println("Digite um número inteiro");
		int num2 = scanner.nextInt();
		int conta = 1;
		while (conta <= num2) {
			System.out.println(conta++);
		}
		
		/*5 - Somar os números de 1 a 5:
		Escreva um programa que use um laço while para calcular e exibir
		a soma dos números de 1 a 5 (ou seja, 1 + 2 + 3 + 4 + 5).*/
		
		System.out.println("---------------------------------------");
		System.out.println("Soma e dos números de 1 a 5");
		int numeros = 1;
		int mais = 0;
		while (numeros<=5) {
			mais = mais + numeros;
			numeros++;
		}
		System.out.println(mais);
		
		/*6 - Tabuada
		Peça um número para o usuário e mostre a tabuada dele*/
		
		System.out.println("---------------------------------------");
		System.out.println("Digite um número e descubra sua tabuada");
		int num1 = scanner.nextInt();
		int tabuada=0;
		while (tabuada <10) {
			tabuada++;
			int resul = num1*tabuada;
			System.out.println(num1+"x"+tabuada+"="+resul);
		}
		

		
		
		
	 
		
    }
}
