package Classes;

import GrupoEnum.GrupoPersonagem;
import Mapa.Mapa;
import Personagens.Personagem;

public class Guerreiro extends Personagem {



    public Guerreiro(){
        super();

    }

    private Mapa mapa;
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

                Personagem quemAtaca = posicao.getPersonagem(posicaoAtual);
                Personagem quemEAtacado = posicao.getPersonagem(posicaoAtual + 1);

                if (quemEAtacado != null && quemAtaca.getGrupo() != quemEAtacado.getGrupo()) {
                    int dano = this.getPoderAtaque();
                    int constituicaoInimigo = quemEAtacado.getConstituicao();
                    int novaConstituicao = constituicaoInimigo - dano;
                    quemEAtacado.setConstituicao(novaConstituicao);
                    if (quemEAtacado.getConstituicao() == 0) {
                        posicao.removerPersonagem(posicaoAtual + 1);
                    }
                }
                break;
            case ALIDOS_SARUMAN:
                Personagem quemAtaca1 = posicao.getPersonagem(posicaoAtual);
                Personagem quemEAtacado1 = posicao.getPersonagem(posicaoAtual - 1);

                if (quemEAtacado1 != null && quemAtaca1.getGrupo() != quemEAtacado1.getGrupo()) {
                    int dano = this.getPoderAtaque();
                    int constituicaoInimigo = quemEAtacado1.getConstituicao();
                    int novaConstituicao = constituicaoInimigo - dano;
                    quemEAtacado1.setConstituicao(novaConstituicao);
                    if (quemEAtacado1.getConstituicao() == 0) {
                        posicao.removerPersonagem(posicaoAtual - 1);
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

        // Lógica de movimento para a Sociedade do Anel
        if (this.getGrupo() == GrupoPersonagem.SOCIEDADE_ANEL) {
            // Verifica se a próxima posição à direita está vazia
            if (posicaoAtual < mapa.posicoes.length - 1 && mapa.getPersonagem(posicaoAtual + 1) == null) {
                // Move o personagem para a direita
                mapa.removerPersonagem(posicaoAtual);
                mapa.inserir(posicaoAtual + 1, this);
            }
        }

        // Lógica de movimento para Aliados de Saruman
        if (this.getGrupo() == GrupoPersonagem.ALIDOS_SARUMAN) {
            // Verifica se a próxima posição à esquerda está vazia
            if (posicaoAtual > 0 && mapa.getPersonagem(posicaoAtual - 1) == null) {
                // Move o personagem para a esquerda
                mapa.removerPersonagem(posicaoAtual);
                mapa.inserir(posicaoAtual - 1, this);
            }
        }
    }
}


