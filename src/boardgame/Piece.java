package boardgame;

public class Piece {

    protected Position position;   // para que essa posição não seja visível na camada de xadrez
    private Board board;   // associação da classe peça com a tabuleiro

    public Piece(Board board) {
        this.board = board;
        position = null;       // a posição inicial da peça criada é nula, como se ainda não estivesse no tabuleiro.   Essa linha é opcional, pq já era nula mesmo.
    }

    protected Board getBoard() {   // não se pode alterar o tabuleiro
        return board;       // somente classes no mesmo pacote ou subclasses poderão visulizar o tabuleiro -> protected
    }
}
