package primeiroProjeto;

public class Lista19 {

	public static void main(String[] args) {
		classificarNumero(-5);
        verificarMaioridade(20);
        boasVindas("Laura");
        tabuada(7);
        juntarPalavras("Java", "Rocks");
        verificarParOuImpar(10);
        classificarTemperatura(18);
        saudacaoPorTurno("noite");
        calcularMedia(8.5, 7.0, 9.0);
        verificarAprovacao(6.8);
	}
		
		// 1 – Classificando valores
	    public static void classificarNumero(int num) {
	        if (num > 0) {
	            System.out.println("O número é positivo");
	        } else if (num < 0) {
	            System.out.println("O número é negativo");
	        } else {
	            System.out.println("O número é zero");
	        }
	    }

	    // 2 – Maioridade
	    public static void verificarMaioridade(int idade) {
	        if (idade >= 18) {
	            System.out.println("Maior de idade");
	        } else {
	            System.out.println("Menor de idade");
	        }
	    }

	    // 3 – Boas Vindas
	    public static void boasVindas(String nome) {
	        System.out.println("Bem-vindo(a), " + nome + "!");
	    }

	    // 4 – Tabuada
	    public static void tabuada(int numero) {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	    }

	    // 5 – Juntando palavras
	    public static void juntarPalavras(String p1, String p2) {
	        System.out.println(p1 + " " + p2);
	    }

	    // 6 – Verificando par ou ímpar
	    public static void verificarParOuImpar(int num) {
	        if (num % 2 == 0) {
	            System.out.println("O número é par");
	        } else {
	            System.out.println("O número é ímpar");
	        }
	    }

	    // 7 – Classificando temperatura
	    public static void classificarTemperatura(double temp) {
	        if (temp < 15) {
	            System.out.println("Frio");
	        } else if (temp <= 25) {
	            System.out.println("Agradável");
	        } else {
	            System.out.println("Quente");
	        }
	    }

	    // 8 – Saudação por turno
	    public static void saudacaoPorTurno(String turno) {
	        if (turno.equalsIgnoreCase("manhã")) {
	            System.out.println("Bom dia!");
	        } else if (turno.equalsIgnoreCase("tarde")) {
	            System.out.println("Boa tarde!");
	        } else if (turno.equalsIgnoreCase("noite")) {
	            System.out.println("Boa noite!");
	        } else {
	            System.out.println("Turno inválido!");
	        }
	    }

	    // 9 – Calculando média
	    public static void calcularMedia(double n1, double n2, double n3) {
	        double media = (n1 + n2 + n3) / 3;
	        System.out.println("Média = " + media);
	    }

	    // 10 – Verificando aprovação
	    public static void verificarAprovacao(double notaFinal) {
	        if (notaFinal >= 7) {
	            System.out.println("Aprovado");
	        } else if (notaFinal >= 5) {
	            System.out.println("Em recuperação");
	        } else {
	            System.out.println("Reprovado");
	        }
	    }

	 
	}


