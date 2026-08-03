package atividades_18_05.atv3;

public class CamaroteInferior extends Vip{
    protected String localizacao;
    public CamaroteInferior(float valor, float extra, String localizacao) {
        super(valor, extra);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(){
        this.localizacao = localizacao;
    }
}
