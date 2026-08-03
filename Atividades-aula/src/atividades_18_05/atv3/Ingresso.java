package atividades_18_05.atv3;

public class Ingresso {
    protected float valor;
    protected String valorP;
    public Ingresso(float valor){
        this.valor = valor;
    }

public void converteValor(float novoValor){

        valor = novoValor;
        valorP = Float.toString(novoValor);
    valorP = valorP.replace('.',',');
}

    public void imprimeValor(){
        converteValor(valor);
        System.out.println("Preço: R$" +valorP);
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getValorP() {
        return valorP;
    }

    public void setValorP(String valorP) {
        this.valorP = valorP;
    }
}
