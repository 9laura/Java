package Restaurante;

public class Salada extends Prato {
    @Override
    public double calcularPreco() {
        return 15.0;
    }

    @Override
    public String getNome() {
        return "Salada";
    }
}
