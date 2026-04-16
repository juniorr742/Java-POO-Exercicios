import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private List<Pessoa> listaPessoas = new ArrayList<>();

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public abstract String apresentar();

    public void cadastrar(Pessoa pessoa){
        listaPessoas.add(pessoa);
        System.out.println(pessoa.getNome() + "cadastro efetuado com sucesso!");
    }

    public void listar(Pessoa pessoa){
        for (int i = 0; i < listaPessoas.size(); i++) {
            System.out.println(listaPessoas.get(i).apresentar());
        }
    }



}
