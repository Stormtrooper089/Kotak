package org.example.Services;

import org.example.Command.Fire;

import java.util.ArrayList;

public class GameManagementService {

    String [][] battlefield;

     ArrayList<String> playerOne= new ArrayList<>();
    ArrayList<String> playerTwo= new ArrayList<>();



    private  void fire(String[][] battlefield, String playerNAme, int x, int y) {

        String command = String.valueOf(x) + "-" + String.valueOf(y);
        if(playerOne.contains(command)){
            System.out.println("ALready fired ");
        }else{
            playerOne.add(command);
            if(battlefield[x][y].equalsIgnoreCase("BLA")){
                System.out.println("The missile is a miss");
            }else{
                System.out.println("The missile is a hit");
                String shipname = battlefield[x][y];
                //matrix find all with this name and assign to blank & check if he wins
            }
        }

    }

    private  void initializeGrid(int n) {
        battlefield = new String[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j =0 ; j < n ; j++){
                battlefield[i][j] = "BLA";
            }
        }
    }
}
