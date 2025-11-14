package Restaurante;

public class Lasanha extends Prato {
    @Override
    public double calcularPreco() {
        return 28.0;
    }

    @Override
    public String getNome() {
        return "Lasanha";
    }
}
