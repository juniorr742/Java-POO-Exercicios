public class Aluno extends Pessoa{
    int matricula;

    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }


    @Override
    public String apresentar() {
        return "Sou aluno " + getNome() + " , tenho "+ getIdade() + " anos, matrícula: " + matricula;
    }
}
