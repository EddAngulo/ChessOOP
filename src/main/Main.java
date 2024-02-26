/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.chess.Chess;
import core.chess.board.Board;
import core.person.Player;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        Player player1 = new Player("Andres", 29);
        Player player2 = new Player("Juan", 26);
        
        Board board = new Board();
        
        Chess chess = new Chess(player1, board);
        chess.setPlayer2(player2);
        
        System.out.println(chess);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(board);
    }
    
}
