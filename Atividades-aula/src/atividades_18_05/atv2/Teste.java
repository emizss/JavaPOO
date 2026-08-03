package atividades_18_05.atv2;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int op;
        int decisao;
        Pobre pobre = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quem você deseja ser? 1-Rico, 2-Pobre ou 3-Miseravel");
        op = scanner.nextInt();

        switch(op) {
            case 1:
                System.out.println("Você escolheu ser Rico!");
                Rica rica = new Rica(1000000,12, "Maria Joaquina");
                System.out.println("Nome: "+rica.getNome()+"\n Idade: "+rica.getIdade()+"\nDinheiro: "+ rica.getDinheiro());
                System.out.println("Vcê pode 1-Fazer compras, 2- Xingar mendigo ou 3- Chutar & xingar mendigo.");
                decisao = scanner.nextInt();
                if(decisao == 1){
                    rica.fazCompras();
                }
                else if(decisao == 2){
                    rica.XingarMendiga();
                }
                else if(decisao == 3){
                    rica.chutarMendiga();
                }
                else{
                    System.out.print("Valor inválido");
                }
                break;
            case 2:
                System.out.println("Você escolheu ser Pobre!");
                pobre = new Pobre("João Pobre", 25, 50.0);
                System.out.println("O que voce deseja fazer? 1-trabalhar 2-vagabundear");
                decisao = scanner.nextInt();
                if(decisao ==1){
                    pobre.trabalhar();
                } else if (decisao == 2) {
                    System.out.println("Por mim...");
                }
                else{
                    System.out.print("Valor inválido");
                }
                break;
            case 3:
                System.out.println("Você escolheu ser Miseravel!");
                Miseravel miseravel = new Miseravel("Mimi", 37);

                // Pobre se registra como ouvinte do evento de mendigar
                Pobre pobreAjudante = new Pobre("Ana Pobre", 30, 100.0);
                miseravel.addMendigarListener(pobreAjudante.criarListenerMendicancia());

                System.out.println("O que você deseja fazer? 1-Mendigar, 2-Dormir");
                decisao = scanner.nextInt();
                if (decisao == 1) {
                    miseravel.mendigar(); // dispara o evento → Pobre é notificado
                } else if (decisao == 2) {
                    miseravel.dormir();
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
