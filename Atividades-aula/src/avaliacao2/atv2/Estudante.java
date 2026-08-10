package avaliacao2.atv2;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;
public class Estudante {
    private String nome;
    private  ArrayList<Double> notas;


    public Estudante(String nome){
        this.nome = nome;
        this.notas = new ArrayList<Double>();
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

    public int tamanhoArray(){
        int tam = notas.size();
        return tam;
    }
    public void insereNotas(double nota){
        int tamanho = tamanhoArray();
        if (tamanho < 4){
            this.notas.add(nota);
        }else{
            System.out.println("As 5 notas já foram preenchidas. Caso queira adicionar uma, é necessário excluir.");
        }
    }
    public double calculaSoma(ArrayList<Double> notas){
        double soma;
        soma = 0;
        for (double valor : notas){
            soma += valor;
        }
        return soma;
    }
    public double calculaMedia(ArrayList<Double> notas){
        double media;
        int tamanho = tamanhoArray();
        media= calculaSoma(notas)/tamanho;
        return media;
    }
    public double menorNota(ArrayList<Double> notas){
        double menorNota;
        menorNota = Collections.min(notas);
        return menorNota;
    }
    public Estudante estudantesAprovados(ArrayList<Estudante> estudantes){
        for (Estudante estudante : estudantes){
            double media;
            media = estudante.calculaMedia(estudante.getNotas());
            if(media <= 6){
                ArrayList<Estudante> aprovados = new ArrayList<Estudante>();
                aprovados.add(estudante);
            }
        }
        return null;
    }
}

