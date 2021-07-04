package org.prog.board;

public class Board {
    public final Tile[][] boardCor = new Tile [8][8];


    private void setUP(){
        for (int i = 0; i < boardCor.length; i++) {
            for (int j = 0; j < boardCor[i].length; j++) {
                boardCor[i][j] = new Tile();
            }
        }
    }

    public Board() {
        setUP();
    }
}
