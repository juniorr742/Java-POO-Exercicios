public class Livro extends Produto{
    private static final double DescontoLivro = 0.90;

    public Livro(String nome, double preco, String categoria){
        super(nome, preco, categoria);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * DescontoLivro;
    }
}
