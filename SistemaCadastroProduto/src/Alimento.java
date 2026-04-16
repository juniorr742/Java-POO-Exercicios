public class Alimento extends Produto{
    private static final double DescontoAlimento = 0.98;

    public Alimento(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * DescontoAlimento;

    }
}
