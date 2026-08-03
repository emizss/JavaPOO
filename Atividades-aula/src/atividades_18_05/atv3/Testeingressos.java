package atividades_18_05.atv3;

import java.util.Scanner;

public class Testeingressos {
    public static void main(String[] args) {
        int op;
        int ingressoEscolha = 0;
        int qtdIngresso = 0;
        int cont = 0;
        Scanner scanner = new Scanner(System.in);
        Ingresso ingresso = new Ingresso(20);
        Normal normal = new Normal(20);
        Vip vip = new Vip(15, 20);
        CamaroteInferior camaroteInferior = new CamaroteInferior(20, 15, "ÁREA B - ordem de chegada");
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(20, 15, "ÁREA A - ordem de chegada", 25);

        do{
            System.out.println("O que voce deseja? 1- Escolher ingresso, 2- Finalizar compra, 3- Sair");
            op = scanner.nextInt();

            switch (op){
                case 1:
                    cont++;
                    if(cont>1){
                        System.out.println("A sua escolha anterior vai ser apagada!");
                    }
                    System.out.println("Qual ingresso você deseja? 1-Clássico, 2-VIP inferior, 3-VIP superior. Compre 1x por vez.");
                    ingressoEscolha = scanner.nextInt();
                    //System.out.println("Quantos você deseja?");
                    //qtdIngresso = scanner.nextInt();
                break;
                case 2:
                    if(ingressoEscolha == 1){
                        normal.imprimeIngressoNormal();
                        System.out.println("Pagamento processado. Compra finalizada!");
                    } else if (ingressoEscolha == 2) {
                        vip.calcularVip(vip.valor);
                        vip.imprimeValor();
                        System.out.println("Localização: "+camaroteInferior.getLocalizacao());
                        System.out.println("Pagamento processado. Compra finalizada!");
                    } else if (ingressoEscolha == 3) {
                        //vip.calcularVip();
                        camaroteSuperior.imprimiIngressoCamarote();
                        System.out.println("Localização: "+camaroteSuperior.getLocalizacao());
                        System.out.println("Pagamento processado. Compra finalizada!");
                    } else if (ingressoEscolha == 0) {
                        System.out.println("Erro. Você precisa escolher um ingresso....");
                    } else{
                        System.out.println("Valor inválido");
                    }
                    break;
                default:
                    if(op!=3){
                        System.out.println("Valor inválido");
                    }


            }
        }while(op!=3);


    }

}

