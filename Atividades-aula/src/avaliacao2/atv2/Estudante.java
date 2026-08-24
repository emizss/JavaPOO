package avaliacao2.atv2;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;
public class Estudante {
    private String nome;
    private  ArrayList<Double> notas;
    private Double media;
    private  ArrayList<Integer> pesos;

    public Estudante(String nome){
        this.media = 0.0;
        this.nome = nome;
        this.notas = new ArrayList<>();
        this.pesos = new ArrayList<>();
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

    public ArrayList<Integer> getPesos() {
        return pesos;
    }

    public void setPesos(ArrayList<Integer> pesos) {
        this.pesos = pesos;
    }

    public Double getMedia() {
        return media;
    }
    public void setMedia(double media){this.media = media;}

    public int tamanhoArray(){
        int tam = notas.size();
        return tam;
    }

    public void insereNotas(double nota){
        int tamanho = tamanhoArray();
        if (tamanho < 5){
            this.notas.add(nota);
        }else{
            System.out.println("As 5 notas já foram preenchidas.");
        }
    }
    public void inserePesos(int peso){
        if (pesos.size() < 5){
            this.pesos.add(peso);
        }else{
            System.out.println("Os 5 pesos já foram preenchidos.");
        }
    }
    public double calculaSoma(ArrayList<Double> notas){
        double soma = 0;
        for (double valor : notas){
            soma += valor;
        }
        return soma;
    }
    //média aritmética
    public double calculaMedia(ArrayList<Double> notas){
        int tamanho = tamanhoArray();
        media= calculaSoma(notas)/tamanho;
        return media;
    }
    public double menorNota(ArrayList<Double> notas){
        double menorNota;
        menorNota = Collections.min(notas);
        return menorNota;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s e média:  %.2f", nome, media);
    }

    public int calculaPesoTotal(ArrayList<Integer> pesos){
        int pesoT = 0;
        for(int peso : pesos){
            pesoT+=peso;
        }
        return pesoT;
    }

    //media ponderada
    public double calculaMedia(ArrayList<Double> notas, ArrayList<Integer> pesosArray){
        double somaNotasEPesos = 0.0;
        int pesoTotal = calculaPesoTotal(pesosArray);

        for (int i = 0; i < pesosArray.size(); i++) {
            somaNotasEPesos += notas.get(i) * pesosArray.get(i);
        }
        media = somaNotasEPesos / pesoTotal;
        return media;
    }
}

