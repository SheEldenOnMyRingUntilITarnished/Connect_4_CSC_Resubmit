import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Connect4 {

    public enum Piece {
        PLAYER_1,
        PLAYER_2
    }
    public static void main(String[] args) 
    {
        boolean playerHasWon = false;
        while (!playerHasWon)
        {
            playerTurn();
            updateBoard();
            playerHasWon = checkForWin();
            updatePlayer();
        }
    }
    public static void playerTurn()
    {
        
    } 
    public static void setUpBoard(List<List<Piece>> colums,int rows)
    {
        
    } 
    public static void updateBoard()
    {
        
    } 
    public static void updatePlayer()
    {
        
    } 
    public static boolean checkForWin()
    {
        
        return false;
    } 
    
    
}
