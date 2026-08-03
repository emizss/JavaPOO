package avaliacao.formula1;

public class Engenheiro extends Pessoa{
    Piloto piloto;
    public Engenheiro(String nome, String nacionalidade, int idade, Piloto piloto){
        super(nome, nacionalidade, idade);
        this.piloto = piloto;
    }
    public Piloto getPiloto(){
        return piloto;
    }
    public void setPiloto(Piloto piloto){
        this.piloto = piloto;
    }
}
