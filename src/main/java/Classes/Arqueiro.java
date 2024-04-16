package Classes;

import GrupoEnum.GrupoPersonagem;
import Mapa.Mapa;
import Personagens.Personagem;

public class Arqueiro extends Personagem {


    public Arqueiro() {
        super();
    }

    @Override
    public void ataca(Mapa posicao) {

        int posicaoAtual = -1;
        // Encontrar a posição atual do guerreiro no mapa
        for (int i = 0; i < posicao.posicoes.length; i++) {
            if (posicao.getPersonagem(i) == this) {
                posicaoAtual = i;
                break;
            }
        }

        switch (this.getGrupo()) {
            case SOCIEDADE_ANEL:

                for (int pos = 3; pos >= posicaoAtual; pos--) {
                    Personagem quemAtaca = posicao.getPersonagem(posicaoAtual);
                    Personagem quemEAtacado = posicao.getPersonagem(posicaoAtual + pos);

                    if (posicao.getPersonagem(posicaoAtual + pos) != null && quemAtaca.getGrupo() != (quemEAtacado.getGrupo())) {
                        int dano = this.getPoderAtaque();
                        int constituicaoInimigo = quemEAtacado.getConstituicao();
                        int novaConstituicao = constituicaoInimigo - (dano * pos);
                        quemEAtacado.setConstituicao(novaConstituicao);
                        if (quemEAtacado.getConstituicao() == 0) {
                            posicao.removerPersonagem(posicaoAtual + pos);
                        }
                    }
                    if(quemEAtacado != null){
                        break;
                    }
                }
                break;

            case ALIDOS_SARUMAN:
                for (int pos = 3; pos <= posicaoAtual; pos++) {
                    Personagem quemAtaca = posicao.getPersonagem(posicaoAtual);
                    Personagem quemEAtacado = posicao.getPersonagem(posicaoAtual - pos);

                    if (posicao.getPersonagem(posicaoAtual - pos) != null && quemAtaca.getGrupo() != (quemEAtacado.getGrupo())) {
                        int dano = this.getPoderAtaque();
                        int constituicaoInimigo = quemEAtacado.getConstituicao();
                        int novaConstituicao = constituicaoInimigo - (dano * pos);
                        quemEAtacado.setConstituicao(novaConstituicao);
                        if (quemEAtacado.getConstituicao() == 0) {
                            posicao.removerPersonagem(posicaoAtual - pos);
                        }
                    }
                    if(quemEAtacado != null){
                        break;
                    }
                }
                break;
        }
    }


    @Override
    public void anda(Mapa mapa) {

        super.anda(mapa);
        int posicaoAtual = -1;

        // Encontrar a posição atual do guerreiro no mapa
        for (int i = 0; i < mapa.posicoes.length; i++) {
            if (mapa.getPersonagem(i) == this) {
                posicaoAtual = i;
                break;
            }
        }

        switch (this.getGrupo()){

            case SOCIEDADE_ANEL:
                if(mapa.getPersonagem(posicaoAtual + 1) == null &&  mapa.getPersonagem(posicaoAtual + 2) == null){
                if (posicaoAtual < mapa.posicoes.length  && mapa.getPersonagem(posicaoAtual + 2) == null) {
                    mapa.removerPersonagem(posicaoAtual);
                    mapa.inserir(posicaoAtual + 2, this);


                } else if(posicaoAtual < mapa.posicoes.length  && mapa.getPersonagem(posicaoAtual + 1) == null){
                    mapa.removerPersonagem(posicaoAtual);
                    mapa.inserir(posicaoAtual + 1, this);

                   }
                }
                break;
            case ALIDOS_SARUMAN:

                if(mapa.getPersonagem(posicaoAtual - 1) == null &&  mapa.getPersonagem(posicaoAtual - 2) == null){
                    if ( mapa.getPersonagem(posicaoAtual - 2) == null) {
                        mapa.removerPersonagem(posicaoAtual);
                        mapa.inserir(posicaoAtual - 2, this);


                    } else  if( mapa.getPersonagem(posicaoAtual - 1) == null){
                        mapa.removerPersonagem(posicaoAtual);
                        mapa.inserir(posicaoAtual - 1, this);

                    }
                }
                break;
        }
}}
