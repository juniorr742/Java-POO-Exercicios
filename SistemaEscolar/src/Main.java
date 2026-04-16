import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> p = new ArrayList<>();

        Pessoa aluno1 = new Aluno("Caio", 25, 1234);

        Pessoa professor1 = new Professor("João", 45, "Matemática");

        Pessoa diretor1 = new Diretor("Frederico", 58, 5);

        p.add(aluno1);
        p.add(professor1);
        p.add(diretor1);

        for (Pessoa pessoa: p){
            System.out.println(pessoa.apresentar());
        }

    }
}