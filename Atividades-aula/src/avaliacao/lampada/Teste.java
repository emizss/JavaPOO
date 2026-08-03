package avaliacao.lampada;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Lampada lampada = new Lampada();
        boolean resultado;
        int leitura;
        float valor;

        resultado = lampada.Result();
        System.out.println("Estado da avaliacao.lampada: " + resultado);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Você deseja inserir a potencia da lâmpada? Digite 1-SIM 0-NAO");
        leitura = scanner.nextInt();

        if(leitura == 1 ){
            System.out.println("Insira potência: ");
            valor = scanner.nextFloat();

            lampada.setPotenciaM(valor);

            System.out.println(lampada.getPotenciaM());
        }
        else if (leitura == 0) {
            System.out.println("Potencia: " + lampada.getPotencia());
        }
        else{
            System.out.println("Valor inválido.");
        }

        scanner.close();
    }
}