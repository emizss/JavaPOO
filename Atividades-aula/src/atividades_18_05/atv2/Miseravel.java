package atividades_18_05.atv2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Miseravel extends Pessoa {  // só um extends!

    private double esmola;
    // Composição: o suporte a eventos fica aqui dentro
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public Miseravel(String nome, int idade) {
        super(nome, idade);
        this.esmola = 0;
    }

    // Pobre (ou qualquer um) se registra aqui para escutar
    public void addMendigarListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener("mendigar", listener);
    }

    public void removeMendigarListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener("mendigar", listener);
    }

    public void mendigar() {
        System.out.println(getNome() + " está mendigando...");
        // Dispara o evento — Pobre será notificado aqui
        pcs.firePropertyChange("mendigar", null, this);
    }

    public void dormir() {
        System.out.println("ZzZzzzz");
    }

    public double getEsmola() { return esmola; }
    public void setEsmola(double esmola) { this.esmola = esmola; }
}