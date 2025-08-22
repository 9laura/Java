package primeiroProjeto;

import java.util.Scanner;

public class lista6 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			// 1 - Intervalo numérico
	        System.out.println("Digite um número: ");
	        int numero = scanner.nextInt();

	        if (numero >= 10 && numero <= 20) {
	            System.out.println("Número dentro do intervalo");
	        } else {
	            System.out.println("Fora do intervalo");
	        }

	        System.out.println("_________");

	        // 2 - Acesso à festa
	        System.out.println("Qual sua idade? ");
	        int idade = scanner.nextInt();
	        System.out.println("Você tem convite? (true/false): ");
	        boolean convite = scanner.nextBoolean();

	        if (idade >= 18 && convite) {
	            System.out.println("Entrada Permitida");
	        } else {
	            System.out.println("Entrada negada");
	        }

	        System.out.println("_________");

	        // 3 - Categoria de esporte
	        System.out.println("Informe sua idade: ");
	        int idadeEsporte = scanner.nextInt();

	        if (idadeEsporte < 12 || idadeEsporte > 60) {
	            System.out.println("Categoria especial");
	        } else {
	            System.out.println("Categoria normal");
	        }

	        System.out.println("_________");

	        // 4 - Desconto no produto
	        System.out.println("Informe o valor do produto: ");
	        double valorProduto = scanner.nextDouble();
	        System.out.println("Forma de pagamento (avista/cartao): ");
	        String forma = scanner.next();

	        if (valorProduto > 100 && forma.equalsIgnoreCase("avista")) {
	            double valorDesconto = valorProduto * 0.9;
	            System.out.println("Valor com desconto: R$" + valorDesconto);
	        } else {
	            System.out.println("Valor sem desconto: R$" + valorProduto);
	        }

	        System.out.println("_________");

	        // 5 - Triagem médica
	        System.out.println("Qual sua temperatura? ");
	        double temperatura = scanner.nextDouble();
	        System.out.println("Está com sintomas? (true/false): ");
	        boolean sintomas = scanner.nextBoolean();

	        if (temperatura >= 38 || sintomas) {
	            System.out.println("Recomenda-se procurar um médico.");
	        } else {
	            System.out.println("Sem sinais preocupantes.");
	        }

	        System.out.println("_________");

	        // 6 - Votação
	        System.out.println("Qual sua idade? ");
	        int idadeVoto = scanner.nextInt();
	        System.out.println("É brasileiro? (true/false): ");
	        boolean brasileiro = scanner.nextBoolean();

	        if (idadeVoto >= 16 && brasileiro) {
	            System.out.println("Pode votar.");
	        } else {
	            System.out.println("Não pode votar.");
	        }

	        System.out.println("_________");

	        // 7 - Bônus de funcionário
	        System.out.println("Horas extras: ");
	        int horasExtras = scanner.nextInt();
	        System.out.println("Número de faltas: ");
	        int faltas = scanner.nextInt();

	        if (horasExtras > 20 && faltas < 5) {
	            System.out.println("Ganha bônus");
	        } else {
	            System.out.println("Não ganha bônus");
	        }

	        System.out.println("_________");

	        // 8 - Autorização para dirigir
	        System.out.println("Qual sua idade? ");
	        int idadeDirigir = scanner.nextInt();
	        System.out.println("Possui carteira de motorista? (true/false): ");
	        boolean carteira = scanner.nextBoolean();

	        if (idadeDirigir >= 18 && carteira) {
	            System.out.println("Pode dirigir.");
	        } else {
	            System.out.println("Não pode dirigir.");
	        }

	        System.out.println("_________");

	        // 9 - Bolsa de Estudos
	        System.out.println("Qual sua nota média? (0 a 10) ");
	        double nota = scanner.nextDouble();
	        System.out.println("Qual sua frequência (%): ");
	        int frequencia = scanner.nextInt();

	        if (nota >= 8 && frequencia >= 80) {
	            System.out.println("Bolsa concedida");
	        } else {
	            System.out.println("Bolsa não concedida");
	        }

	        System.out.println("_________");

	        // 10 - Verificação de temperatura ambiente
	        System.out.println("Qual a temperatura ambiente (°C)? ");
	        double temp = scanner.nextDouble();
	        System.out.println("Qual a umidade (%): ");
	        double umidade = scanner.nextDouble();

	        if ((temp < 18 || temp > 26) && umidade > 60) {
	            System.out.println("Ajustar climatização");
	        } else {
	            System.out.println("Climatização não necessária");
	        }
		}


	}
