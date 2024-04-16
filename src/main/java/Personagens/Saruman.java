package Personagens;

import Classes.Mago;
import GrupoEnum.GrupoPersonagem;
import Mapa.Mapa;
import interfaces.Maia;

public class Saruman extends Mago implements Maia {

    private final int forca;
    private final int agilidade;
    private final int inteligencia;
    private int constituicao;

    private Mapa mapa;

    private final GrupoPersonagem grupo;

    public Saruman(){
        super();
        this.forca = 2;
        this.agilidade = 2;
        this.inteligencia = 9;
        this.constituicao = 70;
        this.grupo = GrupoPersonagem.ALIDOS_SARUMAN;
        this.poderAtaque = this.inteligencia;
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
        return "S";
    }

    @Override
    public Object ressucitar() {
        return null;
    }

    @Override
    public String fala() {
        return "Against the power of Mordor there can be no victory.";
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
