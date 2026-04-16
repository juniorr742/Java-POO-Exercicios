import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> p = new ArrayList<>();

        Produto alimento = new Alimento("Macarrão", 3.5, "Alimentos");
        Produto eletronico = new Eletronico("Mouse", 24, "Eletronico");
        Produto livro = new Livro("Harry Potter", 54, "livros");

        p.add(alimento);
        p.add(eletronico);
        p.add(livro);

        for (Produto produto: p){
            double precoFinal = produto.calcularDesconto();

            System.out.printf("Produto: %s\n", produto.getNome());
            System.out.printf("Categoria: %s\n", produto.getCategoria());
            System.out.printf("Preço original: R$%.2f\n ", produto.getPreco());
            System.out.printf("Preço com desconto: R$%.2f \n", precoFinal);
            System.out.println("\n-------------------------");
        }


    }
}