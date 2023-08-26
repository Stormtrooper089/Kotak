package org.example.Command;

import org.example.model.Player;

@Redis
@MongoDb
public class Grid {

    String [][] battlefield;
    Player playerA;
    Player playerB;

    public Grid(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public String[][] getGrid(){
        return battlefield;
    }
}
