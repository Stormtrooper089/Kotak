package org.example;

import org.example.Command.Grid;
import org.example.model.Player;

public class GridController {

    @Autowired
    GridController gridController ;

    public void initialze(int n){

        Player one = new Player("name", 0,n/2);
        Player two = new Player("name2", n/2+1,n);

    }

    public void initialze(Player a , Player b){
        Grid  grod = new Grid(a,b);

    }


}
