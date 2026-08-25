package avaliacao2.atv5;

public class Livro extends Obra {

    private boolean situacao;

    public Livro(String titulo) {
        super(titulo);
        this.situacao = true;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void emprestar() {
        if (this.situacao) {
            this.situacao = false;
            System.out.println("O livro '" + getTitulo() + "' foi emprestado com sucesso.");
        } else {
            System.out.println("O livro '" + getTitulo() + "' já está emprestado.");
        }
    }

    public void devolver() {
        if (!this.situacao) {
            this.situacao = true;
            System.out.println("O livro '" + getTitulo() + "' foi devolvido e está disponível.");
        } else {
            System.out.println("O livro '" + getTitulo() + "' já estava disponível na biblioteca.");
        }
    }
}