package br.com.dobackaofront;

import br.com.dobackaofront.model.Cenario;
import br.com.dobackaofront.model.Elfo;
import br.com.dobackaofront.model.Guerreiro;
import br.com.dobackaofront.model.Mago;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Guerreiro warrior1 = new Guerreiro();

        warrior1.setNome("Artur");
        warrior1.setIdade(30);
        warrior1.setSexo('M');
        warrior1.setVitalidade(100);

        Guerreiro warrior2 = new Guerreiro("Bartolomeu", 'M', 30, 100, true);


        Elfo legolas = new Elfo("Legolas", 'M', 150, 300, 2500);

        Mago gandalf = new Mago("Gandalf", 'M', 200, 3000, 5000);


        Cenario terraMedia = new Cenario("Terra Média");

        terraMedia.adicionar(warrior1);
        terraMedia.adicionar(warrior2);
        terraMedia.adicionar(legolas);
        terraMedia.adicionar(gandalf);

        gandalf.atacar();
        legolas.defender();
        warrior1.defender();
        warrior1.atacar();
        legolas.atacar();
        gandalf.defender(1, " hahahahahaha seus fracos ! ");
        gandalf.virarSombrio();
    }

}

