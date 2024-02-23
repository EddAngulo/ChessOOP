/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.board;

import core.chess.pieces.Piece;

/**
 *
 * @author edangulo
 */
public class Position {
    
    private int row;
    private String column;
    private boolean color;
    private Piece piece;

    public Position(int row, String column, boolean color) {
        this.row = row;
        this.column = column;
        this.color = color;
        this.piece = null;
    }

    @Override
    public String toString() {
        return "Position(" + "row=" + row + ", column=" + column + ", color=" + color + ")";
    }
    
    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    
}
