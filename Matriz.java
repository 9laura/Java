package primeiroProjeto;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

	    // 1 – Criando uma matriz simples
	    
	        int[][] matriz = new int[2][3];

	        System.out.println("Preencha a matriz 2x3:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
	                matriz[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("\nMatriz completa:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	    

	    // 2 – Nomes em uma tabela
	    
	        String[][] nomes = new String[3][2];

	        System.out.println("Preencha a matriz 3x2 com nomes:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print("Digite o nome da posição [" + i + "][" + j + "]: ");
	                nomes[i][j] = sc.next();
	            }
	        }

	        System.out.println("\nTabela de nomes:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(nomes[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    

	    // 3 – Mostrando a diagonal principal
	    
	        int[][] matriz1 = new int[3][3];

	        System.out.println("Preencha a matriz 3x3:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
	                matriz1[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("\nDiagonal principal:");
	        for (int i = 0; i < 3; i++) {
	            System.out.println(matriz1[i][i]);
	        }
	    

	    // 4 – Procurando um número
	    
	        int[][] matriz2 = new int[3][3];
	        boolean encontrado = false;

	        System.out.println("Preencha a matriz 3x3:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
	                matriz2[i][j] = sc.nextInt();
	            }
	        }

	        System.out.print("\nDigite um número para procurar: ");
	        int num = sc.nextInt();

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (matriz2[i][j] == num) {
	                    System.out.println("Número encontrado na posição [" + i + "][" + j + "]");
	                    encontrado = true;
	                }
	            }
	        }

	        if (!encontrado) {
	            System.out.println("Número não encontrado na matriz.");
	        }
	    }

	    
	        
	    
	        
	
	
	

	        }
}
