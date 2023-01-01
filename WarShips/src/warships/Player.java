package warships;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

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
    
    public Player (Player obj){
        SetName(obj.GetName());
        SetScore(obj.GetScore());
    }
    
    public String SetName(String name){
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,9}");
        Matcher m = p.matcher(name);
        
        if(m.matches()){
            this.name = name;
            return "Valid name";
        }
        else return "Invalid name";
    }
    public void SetScore(int score){
        if(score>0)
            this.score = score;
    }
    
    public String GetName(){
        return name;
    }
    
    public int GetScore(){
        return score;
    }
    
    public String Guess(int x, int y, ShipParts[][] grid){ //малко по-лесно да ми е да правя проверките
        try{
            if(grid[x][y] != null){
                //grid[x][y] = null;
                //score++;
                return "h";
            }
            else {
                //score++;
                return "m";
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            return "i";
        }
    }
    
    public String toString(){
        return String.format("%s %d", name, score);
    }
}
