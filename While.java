package primeiroProjeto;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int numero = 1;
		while (numero <= 10) {
			System.out.println(numero);
			numero++;
		}
		
		int numero2 = 10;
		while (numero2 >= 1) {
			System.out.println(numero2);
			numero2--;
		}
		
		int numero3 = 0;
		while (numero3 <= 100) {
			System.out.println(numero3);
			numero3+=5;
		}
		
		int numero4 = 1;
		while (numero4 <= 5) {
			System.out.println("Eu gosto de java");
			numero4++;
		}
		
		int soma = 0;
		int valor;
		int contador = 1;
		
		System.out.println("Digite 5 números: ");
		while (contador <= 5) {
			valor = scanner.nextInt();
			soma += valor;
			contador+=1;
		}
		
		System.out.println("A soma dos números é: "+ soma);
        
		System.out.println("Digite a senha");
		int resposta = scanner.nextInt();
		
		while (resposta != 1234) {
			System.out.println("Senha incorreta");
			resposta = scanner.nextInt();
		}
		
		System.out.println("Senha correta");
		
		System.out.println("Informe um número inteiro positivo");
		int num = scanner.nextInt();
		
		while (num >= 1) {
			System.out.println(num);
			num-=1;
		
        }
	}

}
