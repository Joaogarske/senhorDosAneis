package Personagens;

import Classes.Guerreiro;
import GrupoEnum.GrupoPersonagem;
import Mapa.Mapa;
import interfaces.Humano;
import interfaces.Monstro;

public class Urukhai extends Guerreiro implements Monstro, Humano {

    private final int forca;
    private final int agilidade;
    private final int inteligencia;
    private int constituicao;
    private Mapa mapa;

    private final GrupoPersonagem grupo;

    public Urukhai(){
        super();
        this.forca = 8;
        this.agilidade = 6;
        this.inteligencia = 3;
        this.constituicao = 45;
        this.grupo = GrupoPersonagem.ALIDOS_SARUMAN;
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
        return "U";
    }

    @Override
    public String grunir() {
        return "Uuurrrrrr";
    }

    @Override
    public int envelhece() {
        return 2;
    }

    @Override
    public String fala() {
        return "Looks like meat's back on the menu boys!";
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
