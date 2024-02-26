/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.chess.Chess;

/**
 *
 * @author edangulo
 */
public class Player {
    
    private String name;
    private int id;
    private Chess chess;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
        this.chess = null;
    }

    @Override
    public String toString() {
        return "Player(" + "name=" + name + ", id=" + id + ", chess=" + chess + ")";
    }
    
    public void setChess(Chess chess) {
        this.chess = chess;
    }
    
}
