package primeiroProjeto;

public class Lista13 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		// contador
		for(int cont = 1; cont <=30; cont ++) {
			System.out.println(cont);
		}
		
		// Classificação de idades
		
		System.out.println("--------------------------------------------------------");
		int idade;
		for(int cont = 1; cont <= 10; cont++) {
			System.out.println("Informe a idade: ");
			idade = sc.nextInt();
			if (idade < 18) {
				System.out.println("Menor de idade");
			} else {
				System.out.println("Maior de idade");
			}
		}
		
		// Eleição
		
		System.out.println("--------------------------------------------------------");
		System.out.println("Eleições 2026");
		System.out.println("- 1,2,3,4 = voto para os respectivos candidatos;\r\n"
				+ "- 5 = voto nulo;\r\n"
				+ "- 6 = voto em branco;");
		int voto;
		for(int cont1 = 1; cont1 <= 5; cont1 ++) {
			System.out.println("Informe seu voto: ");
			voto = sc.nextInt();
			if (voto == 1 || voto == 2 || voto == 3 || voto == 4) {
				System.out.println("Você votou no candidato X");
			} else if (voto == 5) {
				System.out.println("Você votou nulo");
			} else if (voto == 6) {
				System.out.println("Você votou em branco");
			} else {
				System.out.println("Voto inválido");
			}
		}
		
		// Repetição de frase
		
		System.out.println("--------------------------------------------------------");
		System.out.println("Informe uma frase: ");
		String frase = sc.next();
		System.out.println("Informe um número: ");
		int num1 = sc.nextInt();
		for(int cont2 = 0; cont2 < num1; cont2 ++) {
			System.out.println(frase);
		}
		
		// Sequência 
		
		System.out.println("--------------------------------------------------------");
		for (int seq = 50; seq >= 30; seq --) {
			System.out.println(seq);
		}
		
		// Números Alternados
		
		System.out.println("--------------------------------------------------------");
		for (int seq1 = 1; seq1 <= 50; seq1 += 2) {
			System.out.println(seq1);
		}
		
		// Aprovado ou Reprovado
		
		System.out.println("--------------------------------------------------------");
		int nota1;
		for(int cont3 = 1; cont3 > 5; cont3 ++) {
			nota1 = sc.nextInt();
			if (nota1 <= 5) {
				System.out.println("Reprovado");
			} else if(nota1 <= 10) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Nota inválida");
			}
		}
		
		// Categoria de idade
		
		System.out.println("--------------------------------------------------------");
		int idd;
		for(int cont4 = 1; cont4 <= 5; cont4 ++) {
			System.out.println("Informe a idade: ");
			idd = sc.nextInt();
			if(idd <= 12) {
				System.out.println("Criança");
			} else if (idd <= 17) {
				System.out.println("Adolescente");
			} else if (idd <= 59) {
				System.out.println("Adulto");
			} else {
				System.out.println("Idoso");
			}
		}
		
		// Número positivo ou negativo
		
		System.out.println("--------------------------------------------------------");
		int num;
		for(int cont5 = 1; cont5 <= 7; cont5 ++) {
			System.out.println("Informe um número: ");
			num = sc.nextInt();
			if(num > 0) {
				System.out.println("Positivo");
			} else if (num < 0) {
				System.out.println("Negativo");
			} else {
				System.out.println("Zero");
			}
		}

	}

}
