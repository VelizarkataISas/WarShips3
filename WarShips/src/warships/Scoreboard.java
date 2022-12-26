/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warships;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author scarf
 */
public class Scoreboard{
    
    private File ScoreBoard;
    //private Scanner FileReader;
    //private PrintStream FileWriter;
    
    public Scoreboard() throws FileNotFoundException{
        ScoreBoard = new File("src\\warships\\Scoreboard.txt");
        //FileReader = new Scanner(ScoreBoard);
        //FileWriter = new PrintStream(ScoreBoard);
    }
    
    public void AddNSort(Player player) throws FileNotFoundException{
        int numberOfLines = 0;
        Scanner FileReader = new Scanner(ScoreBoard);
        while(FileReader.hasNextLine()){
            FileReader.nextLine();
            numberOfLines++;
        }
        
        Player[] users = new Player[numberOfLines+1];
        
        for(int i = 0; i<users.length; i++){
            users[i] = new Player();
        }
        
        FileReader = new Scanner(ScoreBoard);
        String[] tek = new String[2];
        
        users[0] = player;
        for(int i = 1; i<users.length; i++){
            tek = FileReader.nextLine().split(" ");
            users[i].SetName(tek[0]);
            users[i].SetScore(Integer.parseInt(tek[1]));
            tek = null;
        }
        
        for(int i = 0; i<users.length-1; i++){
            for(int k = 0; k<users.length-i-1; k++){
                if(users[k].GetScore() > users[k+1].GetScore()){
                    Player swap = new Player(users[k]);
                    users[k] = new Player(users[k+1]);
                    users[k+1] = new Player(swap);
                }
                
            }
        }
        
        PrintStream FileWriter = new PrintStream(ScoreBoard);
        //System.out.println(numberOfLines);
        for(int i = 0; i<users.length; i++){
            FileWriter.println(users[i].toString());
            //System.out.println(users[i].toString());
        }
        
    }
    
}
