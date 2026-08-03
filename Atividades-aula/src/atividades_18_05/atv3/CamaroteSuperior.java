package atividades_18_05.atv3;

public class CamaroteSuperior extends Vip{
    protected String localizacao;
    protected float adicional;
    public CamaroteSuperior(float valor, float extra, String localizacao, float adicional) {
        super(valor, extra);
        this.localizacao = localizacao;
        this.adicional = adicional;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(){
        this.localizacao = localizacao;
    }

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }
    public void imprimiIngressoCamarote(){
        calcularVip(valor);
        valor += adicional;
        converteValor(valor);
        imprimeVIP();
    }
}
