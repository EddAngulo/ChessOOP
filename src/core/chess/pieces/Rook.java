/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.pieces;

import core.chess.pieces.behaviors.Castlingable;

/**
 *
 * @author edangulo
 */
public class Rook extends Piece implements Castlingable {
    
    public Rook(boolean color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println("The " + (this.color ? "White" : "Black") + " Rook moves");
    }

    @Override
    public void castling() {
        System.out.println("The " + (this.color ? "White" : "Black") + " Rook castling");
    }
    
}
