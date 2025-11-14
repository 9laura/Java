package ContasBancárias;

public class ContaInvestimento extends Conta {
    @Override
    public double calcularRendimento() {
        return 1000 * 0.10; // exemplo: 10%
    }
}
