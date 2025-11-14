package ContasBancárias;

public class ContaPoupanca extends Conta {
    @Override
    public double calcularRendimento() {
        return 1000 * 0.05; // exemplo: 5%
    }
}
