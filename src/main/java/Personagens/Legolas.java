package Personagens;
import Mapa.Mapa;
import Classes.Arqueiro;
import GrupoEnum.GrupoPersonagem;
import interfaces.Elfo;

public class Legolas extends Arqueiro implements Elfo {
    private final int forca;
    private final int agilidade;
    private final int inteligencia;
    private int constituicao;

    private Mapa mapa;

    private final GrupoPersonagem grupo;

    public Legolas(){
        super();
        this.forca = 5;
        this.agilidade = 10;
        this.inteligencia = 6;
        this.constituicao = 80;
        this.grupo = GrupoPersonagem.SOCIEDADE_ANEL;
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
        return "L";
    }

    @Override
    public String falarEflico() {
       return "I amar prestar aen, han mathon ne nem, han mathon ne chae, a han noston ned.";
    }

    @Override
    public String fala() {
      return "They're taking the Hobbits to Isengard!";
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
