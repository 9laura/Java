package ContasBancárias;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new ContaPoupanca();
        Conta c2 = new ContaInvestimento();

        System.out.println("Rendimento da poupança: " + c1.calcularRendimento());
        System.out.println("Rendimento da conta investimento: " + c2.calcularRendimento());
    
	}

}
