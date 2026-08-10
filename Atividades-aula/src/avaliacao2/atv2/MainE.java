package avaliacao2.atv2;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class MainE {
    public static void main(String[] args){
        String nomeEstudante;
        Double nota;
        int tam = 4;
        int op = 1;
        Scanner scanner = new Scanner(System.in);

        ArrayList<Estudante> estudantes = new ArrayList<Estudante>();


        do{
            System.out.println("Nome do estudante:");
            nomeEstudante = scanner.nextLine();
            Estudante estudante = new Estudante(nomeEstudante);


            System.out.println("Insira até 5 notas:");
            for(int i = 0; i <= tam; i++){
                nota = scanner.nextDouble();
                estudante.insereNotas(nota);
            }

            System.out.println("Notas inseridas:" + estudante.getNotas());

            System.out.println("Média:" + estudante.calculaMedia(estudante.getNotas()));

            System.out.println("Menor nota:" + estudante.menorNota(estudante.getNotas()));
            estudantes.add(estudante);

            System.out.println("Digite 0 para inserir estudante e 1 para sair:");
            op = scanner.nextInt();
            scanner.nextLine();
        }while(op == 0);


    }
}
