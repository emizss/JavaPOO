package avaliacao2.atv5;

public class Periodico extends Obra{
    private int numVolume;

    public Periodico(String titulo, int volume) {
        super(titulo);
    }

    public int getNumVolume() {
        return numVolume;
    }

    public void setNumVolume(int numVolume) {
        this.numVolume = numVolume;
    }
}
