package atividades_18_05.atv2;

import java.util.Random;

public class Pobre extends Pessoa  {

    private double salario;
    private double saldo;

    public Pobre(String nome, int idade, double saldo) {
        super(nome, idade);
        this.salario = 37.5;
        this.saldo = saldo;
    }

    public void trabalhar() {
        saldo += salario;
        System.out.println("Após um longo dia de trabalho...");
        System.out.println("Saldo: R$" + saldo);
    }

    public void ajudarMiseravel() {
        Random gerador = new Random();
        int geradorInt = gerador.nextInt(2);
        if (geradorInt == 0) {
            System.out.println("Bah, hoje eu não tenho nada...");
        } else {
            saldo -= geradorInt;
            System.out.println("Só tenho R$" + geradorInt + "...");
        }
    }

    // Retorna um listener que pode ser registrado no Miseravel
    public java.beans.PropertyChangeListener criarListenerMendicancia() {
        return evt -> {
            System.out.println(getNome() + " ouviu o pedido de esmola!");
            ajudarMiseravel();
        };
    }
}