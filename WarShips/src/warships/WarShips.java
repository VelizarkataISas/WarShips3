/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package warships;

//import java.util.Scanner;

/**
 *
 * @author scarf
 */
public class WarShips {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //sdffthfgyyujk
        //Scanner input = new Scanner(System.in);
        System.out.println("gay");
        ShipParts[][] grid = new ShipParts[8][8];  //test
        SmallShip test = new SmallShip(grid);
        BigShip test2 = new BigShip(grid);
        MediumShip test3 = new MediumShip(grid);
        MediumShip test4 = new MediumShip(grid);
                
        test.PlaceParts(grid);
        test2.PlaceParts(grid);
        test3.PlaceParts(grid);
        test4.PlaceParts(grid);
        
        for(int i = 0; i<grid.length; i++){
            for(int y = 0; y<grid.length; y++){
                if(grid[i][y] != null) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println("");
        }
 
    }
    
}