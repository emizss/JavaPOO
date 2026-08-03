package atividades_18_05.atv2;

public class Rica extends Pessoa {
    private double dinheiro;
    public Rica(double dinheiro, int idade, String nome){
        super(nome, idade);
        this.dinheiro = dinheiro;
    }
    public void fazCompras(){
        System.out.println(dinheiro);
        this.dinheiro -= 100.0;
        System.out.println("Compra realizada! "+dinheiro);
    }
    public void chutarMendiga(){
        XingarMendiga();
        System.out.println("Mendiga: ai, para com isso");
    }
    public void XingarMendiga(){
        System.out.println("Suja! Sua porca imunda preguiçosa!");
    }
    public double getDinheiro(){
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
}
