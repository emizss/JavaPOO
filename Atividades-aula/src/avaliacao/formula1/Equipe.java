package avaliacao.formula1;

import java.util.ArrayList;

public class Equipe {
    private String nome;
    private int anoFundacao;
    private final Patrocinador[] patrocinadores;

    public Equipe(String nome, int anoFundacao, Patrocinador patrocinador){
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.patrocinadores = new Patrocinador[20];
        this.patrocinadores[0] = patrocinador;
    }

    public String getNome(){
        return nome;
    }
    public int getAnoFundacao(){
        return anoFundacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    //Patrocinador[] getPatrocinadores()

    public Patrocinador getPatrocinador(int pos) {
        return patrocinadores[pos];
    }

    public void setPatrocinador(Patrocinador patrocinador, Integer pos){
        this.patrocinadores[pos] = patrocinador;
    }
    public Integer getTamanho(){
        Integer cont=0;
        for(int i=0;i<20;i++){
            if(patrocinadores[i]!=null){
                cont++;
            }
        }
        return cont;
    }


}
