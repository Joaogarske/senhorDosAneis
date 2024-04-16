package Personagens;

import Classes.Arqueiro;
import GrupoEnum.GrupoPersonagem;
import Mapa.Mapa;
import interfaces.Monstro;

public class Goblim extends Arqueiro implements Monstro {
    private final int forca;
    private final int agilidade;
    private final int inteligencia;
    private int constituicao;

    private Mapa mapa;

    private final GrupoPersonagem grupo;

    public Goblim(){
        super();
        this.forca = 7;
        this.agilidade = 4;
        this.inteligencia = 1;
        this.constituicao = 30;
        this.grupo = GrupoPersonagem.ALIDOS_SARUMAN;
        this.poderAtaque = this.agilidade;
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
        return "M";
    }

    @Override
    public String grunir() {
        return "Iiisshhhh";
    }

    @Override
    public void ataca(Mapa posicaoInimigo) {
        super.ataca(posicaoInimigo);
    }

    @Override
    public void anda(Mapa mapa) {
        super.anda(mapa);
    }
}
