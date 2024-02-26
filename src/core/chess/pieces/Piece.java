/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.pieces;

import core.chess.Chess;
import core.chess.board.Position;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Piece {
    
    protected boolean color;
    protected Chess chess;
    protected Position position;

    public Piece(boolean color) {
        this.color = color;
        this.chess = null;
        this.position = null;
    }

    @Override
    public String toString() {
        String[] names = getClass().getName().split("\\.");
        String className = names[names.length - 1];
        return className + "(" + "color=" + color + ", chess=" + chess + ", position=" + position + ")";
    }
    
    public void setChess(Chess chess) {
        this.chess = chess;
    }

    public void setPosition(Position position) {
        if (this.position != null) {
            this.position.setPiece(null);
        }
        this.position = position;
        this.position.setPiece(this);
    }
    
    public void move() {
        
    }
    
    public static ArrayList<Piece> generatePieces() {
        ArrayList<Piece> pieces = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            pieces.add(new King(i == 0));
            pieces.add(new Queen(i == 0));
            for (int j = 0; j < 2; j++) {
                pieces.add(new Bishop(i == 0));
                pieces.add(new Knight(i == 0));
                pieces.add(new Rook(i == 0));
            }
            for (int j = 0; j < 8; j++) {
                pieces.add(new Pawn(i == 0));
            }
        }
        return pieces;
    }
    
}
