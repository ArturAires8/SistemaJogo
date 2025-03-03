package br.com.dobackaofront.model;

public class Elfo extends Personagem {

    private int longevidade;


    public Elfo(int longevidade) {
        this.longevidade = longevidade;
    }

    public Elfo(String nome, char sexo, int idade, int vitalidade, int longevidade) {
        super(nome, sexo, idade, vitalidade);
        this.longevidade = longevidade;

    }

    public int getLongevidade() {
        return longevidade;
    }

    public void setLongevidade(int longevidade) {
        this.longevidade = longevidade;
    }


    @Override
    public void atacar() {
        System.out.println("Silencia ! Respira fundo ! Mira a flexa e Atira !");
    }

    @Override
    public void defender() {
        System.out.println(" Ele se esquiva com sua velocidade ! ");
    }


}



