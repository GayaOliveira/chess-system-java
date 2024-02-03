package chess;

import boardgame.Board;

public class ChessMatch {    // classe que guardará as regras do jogo

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);   // é a classe ChessMatch que sabe as dimensões de um tabuleiro de xadrez
    }

    public ChessPiece[][] getPieces(){   // nosso programa não enxergará uma matriz do tipo Piece, só do tipo ChessPiece
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);  // o método piece retorna um elemento pieces[row][column]; daí, fazemos o downcasting para ChessPiece
            }
        }
        return mat;
    }


}
