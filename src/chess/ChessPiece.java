package chess;

import board.Board;
import board.Piece;
import board.Position;

public abstract class ChessPiece extends Piece{
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    public int getMoveCount() {
        return moveCount;
    }
    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }
    
    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
    
}
