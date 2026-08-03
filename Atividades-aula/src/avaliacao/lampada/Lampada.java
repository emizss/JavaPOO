package avaliacao.lampada;

public class Lampada {
    //Declaração de variáveis
    private boolean estado;
    private float potencia;
    private float potenciaM;

    //construtor de valores default
    public Lampada(){
        estado =  false;
        potencia = 60;
    }
    //construtor para modificar os valores
    public Lampada(boolean estado, float potenciaM)
    {
        this.estado = estado;
        this.potenciaM = potenciaM;
    }
    //metodo Interruptor
    public void interruptor(){
        if (estado == false){
            estado = true;
        }
        else{
            estado = false;
        }

    }
    //GET serve para definir a forma como o dado vai ser "pegado"/retornado
    public float getPotencia(){

        return potencia;
    }
    public float getPotenciaM(){

        return potenciaM;
    }
    //SET serve pra definir o que vai acontecer com o dado, settar definições
    public void setPotenciaM(float potenciaM){
        if(potenciaM >= 1 && potenciaM <= 1000){
            this.potenciaM = potenciaM;
          //  return "Potência: " + potenciaM;
        } else {
            this.potenciaM = -1;
          //  return "Valor inválido: " + potenciaM; LEMBRAR QUE NAO É PRA RETORNAR NO SET
        }
    }
    //metodo para enviar resposta
    public boolean Result (){
        interruptor();
        return estado;
    }
}
