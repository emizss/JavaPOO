package atv_encap_metodo_1;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String dataC;

/*
Crie uma classe Data que receba 3 números (mês, dia e ano) no construtor
e garanta que os dados foram inseridos corretamente.  E as datas são validas.
Em caso de números inseridos errados exibir mensagem e setar a data como 00-00-0000.
Criar ummétodo que exiba o valor da data verData(), no formato dia/mes/ano com os 0
 na frente exemplo ( 01/02/2022) , utilizar condicionais.
 */

public Data(){
    this.dia = 0;
    this.mes = 0;
    this.ano = 0;
    this.dataC = "";
}
public int getDia(){
    return dia;
}
public int getMes(){
    return mes;
}
public int getAno(){
    return ano;
}
public String getDataC(){
    return dataC;
}

public void setDia(int dia){
    if(dia < 1 || dia > 30){
        this.dia = 00;
    }
    else{
        this.dia = dia;
    }
}

    public void setMes(int mes) {
        if(mes < 0 || mes > 12){
            this.mes = 00;
        }
        else{
            this.mes = mes;
        }
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setDataC(String dataC) {
        this.dataC = dataC;
    }

    public String verData(){
       this.dataC = dia+"/"+mes+"/"+ano;
        return dataC;

    }

}
