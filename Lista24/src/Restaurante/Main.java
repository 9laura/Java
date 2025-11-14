package Restaurante;

public class Main {

	public static void main(String[] args) {
		Prato p1 = new Pizza();
        Prato p2 = new Lasanha();
        Prato p3 = new Salada();

        System.out.println(p1.getNome() + " custa R$ " + p1.calcularPreco());
        System.out.println(p2.getNome() + " custa R$ " + p2.calcularPreco());
        System.out.println(p3.getNome() + " custa R$ " + p3.calcularPreco());
    
	}

}
