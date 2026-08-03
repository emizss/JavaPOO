package avaliacao2.atv2;
import java.util.ArrayList;

public class Estudante {
    private String nome;
    private  ArrayList<Double> notas;


    public Estudante(String nome){
        this.nome = nome;
        this.notas = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
}

