package org.example;

import java.util.ArrayList;

public class Main {
    static String [][] battlefield;


    public static void main(String[] args) {

        int sizeOfGrid = 6 ;

        //this is initialization of grid
        initializeGrid(6);

        //adding ships to different pos
        addShip(battlefield,"SH1",2,0,4,3,3);

        addShip(battlefield,"SH2",2,0,0,4,0);




        viewBattleField(battlefield);

        fireMissile(battlefield,"playerNAme" ,0 ,1);

        System.out.println("Hello world!");
                        // n grid where is input
                            /*
                             Sample Execution:
                        >> initGame(6)
                    >> addShip(“SH1”, size = 2, 1, 5, 4, 4)
                    >> viewBattleField()

                    (6, 6)

                    A-SH
                    1
                    A-S
                    H1
                    A-SH
                    1
                    A-S
                    H1

                    B-S
                    H1
                    B-SH
                    1
                    B-S
                    H1
                    B-SH
                    1

                    (0, 0)
                    >> startGame()
                    PlayerA’s turn: Missile fired at (3, 0) : “Miss” : Ships
                    Remaining - PlayerA:1, PlayerB:1
                    PlayerB’s turn: Missile fired at (1, 1) : “Miss” : Ships
                    Remaining - PlayerA:1, PlayerB:1
                    PlayerA’s turn: Missile fired at (5, 3) : “Hit” B-SH2 destroyed
                    : Ships Remaining - PlayerA:1, PlayerB:0
                    GameOver. PlayerA wins.


         */

    }



    private static void viewBattleField(String[][] battlefield) {
        System.out.println("the status of battlefield");
        for(int i = 0 ; i < battlefield.length ; i++){
            for(int j =0 ; j < battlefield.length ; j++){
                System.out.print(battlefield[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void addShip(String[][] battlefield, String name, int size, int x1, int y1, int x2, int y2) {

        checkIFPlayerCanBeAlloted(battlefield,name,size,x1,y1);
        checkIFPlayerCanBeAlloted(battlefield,name,size,x2,y2);
    }

    /*
      012345
     0******
     1******
     2******
     3******
     4******
     5******


     */
    private static boolean checkIFPlayerCanBeAlloted(String[][] battlefield, String name, int size, int x1, int y1) {
        if (x1 < 0 || x1 > battlefield.length || y1 < 0 || y1 > battlefield.length){
            return false;
        }
        ArrayList<String> listOfList = new ArrayList<>();
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                listOfList.add( String.valueOf(x1+i) + " " + String.valueOf(y1+j));
            }
        }
        boolean allocate = true;
        for (String i:
             listOfList) {
            String [] split = i.split(" ");
            String entry = battlefield[Integer.valueOf(split[0])][Integer.valueOf(split[1])];

            if(!entry.equalsIgnoreCase("BLA")){
                allocate = false;
            }

        }
        for (String i:
                listOfList) {
            String [] split = i.split(" ");
            battlefield[Integer.valueOf(split[0])][Integer.valueOf(split[1])] = name;



        }

        //if()
        return false;
    }


}