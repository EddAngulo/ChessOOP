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
public class King extends Piece implements Castlingable {
    
    public King(boolean color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println("The " + (this.color ? "White" : "Black") + " King moves");
    }

    @Override
    public void castling() {
        System.out.println("The " + (this.color ? "White" : "Black") + " King castling");
    }
    
}
