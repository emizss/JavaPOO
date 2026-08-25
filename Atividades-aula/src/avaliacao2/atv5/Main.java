package avaliacao2.atv5;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o título do livro: ");
        String tituloLivro = scanner.nextLine();

        Livro livro = new Livro(tituloLivro);
        System.out.println("Livro '" + livro.getTitulo() + "' cadastrado com sucesso");

        int opcao;
        do {
            System.out.println("\nAções para o Livro: " + livro.getTitulo());
            System.out.println("1. Verificar situação");
            System.out.println("2. Emprestar");
            System.out.println("3. Devolver");
            System.out.println("0. Continuar para cadastro de Periódico");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Situação atual: " + (livro.isSituacao() ? "Disponível" : "Emprestado"));
                    break;
                case 2:
                    livro.emprestar();
                    break;
                case 3:
                    livro.devolver();
                    break;
                case 0:
                    System.out.println("Avançando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);


        System.out.println("\n CADASTRO DE PERIÓDICO ");
        System.out.print("Digite o título do periódico: ");
        String tituloPeriodico = scanner.nextLine();

        System.out.print("Digite o número do volume: ");
        int volume = scanner.nextInt();

        Periodico periodico = new Periodico(tituloPeriodico, volume);

        System.out.print("\n Dados do Periódico Cadastrado");
        System.out.print("Título: " + periodico.getTitulo());
        System.out.print("Volume: " + periodico.getNumVolume());
        System.out.print("Nota: Periódicos não podem ser emprestados.");

        scanner.close();
    }
}