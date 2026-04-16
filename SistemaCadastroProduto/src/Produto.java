public abstract class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }else {
            System.out.println("Digite um número válido");
        }
    }

    public abstract double calcularDesconto();

    @Override
    public String toString() {
        return "Nome: "+getNome()+"| Preco: " +getPreco()+ " | Preco com desconto: " + getPreco();
    }
}
