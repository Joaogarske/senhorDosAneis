package org.example;

import Classes.Arqueiro;
import Classes.Guerreiro;
import Classes.Mago;
import GrupoEnum.GrupoPersonagem;
import Mapa.Mapa;
import Personagens.Personagem;
import SenhorDosAneisExeptions.SauronDominaOMundoException;

import java.util.HashSet;
import java.util.Set;

public class Simulador {

    public Simulador() {
    }

    public void simular(Mapa mapa) {
        boolean terminouSimulacao = false;
        Set<Personagem> personagensMovidos = new HashSet<>();

        while (!terminouSimulacao) {
            boolean sociedadeDerrotada = true;
            for (int i = 0; i < mapa.posicoes.length; i++) {
                Personagem personagem = mapa.getPersonagem(i);


                if (personagensMovidos.contains(personagem)) {
                    continue;
                }

                if (personagem instanceof Guerreiro || personagem instanceof Arqueiro || personagem instanceof Mago) {
                    personagem.ataca(mapa);
                    personagem.anda(mapa);
                    personagensMovidos.add(personagem);
                }

                if (mapa.getPersonagem(9) != null && mapa.getPersonagem(9).getGrupo() == GrupoPersonagem.SOCIEDADE_ANEL) {
                    System.out.println("sociedade vence!");
                    terminouSimulacao = true;
                    break;
                }
                if (personagem != null && personagem.getGrupo() == GrupoPersonagem.SOCIEDADE_ANEL) {
                    sociedadeDerrotada = false;
                }
                if(sociedadeDerrotada){
                    throw new SauronDominaOMundoException("A humanidade sofre perante a tirania de Sauron.");
                }
            }


            personagensMovidos.clear();
        }
    }
}
