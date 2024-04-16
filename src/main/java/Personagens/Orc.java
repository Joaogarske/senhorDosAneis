package Personagens;

import Classes.Guerreiro;
import GrupoEnum.GrupoPersonagem;
import Mapa.Mapa;
import interfaces.Monstro;

public class Orc extends Guerreiro implements Monstro {
    private final int forca;
    private final int agilidade;
    private final int inteligencia;
    private int constituicao;



    private  Mapa mapa;

    private final GrupoPersonagem grupo;

    public Orc(){
        super();
        this.forca = 7;
        this.agilidade = 4;
        this.inteligencia = 1;
        this.constituicao = 30;
        this.grupo = GrupoPersonagem.ALIDOS_SARUMAN;
        this.poderAtaque = 2 * this.forca;
    };

    @Override
    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

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
        return "O";
    }

    @Override
    public String grunir() {
        return "Arrrggghhh";
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
