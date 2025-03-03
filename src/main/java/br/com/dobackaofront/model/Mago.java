package br.com.dobackaofront.model;

public class Mago extends Personagem implements Contrato {

    private int mana;

    public Mago() {

    }

    @Override
    public void atacar() {
        System.out.println("Tornado de fogo ! ");
    }

    @Override
    public void defender() {
        System.out.println("Esculdo de fogo ! ");
    }


    public void defender(int opcao) {
        if (opcao == 0) {
            System.out.println("Ele proclama o tornado de fogo");
        } else if (opcao == 1) {
            System.out.println("Ele proclama o escudo de fogo");
        }
    }

    public void defender(int opcao, String frase) {
        if (opcao == 0) {
            System.out.println("Ele proclama o tornado de fogo" + frase);
        } else if (opcao == 1) {
            System.out.println("Ele proclama o escudo de fogo" + frase
            );
        }
    }


    public Mago(int mana) {
        this.mana = mana;
    }

    public Mago(String nome, char sexo, int idade, int vitalidade, int mana) {
        super(nome, sexo, idade, vitalidade);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }


    @Override
    public void virarSombrio() {
        System.out.println("Virei um mago sombrio");
    }
}

