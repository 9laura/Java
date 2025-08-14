package primeiroProjeto;

import java.util.Scanner;

public class lista2 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        //Resultado de dois números
	        System.out.println("Resultado de dois números");
	        System.out.print("Informe o primeiro número: ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Informe o segundo número (diferente de zero): ");
	        double num2 = scanner.nextDouble();

	        if (num2 != 0) {
	            System.out.println("Soma: " + (num1 + num2));
	            System.out.println("Subtração: " + (num1 - num2));
	            System.out.println("Multiplicação: " + (num1 * num2));
	            System.out.println("Divisão: " + (num1 / num2));
	        } else {
	            System.out.println("Erro: Tente novamente.");
	        }

	        //Cálculo de temperatura
	        System.out.println("Cálculo de temperatura");
	        System.out.print("Informe a temperatura em Celsius: ");
	        double celsius = scanner.nextDouble();
	        double fahrenheit = (celsius * 1.8) + 32;
	        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

	        //Conversão de valor
	        System.out.println("Conversão de valor (Real para Dólar)");
	        System.out.print("Informe o valor em reais: R$ ");
	        double reais = scanner.nextDouble();
	        double cotacaoDolar = 5.70;
	        double valorDolar = reais / cotacaoDolar;
	        System.out.println("Valor em dólares: US$ " + valorDolar);

	        //Área do retângulo
	        System.out.println("Área do retângulo");
	        System.out.print("Informe a base do retângulo: ");
	        double base = scanner.nextDouble();
	        System.out.print("Informe a altura do retângulo: ");
	        double altura = scanner.nextDouble();
	        double area = base * altura;
	        System.out.println("Área do retângulo: " + area);

	        //Conversor de idade
	        System.out.println("Conversor de idade (anos para meses)");
	        System.out.print("Informe sua idade em anos: ");
	        int idadeAnos = scanner.nextInt();
	        int idadeMeses = idadeAnos * 12;
	        System.out.println("Você já viveu aproximadamente " + idadeMeses + " meses.");

	        //Conversor de minutos para segundos
	        System.out.println("Conversor de minutos para segundos");
	        System.out.print("Informe o tempo em minutos: ");
	        int minutos = scanner.nextInt();
	        int segundos = minutos * 60;
	        System.out.println(minutos + " minutos equivalem a " + segundos + " segundos.");

	        //Custo da compra
	        System.out.println("Custo da compra");
	        System.out.print("Informe o preço do produto: R$ ");
	        double precoProduto = scanner.nextDouble();
	        System.out.print("Informe a quantidade comprada: ");
	        int quantidade = scanner.nextInt();
	        double custoTotal = precoProduto * quantidade;
	        System.out.println("Custo total da compra: R$ " + custoTotal);

	        //Divisão de conta de restaurante
	        System.out.println("Divisão da conta de restaurante");
	        System.out.print("Informe o valor total da conta: R$ ");
	        double totalConta = scanner.nextDouble();
	        System.out.print("Informe o número de pessoas: ");
	        int numPessoas = scanner.nextInt();
	        double valorPorPessoa = totalConta / numPessoas;
	        System.out.println("Cada pessoa deve pagar R$ " + valorPorPessoa);
	        
	        //Cálculo de troco
	        System.out.println("Cálculo de troco");
	        System.out.print("Informe o valor da compra: R$ ");
	        double valorCompra = scanner.nextDouble();
	        System.out.print("Informe o valor pago pelo cliente: R$ ");
	        double valorPago = scanner.nextDouble();
	        double troco = valorPago - valorCompra;

	        if (troco >= 0) {
	            System.out.println("Troco: R$ " + troco);
	        } else {
	            System.out.println("Valor pago insuficiente. Faltam R$ " + troco);
	        }  
	    }
}

