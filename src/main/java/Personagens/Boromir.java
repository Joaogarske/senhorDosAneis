package Personagens;

import Classes.Guerreiro;
import GrupoEnum.GrupoPersonagem;
import interfaces.Humano;
import Mapa.Mapa;

public class Boromir extends Guerreiro implements Humano {
    private final int forca;
    private final int agilidade;
    private final int inteligencia;
    private int constituicao;

    private final GrupoPersonagem grupo;

    public Boromir(){
        super();
        this.forca = 7;
        this.agilidade = 6;
        this.inteligencia = 3;
        this.constituicao = 40;
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

    @Override
    public int envelhece() {
        return  2;
    }

    @Override
    public String fala() {
        return "One does not simply walk into Mordor.";
    }

    public String toString(){
        return "B";
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
