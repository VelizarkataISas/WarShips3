/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package warships;

//import java.util.Scanner;

import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author scarf
 */
public class WarShips {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        
        //int x,y;
        Player Player1 = new Player("Sosomil", 0);
        System.out.println("gay");
        ShipParts[][] grid = new ShipParts[8][8];  //test
        SmallShip test = new SmallShip(grid);
        BigShip test2 = new BigShip(grid);
        MediumShip test3 = new MediumShip(grid);
        MediumShip test4 = new MediumShip(grid);
        
                
        test.PlaceParts(grid);
        Scoreboard Score = new Scoreboard();
        //test2.PlaceParts(grid);
        //test3.PlaceParts(grid);
        //test4.PlaceParts(grid);
        
        for(int i = 0; i<grid.length; i++){
            for(int t = 0; t<grid.length; t++){
                if(grid[i][t] != null) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println("");
        }
        boolean empty = false;
        while(!empty){
            System.out.println(Player1.Guess(input.nextInt(), input.nextInt(), grid));
            int br = 0;
            for(int i = 0; i<grid.length; i++){
                for(int k = 0; k<grid.length; k++){
                    if(grid[i][k] == null)br++;
                }
            }
            if(br == grid.length * grid.length){
                empty = true;
                //System.out.println(Player1.toString());
            }
        }
        
        Score.AddNSort(Player1);

 
    }
    
}
