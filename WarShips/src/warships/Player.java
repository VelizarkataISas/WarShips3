/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warships;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author scarf
 */
public class Player {
    private String name;
    private int score;
    
    public Player(){
        name = " ";
        score = 0;
    }
    
    public Player(String name, int score){
        SetName(name);
        this.score = score;
    }
    
    public String SetName(String name){
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{3,9}");
        Matcher m = p.matcher(name);
        
        if(m.matches()){
            this.name = name;
            return "Valid name";
        }
        else return "Invalid name";
    }
    
    public String GetName(){
        return name;
    }
    
    public int GetScore(){
        return score;
    }
    
    public String Guess(int x, int y, ShipParts[][] grid){
        try{
            if(grid[x][y] != null){
                grid[x][y] = null;
                score++;
                return "Hit !";
            }
            else {
                score++;
                return "Miss !"; 
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            return "Invalid coordinates";
        }
    }
    
    public String toString(){
        return String.format("%s %d", name, score);
    }
}
