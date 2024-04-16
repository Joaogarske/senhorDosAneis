package Personagens;


import Classes.Guerreiro;
import GrupoEnum.GrupoPersonagem;
import Mapa.Mapa;
import interfaces.Humano;

public class Aragorn extends Guerreiro implements Humano {
    private final  int forca;
    private final int agilidade;
    private final int inteligencia;
    private int constituicao;

    private int poderAtaque;

    public Mapa mapa;

    private final GrupoPersonagem grupo;
    public boolean moveu;
    public Aragorn(){
        super();
        this.forca = 10;
        this.agilidade = 7;
        this.inteligencia = 6;
        this.constituicao = 70;
        this.grupo = GrupoPersonagem.SOCIEDADE_ANEL;
        this.moveu = false;
        this.poderAtaque = 2 * this.forca;
    };

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
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

    public boolean isMoveu() {
        return moveu;
    }


    @Override
    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public void setMoveu(boolean moveu) {
        this.moveu = moveu;
    }

    @Override
    public int envelhece() {
       return  1;
    }

    @Override
    public String fala() {
        return "A day may come when the courage of men fails… but it is not THIS day.";
    }

    public String toString(){
        return "A";
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
