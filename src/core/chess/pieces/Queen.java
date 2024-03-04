/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.pieces;

/**
 *
 * @author edangulo
 */
public class Queen extends Piece {
    
    public Queen(boolean color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println("The " + (this.color ? "White" : "Black") + " Queen moves");
    }
    
}
