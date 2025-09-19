package primeiroProjeto;

public class Lista12 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		// Contador
		int contador = 1;
		do {
			System.out.println(contador);
			contador ++;
		} while (contador <= 30);

		// Adivinhação de número
		System.out.println("----------------------------");
		System.out.println("Adivinhe o número");
		int adv;
		do {
			adv = sc.nextInt();
			if(adv == 5) {
				System.out.println("Você acertou! ");
			} else {
				System.out.println("Tente novamente: ");
			}
		} while (adv != 5);
		
		// Verificação de peso na mala 
		System.out.println("----------------------------");
		System.out.println("Informe o peso da mala (Kg)");
		int peso;
		do {
			peso = sc.nextInt();
			if (peso > 23) {
				System.out.println("Peso excedido");
				System.out.println("Tente novamente: ");
			} else {
				System.out.println("Peso dentro do limite.");
			}
		} while (peso >23);
		
		// Verificar quantidade de páginas lidas na semana
		System.out.println("----------------------------");
		int dias = 1;
		int paginas = 0;
		do {
			System.out.println("Informe o número de páginas lidos no dia " + dias);
			int pag = sc.nextInt();
			paginas = paginas + pag;
			dias ++;
		} while (dias <= 7);
		System.out.println("Você leu: "+paginas+" páginas durante a semana.");
		
		// Testar código de acesso
		System.out.println("----------------------------");
		System.out.println("código de acesso ");
		int senha;
		do {
			senha = sc.nextInt();
			if (senha != 789) {
			System.out.println("Código errado. Tente novamente:  ");
			}else {
				System.out.println("Código correto");
			}
			} while (senha != 789);
		
		// Verificar nível de combustivel
		 int distancia;
	        int Km = 0;
	        int totalKm = Km += distancia;
	        do {
	            System.out.println("Digite a distância percorrida (0 ou negativo para encerrar):");
	            distancia = sc.nextInt();
	            if (distancia > 0) {
	               Km += distancia;
	            }
	            
	        } while (distancia > 0);
	        System.out.println("Total de quilômetros percorridos: " + totalKm);

	}

}
