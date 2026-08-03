package avaliacao.formula1;

public class Carro {
    private int posicao;
    private int numero;
    private Piloto piloto;
    private Equipe equipe;

    public Carro(int posicao, int numero, Piloto piloto, Equipe equipe){
        this.posicao = posicao;
        this.numero = numero;
        this.piloto = piloto;
        this.equipe = equipe;
    }
    public int getPosicao(){
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
