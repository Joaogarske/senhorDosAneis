package Mapa;

import Personagens.Personagem;
import SenhorDosAneisExeptions.PersonagemJaEstaNoMapaException;
import SenhorDosAneisExeptions.PersonagemNaoEncontradoNoMapaException;
import SenhorDosAneisExeptions.PosicaoOcupadaException;


public class Mapa {
    public Personagem[] posicoes;

    public Mapa() {
        posicoes = new Personagem[10];
    }

    public void inserir(int posicao, Personagem personagem) {
        if (this.posicoes[posicao] != null) {
            throw new PosicaoOcupadaException("A posição " + posicao + " já está ocupada.");
        }
        for (Personagem p : this.posicoes) {
            if (p != null && p.equals(personagem)) {
                throw new PersonagemJaEstaNoMapaException("O personagem " + personagem + " já está no mapa.");
            }
        }
        this.posicoes[posicao] = personagem;
    }

    public int buscarCasa(Personagem personagem) {
        for (int i = 0; i < this.posicoes.length; i++) {
            if (personagem.equals(this.posicoes[i])) {
                return i;
            }
        }
        throw new PersonagemNaoEncontradoNoMapaException("Personagem " + personagem + " não encontrado no mapa.");
    }

    public void removerPersonagem(int posicao) {
        if (posicao >= 0 && posicao < posicoes.length) {
            posicoes[posicao] = null;
        } else {
            throw new IllegalArgumentException("Posição inválida: " + posicao);
        }
    }

    public String exibir() {
        StringBuilder sb = new StringBuilder();
        for (Personagem personagem : this.posicoes) {
            if (personagem != null) {
                sb.append("|").append(personagem.toString().charAt(0));
            } else {
                sb.append("| ");
            }
        }
        sb.append("|");
        return sb.toString();

    }

    public Personagem getPersonagem(int posicao) {
        if (posicao >= 0 && posicao < 10) {
            return this.posicoes[posicao];
        }
        return null;
    }

}
