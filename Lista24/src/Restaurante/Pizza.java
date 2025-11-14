package Restaurante;

public class Pizza extends Prato {
    @Override
    public double calcularPreco() {
        return 35.0;
    }

    @Override
    public String getNome() {
        return "Pizza";
    }
}
