package avaliacao2.atv2;
import java.util.Scanner;
import java.lang.String;

public class MainE {
    public static void main(String[] args){
        String nomeEstudante;
        Double nota;
        int tam = 4;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do estudante:");
        nomeEstudante = scanner.nextLine();
        Estudante estudante = new Estudante(nomeEstudante);

        System.out.println("Insira até 5 notas:");
        for(int i = 0; i < tam; i++){
            nota = scanner.nextDouble();
            estudante.insereNotas(nota);
        }

        System.out.println("Notas inseridas:" + estudante.getNotas());

        System.out.println("Média:" + estudante.calculaMedia(estudante.getNotas()));


        System.out.println("Menor nota:" + estudante.menorNota(estudante.getNotas()));

    }
}
