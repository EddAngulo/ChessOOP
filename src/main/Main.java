/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.chess.Chess;
import core.chess.board.Board;
import core.chess.pieces.Piece;
import core.person.Player;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        Player player1 = new Player("Andres", 29);
        Player player2 = new Player("Juan", 26);
        
        Board board1 = new Board();
        
        Chess chess1 = new Chess(player1, board1);
        chess1.setPlayer2(player2);
        
        System.out.println(chess1);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(board1);
        System.out.println("-----------------------------------------------");
        
        for (Piece piece : Piece.generatePieces()) {
            System.out.println(piece);
        }
 
        System.out.println("-----------------------------------------------");
        
        chess1.setPieces(Piece.generatePieces());
        for (Piece piece : chess1.getPieces()) {
            System.out.println(piece);
        }
        
        System.out.println("-----------------------------------------------");
        
        Player player3 = new Player("Carlos", 15);
        Player player4 = new Player("Miguel", 9);
        
        Board board2 = new Board();
        
        Chess chess2 = new Chess(player3, player4, board2);
        
        // System.out.println(chess2);
        // System.out.println(player3);
        // System.out.println(player4);
        // System.out.println(board2);
    }
    
}
