package org.prog.teranzeige;

import org.prog.board.Board;

public class TerminalAnzeige {
    Board board = new Board();





    public void show(){
        for (int i = 0; i < board.boardCor.length; i++) {
            for (int j = 0; j < board.boardCor[i].length; j++) {
                System.out.print(board.boardCor[i][j].toString() + " " + ((1+j)+(i*8)));
            }
            System.out.print("\n");
        }
    }

}
