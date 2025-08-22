package primeiroProjeto;

		import java.util.Scanner;
public class lista05 {

	public lista05() {
		

			public static void main(String[] args) {
				 Scanner scanner = new Scanner(System.in);
				 
				 // Classificação de idade
				 
				 int idade;
				 System.out.println("Informe sua idade: ");
				 idade = scanner.nextInt();
				 if(idade < 12) {
					 System.out.println("Criança");
				 } else if(idade < 17) {
					 System.out.println("Adolescente");
				 } else if(idade < 59) {
					 System.out.println("Adulto");
				 } else  if(idade > 60){
					 System.out.println("Idoso");
				 }
				 
				 // Avaliação de temperatura
				 
				 int temperatura;
				 System.out.println("\n Informe sua temperatura em graus Celsius: ");
				 temperatura = scanner.nextInt();
				 if(temperatura < 10) {
					 System.out.println("Muito Frioo");
				 } else if (temperatura < 20) {
					 System.out.println("Tá Frio");
				 } else if (temperatura < 30) {
					 System.out.println("Agradável");
				 } else {
					 System.out.println("Muito quente");
				 }
				 
				 // Sistema de notas escolares
				 
				 int nota;
				 System.out.println("\n Informe sua nota: ");
				 nota = scanner.nextInt();
				 if(nota < 60) {
					 System.out.println("Nota F");
				 } else if (nota < 70) {
					 System.out.println("Nota D");
				 } else if (nota < 80) {
					 System.out.println("Nota C");
				 }  else if (nota < 90) {
					 System.out.println("Nota B");
				 }   else {
					 System.out.println("Nota A");
				 }
				 
				 // Verificação de senha
				 
				String senha;
				System.out.println("\n Informe a senha para liberar seu acesso: ");
				senha = scanner.next();
				if(senha.equals("admin")) {
					System.out.println("Acesso Permitido");
				} else {
					System.out.println("Acesso Negado");
				}
					
					
				// Comparação de nomes
				
				String nome1, nome2;
				System.out.println("\n Informe o nome 1: ");
				nome1 = scanner.next();
				System.out.println("Agora, informe o nome 2: ");
				nome2 = scanner.next();
				if(nome1.equals(nome2)) {
					System.out.println("Os nomes são iguais");
				} else {
					System.out.println("Os nomes são diferentes");
				}
				
				// Jogo da cor favorita
				
				System.out.println("\n Informe sua cor favorita: ");
				String cor = scanner.next();
				if(cor.equalsIgnoreCase("azul")) {
					System.out.println("Boa escolha!");
				} else if (cor.equalsIgnoreCase("vermelho")) {
					System.out.println("A cor vibrante");
				} else if (cor.equalsIgnoreCase("verde")) {
					System.out.println("A cor da natureza");
				} else {
					System.out.println("Cor não cadastrada");
				}
				
				// Verificação de vogal
				
				System.out.println("\n Digite uma letra: ");
				String vogal = scanner.next();
				if(vogal.equalsIgnoreCase("A")) {
					System.out.println("é uma vogal");
				} else if (vogal.equalsIgnoreCase("E")) {
					System.out.println("É uma vogal");
				} else if (vogal.equalsIgnoreCase("I")) {
					System.out.println("É uma vogal");
				} else if (vogal.equalsIgnoreCase("O")) {
					System.out.println("É uma vogal");
				} else if (vogal.equalsIgnoreCase("U")) {
					System.out.println("É uma vogal");
				} else {
					System.out.println("Não é vogal");
				}
			}	

	}

}
