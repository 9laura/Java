package primeiroProjeto;

import java.util.Scanner;

public class ListaSwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
				
		/*1 - Classificação de Dia da Semana"
		Peça um número de 1 a 7 representando 
		um dia da semana (1 = Domingo, 2 = Segunda,
		etc.).
		
		Use switch-case para exibir se é
		"Fim de semana" (Domingo ou Sábado) ou "Dia útil".
		Exiba "Fim de semana", "Dia útil" ou "Dia
		inválido" (para números fora do intervalo).*/
		
		System.out.println("Informe um número de 1 a 7 representando um dia da semana (1 = Domingo, 2 = Segunda, etc.).");
		int numero = scanner.nextInt();
		switch (numero) {
	      case 1,7:
	    	  System.out.println("Fim de semana");
	          break;
	      case 2,3,4,5,6:
	    	  System.out.println("Dia útil");
	          break;
	      default:
	    	  System.out.println("Dia inválido"); }
		
		/*2 - Menu de Bebidas
		Peça um código de bebida (1 = Café,
		2 = Chá, 3 = Suco, 4 = Refrigerante).
		E exiba o preço da bebida: Café = R$5,00,
		Chá = R$3,50, Suco = R$4,00, Refrigerante = R$4,50.
		Saída: Exiba o preço da bebida ou
		"Código inválido" se o código não corresponder 
		a nenhuma bebida.*/
		
		System.out.println("Consulte nosso menu usando os seguintes códigos de bebida (1 = Café,\r\n"
				+ "		2 = Chá, 3 = Suco, 4 = Refrigerante).");
		int bebida = scanner.nextInt();
		switch (bebida) {
	      case 1:
	    	  System.out.println("Café = R$5,00");
	          break;
	      case 2:
	    	  System.out.println("Chá = R$3,50");
	          break;
	      case 3:
	    	  System.out.println("Suco = R$4,00");
	          break;
	      case 4:
	    	  System.out.println("Refrigerante = R$4,50");
	          break;
	      default:
	    	  System.out.println("Código inválido"); }
		
		/*3 - Tipo de Veículo
		Peça um código de veículo (1 = Carro, 
		2 = Moto, 3 = Caminhão). E exiba a 
		categoria do veículo: Carro = "Leve", 
		Moto = "Motocicleta", Caminhão = "Pesado".
		Saída: Exiba a categoria ou "Veículo inválido" 
		para códigos desconhecidos.*/
		
		System.out.println("Escolha um código de veículo (1 = Carro, 2 = Moto, 3 = Caminhão).");
		int veiculo = scanner.nextInt();
		switch (veiculo) {
	      case 1:
	    	  System.out.println("Leve");
	          break;
	      case 2:
	    	  System.out.println("Motocicleta");
	          break;
	      case 3:
	    	  System.out.println("Pesado");
	          break;
	      default:
	    	  System.out.println("Veículo inválido"); }
		
		/*4 - Escolha de Plano de Assinatura
		Peça um código de plano (1 = Básico, 
		2 = Intermediário, 3 = Premium). E mostre 
		os benefícios: Básico = "Acesso limitado", 
		Intermediário = "Acesso padrão + suporte", 
		Premium = "Acesso total + suporte prioritário".
		Saída: Exiba os benefícios ou "Plano inválido" 
		para códigos inválidos.*/
		
		System.out.println("Escolha um código de plano (1 = Básico, 2 = Intermediário, 3 = Premium).");
		int plano = scanner.nextInt();
		switch (plano) {
	      case 1:
	    	  System.out.println("Acesso limitado");
	          break;
	      case 2:
	    	  System.out.println("Acesso padrão + suporte");
	          break;
	      case 3:
	    	  System.out.println("Acesso total + suporte prioritário");
	          break;
	      default:
	    	  System.out.println("Plano inválido"); }
		
		/*5 - Seleção de Mês
		Peça um número de 1 a 12 representando um mês.
		Exiba a estação do ano (no hemisfério sul): 
		12, 1, 2 = "Verão",
		3, 4, 5 = "Outono",
		6, 7, 8 = "Inverno",
		9, 10, 11 = "Primavera".
		Saída: Exiba a estação ou
		"Mês inválido" para números fora do intervalo.*/
		
		System.out.println("Informe um número de 1 a 12 representando um mês.");
		int mes = scanner.nextInt();
		switch (mes) {
	      case 12, 1, 2:
	    	  System.out.println("Verão");
	          break;
	      case 3, 4, 5:
	    	  System.out.println("Outono");
	          break;
	      case 6, 7, 8:
	    	  System.out.println("Inverno");
	          break;
	      case 9, 10, 11:
	    	  System.out.println("Primavera");
	          break;
	      default:
	    	  System.out.println("Mês inválido"); }

		/*6 - Tipo de Ingresso
		Peça um código de ingresso (1 = Inteira,
		2 = Meia-entrada, 3 = VIP). Exiba o preço:
		Inteira = R$50,00, Meia-entrada = R$25,00,
		VIP = R$100,00.
		Saída: Exiba o preço ou "Ingresso inválido"
		para códigos desconhecidos.*/
		
		System.out.println("Escolha um código de ingresso (1 = Inteira,\r\n"
				+ "		2 = Meia-entrada, 3 = VIP).");
		int ingresso = scanner.nextInt();
		switch (ingresso) {
	      case 1:
	    	  System.out.println("R$50,00");
	          break;
	      case 2:
	    	  System.out.println("R$25,00");
	          break;
	      case 3:
	    	  System.out.println("R$100,00");
	          break;
	      default:
	    	  System.out.println("Ingresso inválido"); }
		
		/*7 - Escolha de Idioma
		Peça um código de idioma (1 = Português,
		2 = Inglês, 3 = Espanhol). E exiba uma
		saudação: Português = "Olá!", Inglês =
		"Hello!", Espanhol = "Hola!".
		Saída: Exiba a saudação ou "Idioma inválido"
		para códigos desconhecidos.*/
		
		System.out.println("Escolha um código de idioma (1 = Português,\r\n"
				+ "		2 = Inglês, 3 = Espanhol).");
		int idioma = scanner.nextInt();
		switch (idioma) {
	      case 1:
	    	  System.out.println("Olá!");
	          break;
	      case 2:
	    	  System.out.println("Hello!");
	          break;
	      case 3:
	    	  System.out.println("Hola!");
	          break;
	      default:
	    	  System.out.println("Idioma inválido"); }
		
		
		/*8 - Nível de Acesso
		Peça um código de nível (1 = Usuário,
		2 = Moderador, 3 = Administrador).
		Exiba as permissões: Usuário = "Acesso básico",
		Moderador = "Acesso básico + edição",
		Administrador = "Acesso total".
		Saída: Exiba as permissões ou "Nível inválido"
		para códigos inválidos.*/
		
		System.out.println("Escolha um código de nível (1 = Usuário,\r\n"
				+ "		2 = Moderador, 3 = Administrador).");
		int nivel = scanner.nextInt();
		switch (nivel) {
	      case 1:
	    	  System.out.println("Acesso básico");
	          break;
	      case 2:
	    	  System.out.println("Acesso básico + edição");
	          break;
	      case 3:
	    	  System.out.println("Acesso total");
	          break;
	      default:
	    	  System.out.println("Nível inválido"); }
		
		/*9 - Tipo de Pagamento
		Peça um código de pagamento (1 = Dinheiro, 
		2 = Cartão de Crédito, 3 = Pix). Exiba a 
		confirmação: Dinheiro = "Pagamento em dinheiro confirmado",
		Cartão de Crédito = "Pagamento com cartão processado", 
		Pix = "Pagamento via Pix realizado".
		Saída: Exiba a confirmação ou "Método inválido"
		para códigos desconhecidos.*/

		System.out.println("Escolha um código de pagamento (1 = Dinheiro, \r\n"
				+ "		2 = Cartão de Crédito, 3 = Pix).");
		int pag = scanner.nextInt();
		switch (pag) {
	      case 1:
	    	  System.out.println("Pagamento em dinheiro confirmado");
	          break;
	      case 2:
	    	  System.out.println("Pagamento com cartão processado");
	          break;
	      case 3:
	    	  System.out.println("Pagamento via Pix realizado");
	          break;
	      default:
	    	  System.out.println("Método inválido"); }
		
	}

}
