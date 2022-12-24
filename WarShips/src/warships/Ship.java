/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warships;

import java.util.Random;

/**
 *
 * @author scarf
 */
public class Ship {
    private int length;
    private ShipParts[][] grid;
    
    public Ship(){
        length = 2;
        grid = new ShipParts[8][8];
    }
    public Ship(int length, ShipParts grid[][]){
        SetLength(length);
        this.grid = grid;
    }
    
    public void SetLength(int length){
        if(length>1 && length<10){
            this.length = length;
        }
        
    }
    
    public void PlaceParts(ShipParts grid[][]){  //Wont work with multiple ships since it clears the whole grid when a ship cant construct properly. MUST FIX!!!
        Random rand = new Random();
        int FirstX;
        int FirstY;
        do{
            FirstX = rand.nextInt(grid.length);
            FirstY = rand.nextInt(grid.length);
        }
        while(grid[FirstX][FirstY] != null);
        
        int stepX = 0;
        int stepY = 0;
        switch(rand.nextInt(4)+1){
            case 1:
                stepY = -1;
                break;
            case 2:
                stepX = -1;
                break;
            case 3:
                stepX = 1;
                break;
            case 4:
                stepY = 1;
                break;
        }
        if(FirstX+stepX*(length-1) >= grid.length || FirstX+stepX*(length-1) < 0)stepX = -stepX;
        else if(FirstY+stepY*(length-1) >= grid.length || FirstY+stepY*(length-1) < 0)stepY = -stepY;
        int[][] cords = new int[length][2];
        {
            for(int x = 0; x<length; x++){
                cords[x][0] = FirstX + x*stepX;
            }
            for(int y = 0; y<length; y++){
                cords[y][1] = FirstY + y*stepY;
            }
            
            {
                int br=0;
                for(int i = 0; i<length; i++){
                
                    if(grid[cords[i][0]][cords[i][1]] == null){
                        br++;   
                    }
                } 
                if(br == length){
                    for(int i = 0; i<length; i++){
                        grid[cords[i][0]][cords[i][1]] = new ShipParts();
                    }
                }
                else PlaceParts(grid);
            }
//            catch(ArrayIndexOutOfBoundsException e){
//                PlaceParts(grid);
//            }
            
            
        }
        
    }
}
