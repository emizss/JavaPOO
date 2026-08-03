package avaliacao.formula1;

public class CarroF1 {
    public static void main(String[] args) {


        Piloto piloto = new Piloto("emi", "brasil", 18, 20);
        Engenheiro engenheiro = new Engenheiro("hiago", "eua", 38, piloto);
        Patrocinador patrocinador = new Patrocinador("urach", 300000);
        Patrocinador patrocinador2 = new Patrocinador("redbull", 300000);
        Equipe equipe = new Equipe("bananas", 1999, patrocinador);
        Carro carro = new Carro(1, 4, piloto, equipe);

        carro.getEquipe().setPatrocinador(patrocinador2,1);

        // Exibir dados coletados
        System.out.println("\n- DADOS DO CARRO  -");
        System.out.println("Nome do piloto:  " + carro.getPiloto().getNome());
        System.out.println("Nacionalidade do piloto: " + carro.getPiloto().getNacionalidade());
        System.out.println("Idade do piloto: " + carro.getPiloto().getIdade());
        System.out.println("Vitórias: " + carro.getPiloto().getQntVitorias());
        System.out.println("\n- DADOS DO ENGENHEIRO  -");
        System.out.println("Nome: " + engenheiro.getNome());
        System.out.println("Nacionalidade: " + engenheiro.getNacionalidade());
        System.out.println("Idade: " + engenheiro.getIdade());
        System.out.println("Piloto atribuido: " + engenheiro.getPiloto().getNome());
        System.out.println("\n- DADOS DA EQUIPE  -");
        System.out.println("Nome: " + carro.getEquipe().getNome());
        System.out.println("Ano de fundação: " + carro.getEquipe().getAnoFundacao());
        System.out.println("\n- DADOS DOs PATROCINIOS  -");
        for (int i=0;i<carro.getEquipe().getTamanho();i++){
            System.out.println("\nPatrocinador "+(i+1)+":");
            System.out.println("Nome: " + carro.getEquipe().getPatrocinador(i).getNome());
            System.out.println("Preço: " + carro.getEquipe().getPatrocinador(i).getValor());
        }
        System.out.println("\n- CARRO  -");
        System.out.println("Posição: " + carro.getPosicao());
        System.out.println("Número: " + carro.getNumero());
        System.out.println("Piloto: " + carro.getPiloto().getNome());
        System.out.println("Equipe: " + carro.getEquipe().getNome());


    }

}