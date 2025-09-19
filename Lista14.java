package primeiroProjeto;

import java.util.Scanner;

public class Lista14 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        // 1 - Contador
		        System.out.println("1 - Contador de 1 a 10:");
		        for (int i = 1; i <= 10; i++) {
		            System.out.print(i + " ");
		        }
		        System.out.println("\n");

		        // 2 - Somando números de 1 a 100
		        System.out.println("2 - Soma de 1 até 100:");
		        int soma = 0;
		        for (int i = 1; i <= 100; i++) {
		            soma += i;
		        }
		        System.out.println("Soma = " + soma + "\n");

		        // 3 - Números pares de 1 a 20
		        System.out.println("3 - Números pares de 1 a 20:");
		        for (int i = 1; i <= 20; i++) {
		            if (i % 2 == 0) {
		                System.out.print(i + " ");
		            }
		        }
		        System.out.println("\n");

		        // 4 - Tabuada de um número
		        System.out.print("4 - Digite um número para ver a tabuada: ");
		        int numero = sc.nextInt();
		        System.out.println("Tabuada de " + numero + ":");
		        for (int i = 1; i <= 10; i++) {
		            System.out.println(numero + " x " + i + " = " + (numero * i));
		        }
		        System.out.println();

		        // 5 - Contar divisíveis por 3 de 1 a 50
		        System.out.println("5 - Contando números divisíveis por 3 de 1 a 50:");
		        int contadorDiv3 = 0;
		        for (int i = 1; i <= 50; i++) {
		            if (i % 3 == 0) {
		                contadorDiv3++;
		            }
		        }
		        System.out.println("Quantidade de números divisíveis por 3: " + contadorDiv3 + "\n");

		        // 6 - Números ímpares até N
		        System.out.print("6 - Digite um número N para imprimir os ímpares até ele: ");
		        int N = sc.nextInt();
		        System.out.println("Números ímpares de 1 até " + N + ":");
		        for (int i = 1; i <= N; i++) {
		            if (i % 2 != 0) {
		                System.out.print(i + " ");
		            }
		        }
		        System.out.println("\n");

		        // 7 - Multiplicação de 5 valores
		        System.out.println("7 - Digite 5 valores para multiplicar:");
		        int multiplicacao = 1;
		        for (int i = 1; i <= 5; i++) {
		            System.out.print("Digite o valor " + i + ": ");
		            int valor = sc.nextInt();
		            multiplicacao *= valor;
		        }
		        System.out.println("Resultado da multiplicação: " + multiplicacao + "\n");

		        // 8 - Premiação da empresa
		        System.out.println("8 - Premiação da empresa:");
		        for (int i = 1; i <= 10; i++) {
		            System.out.print("Anos de empresa do funcionário " + i + ": ");
		            int anos = sc.nextInt();
		            if (anos > 10) {
		                System.out.println("Parabéns! Você irá receber um prêmio.");
		            } else {
		                System.out.println("Quase lá.");
		            }
		        }

	}

}
