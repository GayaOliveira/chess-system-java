package boardgame;

public class Board {

    private int rows;
    private int columns;

    private Piece [][] pieces;  //  associação de classes -> matriz que conterá as peças que estão no tabuleiro

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];  // matriz iniciada com o nº de linhas e coluna informado
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}