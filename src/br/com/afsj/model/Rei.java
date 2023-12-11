package br.com.afsj.model;

public class Rei extends Peca {
    @Override
    public boolean movimentoOK(int x, int y) {
        if (posX == -1 && posY == -1) {
            return true;
        }
        if (((x == posX + 1) || (x == posX - 1)) && (y == posY)) {
            return true;
        }
        if ((x == posX) && ((y == posY + 1) || (y == posY - 1))) {
            return true;
        }
        if ((x == posX + 1) && ((y == posY + 1) || (y == posY - 1))) {
            return true;
        }
        if ((x == posX - 1) && ((y == posY + 1) || (y == posY - 1))) {
            return true;
        }
        /*if (this.moveCont == 0) {
            if (((x == posX + 2) || (x == posX - 2)) && (y == posY))
            	return true;
        }*/
        return false;
    }

    @Override
    public boolean capturar(int x, int y) {
        if (((x == posX + 1) || (x == posX - 1)) && (y == posY)) {
            return true;
        }
        if ((x == posX) && ((y == posY + 1) || (y == posY - 1))) {
            return true;
        }
        if ((x == posX + 1) && ((y == posY + 1) || (y == posY - 1))) {
            return true;
        }
        if ((x == posX - 1) && ((y == posY + 1) || (y == posY - 1))) {
            return true;
        }
        return false;
    }

}
