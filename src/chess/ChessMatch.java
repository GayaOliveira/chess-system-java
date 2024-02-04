package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {    // classe que guardará as regras do jogo

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);   // é a classe ChessMatch que sabe as dimensões de um tabuleiro de xadrez
        initialSetup();
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

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }


    private void initialSetup(){
        placeNewPiece('B', 6, new Rook(board, Color.WHITE));
        placeNewPiece('E', 8, new King(board, Color.BLACK));
        placeNewPiece('E', 1, new King(board, Color.WHITE));
    }

}
