package Personagens;

import Classes.Guerreiro;
import GrupoEnum.GrupoPersonagem;
import interfaces.Anao;
import Mapa.Mapa;

public class Gimli extends Guerreiro implements Anao {
    private final int forca;
    private final int agilidade;
    private final int inteligencia;
    private int constituicao;

    private Mapa mapa;

    private final GrupoPersonagem grupo;

    public Gimli(){
        super();
        this.forca = 9;
        this.agilidade = 2;
        this.inteligencia = 4;
        this.constituicao = 60;
        this.grupo = GrupoPersonagem.SOCIEDADE_ANEL;
        this.poderAtaque = 2 * this.forca;
    };



    public int getForca() {
        return forca;
    }


    public int getAgilidade() {
        return agilidade;
    }


    public int getInteligencia() {
        return inteligencia;
    }


    public int getConstituicao() {
        return constituicao;
    }

    public GrupoPersonagem getGrupo() {
        return grupo;
    }

    public String toString(){
        return "I";
    }

    @Override
    public void beber() {

    }

    @Override
    public String fala() {
        return "Let them come. There is one Dwarf yet in Moria who still draws breath.";
    }

    @Override
    public String falarBebado() {
        return "What did I say? He can't hold his liquor!";
    }

    @Override
    public void ataca(Mapa posicaoInimigo) {
        super.ataca(posicaoInimigo);
    }

    @Override
    public void anda(Mapa mapa) {super.anda(mapa);

    }
}
