package br.com.afsj.model;

public class Torre extends Peca {

    @Override
    public boolean movimentoOK(int x, int y) {
        if (posX == -1 && posY == -1) {
            // A torre ainda não foi colocada no tabuleiro, pode se mover para qualquer posição
            return true;
        }

        // Verificar se o movimento é horizontal ou vertical
        if (x == posX || y == posY) {
            // Movimento válido, pois é horizontal ou vertical
            return true;
        } else {
            // Movimento inválido
            return false;
        }
    }

    // Método para verificar se a torre está na posição inicial para o roque
    public boolean posicaoInicial() {
        // Adapte conforme necessário com as regras específicas do seu jogo
        return posX == 0 && posY == 0;
    }
}
