package primeiroProjeto;

import java.util.Scanner;

public class Lista15 {

	public static void main (String[] args) {
	 Scanner sc = new Scanner(System.in);


		// 1 - Criando um vetor de frutas
		String[] frutas = new String[5];
		for (int i = 0; i < frutas.length; i++) {
		System.out.print("Digite o nome da fruta " + (i + 1) + ": ");
		frutas[i] = sc.nextLine();
		}
		System.out.println("\nFrutas digitadas:");
		for (String fruta : frutas) {
		System.out.println(fruta);
		}
		


		// 2 - Vetor de números inteiros
		
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
		System.out.print("Digite o número " + (i + 1) + ": ");
		numeros[i] = sc.nextInt();
		}
		System.out.println("\nNúmeros digitados:");
		for (int n : numeros) {
		System.out.println(n);
		}
		


		// 3 - Valores na ordem inversa
		
		int[] numeros3 = new int[7];
		for (int i = 0; i < numeros3.length; i++) {
		System.out.print("Digite o número " + (i + 1) + ": ");
		numeros3[i] = sc.nextInt();
		}
		System.out.println("\nNúmeros na ordem inversa:");
		for (int i = numeros3.length - 1; i >= 0; i--) {
		System.out.println(numeros3[i]);
		}
		


		// 4 - Maiores que 100
		
		int[] numeros2 = new int[10];
		for (int i = 0; i < numeros2.length; i++) {
		System.out.print("Digite o número " + (i + 1) + ": ");
		numeros2[i] = sc.nextInt();
		if (numeros2[i] > 100) {
		System.out.println("Maior do que 100");
		}
		}
		


		// 5 - Procurando um valor no vetor
		
		int[] numeros1 = new int[8];
		for (int i = 0; i < numeros1.length; i++) {
		System.out.print("Digite o número " + (i + 1) + ": ");
		numeros1[i] = sc.nextInt();
		}
		System.out.print("Digite o número para procurar: ");
		int busca = sc.nextInt();


		boolean encontrado = false;
		for (int n : numeros1) {
		if (n == busca) {
		encontrado = true;
		break;
		}
		}
		if (encontrado) {
		System.out.println("O número existe no vetor.");
		} else {
		System.out.println("O número NÃO existe no vetor.");
		}
		


		// 6 - Nome e idade de 5 pessoas
		
		String[] nomes = new String[5];
		int[] idades = new int[5];
		sc.nextLine(); // limpar buffer


		for (int i = 0; i < 5; i++) {
		System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
		nomes[i] = sc.nextLine();
		System.out.print("Digite a idade de " + nomes[i] + ": ");
		idades[i] = sc.nextInt();
		sc.nextLine();
		}


		System.out.println("\nLista de pessoas:");
		for (int i = 0; i < 5; i++) {
		System.out.println(nomes[i] + " tem " + idades[i] + " anos.");
		}
		


		// 7 - Identificação de idade
		int[] idades1 = new int[10];
		for (int i = 0; i < idades1.length; i++) {
		System.out.print("Digite a idade " + (i + 1) + ": ");
		idades1[i] = sc.nextInt();
		if (idades1[i] < 18) {
		System.out.println("Você é menor de idade");
		}
		}


		// 8 - Aumento em massa
		double[] salarios = new double[7];
		for (int i = 0; i < salarios.length; i++) {
		System.out.print("Digite o salário " + (i + 1) + ": ");
		salarios[i] = sc.nextDouble();
		if (salarios[i] <= 2500) {
		System.out.println("Você receberá um aumento");
		}
		}
		

	}

}
