package Personagens;

import Classes.Mago;
import GrupoEnum.GrupoPersonagem;
import Mapa.Mapa;
import interfaces.Maia;

public class Gandalf extends Mago implements Maia {
    private final int forca ;
    private final int agilidade;
    private final int inteligencia;
    private int constituicao;

    private Mapa mapa;
    private final GrupoPersonagem grupo;

    public Gandalf(){
        super();
        this.forca = 2;
        this.agilidade = 3;
        this.inteligencia = 10;
        this.constituicao = 80;
        this.grupo = GrupoPersonagem.SOCIEDADE_ANEL;
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
        return "G";
    }

    @Override
    public Object ressucitar() {
       return new Gandalf();
    }
    @Override
    public String fala() {
        return "A Wizard is never late, nor is he early. He arrives precisely when he means to.";
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
