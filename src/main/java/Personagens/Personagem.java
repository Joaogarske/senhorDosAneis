package Personagens;

import GrupoEnum.GrupoPersonagem;
import Mapa.Mapa;

public class Personagem {
    protected   int forca;
    protected   int agilidade;
    protected   int inteligencia;
    protected int constituicao;


    protected GrupoPersonagem grupo;

    protected  int poderAtaque;

    public boolean moveu = false;
    public Personagem(){
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.grupo = grupo;


    };

    public int getPoderAtaque() {
        return poderAtaque;
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

    public void ataca(Mapa posicaoInimigo){

    }
    public void anda(Mapa mapa){}




    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }
    
}
