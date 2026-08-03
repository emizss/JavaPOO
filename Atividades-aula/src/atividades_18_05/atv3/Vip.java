package atividades_18_05.atv3;

public class Vip extends Ingresso{
    protected float extra;

    public Vip(float extra, float valor){
        super(valor);
        this.extra = extra;
    }

    public Float getExtra() {
        return extra;
    }

    public void setExtra(Float extra) {
        this.extra = extra;
    }
    public void calcularVip(float valor){
        valor = valor + extra;
        converteValor(valor);
    }
    public void imprimeVIP(){
        imprimeValor();
       // System.out.println("Valor VIP: R$" +valorP);
    }
}
