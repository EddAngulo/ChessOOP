/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess;

import core.chess.board.Board;
import core.chess.pieces.Piece;
import core.person.Player;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Chess {
    
    private Player player1;
    private Player player2;
    private ArrayList<Piece> pieces;
    private Board board;

    public Chess(Player player1, Board board) {
        this.player1 = player1;
        this.player2 = null;
        this.pieces = new ArrayList<>();
        this.board = board;
        
        this.player1.setChess(this);
        this.board.setChess(this); 
    }
    
    public Chess(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.pieces = new ArrayList<>();
        this.board = board;
        
        this.player1.setChess(this);
        this.player2.setChess(this);
        this.board.setChess(this); 
    }
    
    public void setPlayer2(Player player2) {
        if (this.player2 == null) {
            this.player2 = player2;
            this.player2.setChess(this);
        }
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }
    
    public void setPieces(ArrayList<Piece> pieces) {
        if (pieces.size() <= 32) {
            for (Piece piece : this.pieces) {
                piece.setChess(null);
            }
            this.pieces = pieces;
            for (Piece piece : this.pieces) {
                piece.setChess(this);
            }
        }
        
    }
    
}
