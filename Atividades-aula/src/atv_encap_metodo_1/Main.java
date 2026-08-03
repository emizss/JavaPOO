package atv_encap_metodo_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int valor;
        String dataFinal;
       Data data = new Data();
       Scanner scanner = new Scanner(System.in);

        //System.out.println("Estado da avaliacao.lampada: " + resultado);
        //leitura = scanner.nextInt();
        System.out.println("Insira um dia: ");
        valor = scanner.nextInt();
        data.setDia(valor);
        System.out.println("Insira um mês: ");
        valor = scanner.nextInt();
        data.setMes(valor);
        System.out.println("Insira um ano: ");
        valor = scanner.nextInt();
        data.setAno(valor);

        dataFinal = data.verData();
        System.out.println("DATA: "+dataFinal);



        scanner.close();
    }
}
