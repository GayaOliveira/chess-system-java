package chess;

import boardgame.Position;

public class ChessPosition {  // essa classe fará a relação entre as posições de uma matriz em Java e as posições num jogo de xadrez
    // Ex: a posição "0,0" numa matriz corresponde à posição "A8" no tabuleiro de xadrez

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Error instantiating ChessPosition. Valid values are from A1 to H8.");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());   // necessário o casting pro char
    }

    @Override
    public String toString() {
        return "" + column + row;
    }

}
