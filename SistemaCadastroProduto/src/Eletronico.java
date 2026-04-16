public class Eletronico extends Produto{
    private static final double DescontoEletronico = 0.95;

    public Eletronico(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * DescontoEletronico;
    }
}
