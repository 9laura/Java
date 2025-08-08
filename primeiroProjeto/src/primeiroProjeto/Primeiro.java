package primeiroProjeto;

import java.util.Scanner;

public class Primeiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("olá mundo");
    //Declaração de variável
    int idade = 24;
    double salario = 2000.50;
    char letra = 'J';
    String nome = "Juliana";
    boolean chuva = false;
    
    System.out.println(idade);
    System.out.println("O salário é: " + salario + " reais");
    System.out.println("Letra: " + letra);
    System.out.println("O nome é: "+nome);
    System.out.println(chuva);
    
    // Operadores
    int num1 = 10;
    int num2 = 3;
    double soma = num1 + num2;
    double sub = num1 - num2;
    double div = num1 / num2;
    double mult = num1 * num2;
    double resto = num1 % num2;
    System.out.println("O resultado da soma é: " + soma);
    System.out.println("O resultado da subtração é: " + sub);
    System.out.println("O resultado da multiplicação é: " + mult);
    System.out.println("O resultado da divisão é: " + div);
    System.out.println("O resto é: " + resto);
    
    try (// Entrada de Dados
	Scanner scanner = new Scanner(System.in)) {
		System.out.println("Qual seu nome? ");
		String nome1 = scanner.nextLine();
		System.out.println("Olá " + nome1);
		int numero1;
		int numero2;
		System.out.println("Informe um número: ");
		numero1 = scanner.nextInt();
		System.out.println("Informe outro numero: ");
		numero2 = scanner.nextInt();
		int soma1 = numero1 + numero2;
		System.out.println("O resultado é: " + soma);
    //Peça o ano de nascimento do usuario e mostre quantos anos ele tem
    int data;
    int ano = 2025;
    System.out.println("Qual seu ano de nascimento?");
    data = scanner.nextInt();
    int total = ano - data;
    System.out.println("Você tem "+ total +" anos");
    
    //Calcular desconto
    double preco;
    double desconto;
    System.out.println("Qual o valor da compra?");
    preco = scanner.nextDouble();
    System.out.println("Qual o valor do desconto?");
    desconto = scanner.nextDouble();
    double pagar = preco - desconto;
    System.out.println("Pague: " + pagar);
    
    /* Peça duas notas decimais para o usuário, calcule
     * média e mostre */
	int nota1;
	int nota2;
	System.out.println("Informe a primeira nota: ");
	nota1 = scanner.nextInt();
	System.out.println("Informe a segunda nota: ");
	nota2 = scanner.nextInt();
	int media = nota1 + nota2 / 2;
	System.out.println("A média é: " + media);
	}
	}
}
