/**
 * 
 */
package primeiroProjeto;

import java.util.Scanner;

/**
 * 
 */
public class Lista3 {

	/**
	 * 
	 */
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); {
	        	
				// Resultado de dois números
				System.out.println("Resultado de dois números");
				System.out.println("Informe o primeiro número: ");
				double nm1 = scanner.nextDouble();
			    System.out.println("Informe o segundo número: ");
			    double nm2 = scanner.nextDouble();
			    double soma = nm1 + nm2;
			    System.out.println("O resultado da soma é: " + soma);
			    
			    // Divisão e resto
			    System.out.println("Divisão e resto");
			    System.out.println("Informe o primeiro número: ");
			    int num1 = (int) scanner.nextDouble();
			    System.out.println("Informe o segundo número: ");
			    int num2 = (int) scanner.nextDouble();
			    double div = num1 / num2;
			    double resto = num1 % num2;
			    System.out.println("O resultado da divisão é "+div+" e o resto é "+resto );
			    
			    // Perímetro de um triângulo
			    System.out.println("Perímetro de um triângulo");
			    System.out.println("Informe o primeiro lado: ");
			    double lado1 = scanner.nextDouble();
			    System.out.println("Informe o segundo lado: ");
			    double lado2 = scanner.nextDouble();
			    System.out.println("Informe o terceiro lado: ");
			    double lado3 = scanner.nextDouble();
			    double resul = lado1 + lado2 + lado3;
			    System.out.println("O perímetro desse triangulo é "+resul);
			    
			    // Calculadora de Gorjeta
			    System.out.println("Calculadora de Gorjeta");
			    System.out.println("Informe o valor da conta: ");
			    double conta = scanner.nextDouble();
			    System.out.println("Informe a porcentagem da gorjeta desejada");
			    double porcen = scanner.nextDouble();
			    double gorjeta = conta * (porcen/100);
			    double total = conta + gorjeta;
			    System.out.println("O valor da gorjeta é "+gorjeta+" R$. E o valor total é "+total+" R$.");
			    
			    // Calculadora de área de círculo
			    System.out.println("Calculadora de área de círculo");
			    System.out.println("Informe o raio de um círculo (em metros)");
			    double raio = scanner.nextDouble();
			    double pi = 3.14159;
			    double area = pi * raio * raio;
			    System.out.println("A área desse círculo é "+area+" metros quadrados");
			    
			    // Conversor de idade em dias
			    System.out.println("Conversor de idade em dias");
			    System.out.println("Informe sua idade em anos, meses e dias");
			    System.out.println("Anos: ");
			    double anos = scanner.nextDouble();
			    System.out.println("Meses: ");
			    double meses = scanner.nextDouble();
			    System.out.println("Dias: ");
			    double dias = scanner.nextDouble();
			    double totalDias = (anos * 365) + (meses * 30) + dias;
			    System.out.println("Você viveu um total de " + totalDias + " dias");
			    
			    // Calculadora de pagamento por hora
			    System.out.println("Calculadora de pagamento por hora");
			    System.out.println("Informe seu número de horas trabalhadas e o valor pago por hora: ");
			    System.out.println("Horas trabalhadas: ");
			    double horasTrab = scanner.nextDouble();
			    System.out.println("Valor pago por hora: ");
			    double valorPago = scanner.nextDouble();
			    double bruto = horasTrab * valorPago;
			    double imposto = bruto * 0.10;
			    double liquido = bruto - imposto;
			    System.out.println("Você tem um salário bruto de " + bruto + " R$ por dia. Considerando que o imposto retido (10% do salário bruto) tem um valor de " + imposto + " R$, seu salário líquido é de " + liquido + " R$ por dia.");
			    
	        } 
	    }

}
