package Classes;

import GrupoEnum.GrupoPersonagem;
import Mapa.Mapa;
import Personagens.Personagem;

public class Mago extends Personagem {
public Mago(){
    super();
}


    @Override
    public void ataca(Mapa posicao) {

        int posicaoAtual = -1;

        for (int i = 0; i < posicao.posicoes.length; i++) {
            if (posicao.getPersonagem(i) == this) {
                posicaoAtual = i;
                break;
            }
        }
        int posicaoRestante = posicao.posicoes.length - posicaoAtual;
        switch (this.getGrupo()) {

            case SOCIEDADE_ANEL:
                for (int pos = posicaoRestante; pos >= posicaoAtual; pos--) {
                    Personagem quemAtaca = posicao.getPersonagem(posicaoAtual);
                    Personagem quemEAtacado = posicao.getPersonagem(pos);

                    if (posicao.getPersonagem(pos) != null && quemAtaca.getGrupo() != quemEAtacado.getGrupo()) {
                        int dano = this.getPoderAtaque();
                        int constituicaoInimigo = quemEAtacado.getConstituicao();
                        int novaConstituicao = constituicaoInimigo - dano;
                        quemEAtacado.setConstituicao(novaConstituicao);
                        if (quemEAtacado.getConstituicao() == 0) {
                            posicao.removerPersonagem(posicaoAtual + pos);
                        }
                    }

                }
                break;

            case ALIDOS_SARUMAN:
                for (int pos = posicaoRestante; pos <= posicaoAtual; pos++) {
                    Personagem quemAtaca1 = posicao.getPersonagem(posicaoAtual);
                    Personagem quemEAtacado1 = posicao.getPersonagem(pos);

                    if (posicao.getPersonagem(pos) != null && quemAtaca1.getGrupo() != (quemEAtacado1.getGrupo())) {
                        int dano = this.getPoderAtaque();
                        int constituicaoInimigo = quemEAtacado1.getConstituicao();
                        int novaConstituicao = constituicaoInimigo - (dano * pos);
                        quemEAtacado1.setConstituicao(novaConstituicao);
                        if (quemEAtacado1.getConstituicao() == 0) {
                            posicao.removerPersonagem(posicaoAtual - pos);
                        }
                    }

                }
                break;
        }
    }


    @Override
    public void anda(Mapa mapa) {
        int posicaoAtual = -1;

        for (int i = 0; i < mapa.posicoes.length; i++) {
            if (mapa.posicoes[i] == this) {
                posicaoAtual = i;
                break;
            }
        }

            boolean aliadoDeSaruman = false;
            for (Personagem personagem : mapa.posicoes) {
                if (personagem != null && personagem.getGrupo() == GrupoPersonagem.ALIDOS_SARUMAN) {
                    aliadoDeSaruman = true;
                    break;
                }
            }


            if (!aliadoDeSaruman && posicaoAtual < mapa.posicoes.length - 1 && mapa.posicoes[posicaoAtual + 1] == null) {
                mapa.removerPersonagem(posicaoAtual);
                mapa.inserir(posicaoAtual + 1, this);

            }
        }


}
