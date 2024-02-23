/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.board;

import core.chess.Chess;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Board {
    
    private Chess chess;
    private ArrayList<Position> positions;

    public Board() {
        this.chess = null;
        this.positions = new ArrayList<>();
        this.initializePositions();
    }

    public void setChess(Chess chess) {
        this.chess = chess;
    }
    
    private void initializePositions() {
        for (int row = 1; row <= 8; row++) {
            for (int column = 65; column <= 72; column++) {
                String letter = String.valueOf((char) column);
                // Position p = new Position(row, letter, ((row + column) % 2 == 1));
                // this.positions.add(p);
                this.positions.add(new Position(row, letter, ((row + column) % 2 == 1)));
            }
        }
    }
    
    public void verify() {
        for (Position position : this.positions) {
            System.out.println(position);
        }
    }
    
}
