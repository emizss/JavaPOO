package avaliacao.formula1;

public class Patrocinador {
    private String nome;
    private float valor;
    public Patrocinador(String nome, float valor){
        this.nome = nome;
        this.valor = valor;
    }
    public String getNome(){
        return nome;
    }
    public float getValor(){
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
