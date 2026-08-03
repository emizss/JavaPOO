package avaliacao.formula1;

public class Piloto extends Pessoa{
    private int qntVitorias;

    public  Piloto (String nome, String nacionalidade, int idade, int qntVitorias){
        super(nome, nacionalidade, idade);
        this.qntVitorias = qntVitorias;
    }

    public int getQntVitorias(){
        return qntVitorias;
    }

    public void setQntVitorias(int qntVitorias) {
        this.qntVitorias = qntVitorias;
    }
}
