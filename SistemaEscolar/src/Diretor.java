public class Diretor extends Pessoa{
    int tempoDeGestao;

    public Diretor(String nome, int idade, int tempoDeGestao){
        super(nome, idade);
        this.tempoDeGestao = tempoDeGestao;
    }

    @Override
    public String apresentar(){
        return "Sou diretor " + getNome() + ", há: "+ tempoDeGestao + "anos de gestão";
    }
}
