package avaliacao2.atv2;

import java.util.ArrayList;

public class Manager {
    private  ArrayList<Estudante> aprovados;
    private  ArrayList<Estudante> estudantes;


    public Manager(){
        estudantes = new ArrayList<Estudante>();
        aprovados = new ArrayList<Estudante>();
    }

    public ArrayList<Estudante> getAprovados() {
        return aprovados;
    }

    public void setAprovados(ArrayList<Estudante> aprovados) {
        this.aprovados = aprovados;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public void insereEstudante(Estudante estudante){
        estudantes.add(estudante);
    }

    public ArrayList<Estudante> estudantesAprovados() {
        for (Estudante estudante : estudantes) {
            if (estudante.getMedia() >= 6) {
                aprovados.add(estudante);
            }
        }
        if (aprovados.isEmpty()) {
            return null;
        }

        return aprovados;
    }
}
