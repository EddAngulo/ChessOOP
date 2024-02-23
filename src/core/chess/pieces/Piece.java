/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.pieces;

import core.chess.Chess;
import core.chess.board.Position;

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

    public void setChess(Chess chess) {
        this.chess = chess;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    
    public void move() {
        
    }
    
}