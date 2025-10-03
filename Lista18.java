package primeiroProjeto;

public class Lista18 {

	public static void main(String[] args) {
		imprimirNome();
		mostrarFraseMotivacional();
		imprimirNumeros();
		mostrarVogais();
		desenharQuadrado();
		imprimirNumerosPares();
		contagemRegressiva();
		desenharTriangulo();
		mostrarDiasSemana();
	}
		// 1. Função para imprimir o nome várias vezes
	    public static void imprimirNome() {
	        String nome = "Laura"; // Substitua por seu nome
	        for (int i = 0; i < 5; i++) {
	            System.out.println(nome);
	        }
	    }

	    // 2. Função para mostrar frase motivacional
	    public static void mostrarFraseMotivacional() {
	        System.out.println("Você é capaz e pode conquistar seus objetivos!");
	    }

	    // 3. Função para imprimir números de 1 a 10
	    public static void imprimirNumeros() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(i);
	        }
	    }

	    // 4. Função para mostrar vogais
	    public static void mostrarVogais() {
	        String vogais = "aeiou";
	        System.out.println("As vogais são:");
	        for (char vogal : vogais.toCharArray()) {
	            System.out.print(vogal + " ");
	        }
	        System.out.println();
	    }

	    // 5. Função para desenhar quadrado com asteriscos
	    public static void desenharQuadrado() {
	        int tamanho = 5;
	        for (int i = 0; i < tamanho; i++) {
	            for (int j = 0; j < tamanho; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }

	    // 6. Função para imprimir números pares de 2 a 20
	    public static void imprimirNumerosPares() {
	        for (int i = 2; i <= 20; i += 2) {
	            System.out.println(i);
	        }
	    }
	    // 7. Função para contagem regressiva
		    public static void contagemRegressiva() {
		        for (int i = 10; i >= 1; i--) {
		            System.out.println(i);
		        }
		        System.out.println("Fim!");
		    }
		    // 8. Função para desenhar triângulo com asteriscos
		    public static void desenharTriangulo() {
		        for (int i = 1; i <= 5; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		    }
		   // 9. Função para mostrar dias da semana
		    public static void mostrarDiasSemana() {
		        String[] dias = {"Segunda-feira", "Terça-feira", "Quarta-feira",
		                         "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"};
		       
		        for (String dia : dias) {
		            System.out.println(dia); }
		    }
	    
	    
		    }
