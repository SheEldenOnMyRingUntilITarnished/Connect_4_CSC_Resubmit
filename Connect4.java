import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Connect4 {
    
    public GameBoard gameBoard = GlobalData.currentGameBoard();//Creates The Board
    public WinManager winManager = new WinManager();
    
    public GameBoard.Piece currentPlayer;
    
    public Connect4()
    {
        boolean playerHasWon = false;
        UpdateBoard();//Runs once to display board before first player turn
        while (!playerHasWon)
        {
            playerHasWon = PlayerTurn();
            UpdateBoard();
            UpdatePlayer();
            //playerHasWon = true;
        }
    }
    
    //A Players turn
    public boolean PlayerTurn()
    {
        //Declares Values
        Scanner keyboard = new Scanner(System.in);
        int x = -1;
        
        //Asks Player where they want to place there token
        System.out.print("Where do you want to place your token?");
        x = CheckForInt(keyboard,0,6);
        gameBoard.placeNewPiece(x);
        System.out.println("TURN END");
        
        return winManager.checkForWin(x, gameBoard.getColumns() - 1, currentPlayer);
    } 
    
    public void UpdateBoard()
    {
        for(int x = 0; x <= gameBoard.getRows(); x++)
        {
            int fixedInt = x+1;
            for(int y = 0; y < gameBoard.getColumns(); y++)
            {
                if(gameBoard.getCell(x,y) == null){
                    System.out.print("[ ]");
                    System.out.print(" ");
                }
                else{
                    System.out.print("["+gameBoard.getCell(x,y)+"]");
                    System.out.print(" ");
                }
            }
            System.out.println(" < [" + fixedInt + "]");
        }
    }
    public void UpdatePlayer()
    {
        if(currentPlayer == currentPlayer.X)
        {
            currentPlayer = currentPlayer.O;
        }else
        {
            currentPlayer = currentPlayer.X;
        }
    }
    
    public int CheckForInt(Scanner keyboard, int minInt, int maxInt)
    {
        int returnedInt = -99;//irrational value for error checking
        try
        {
            returnedInt = Integer.parseInt(keyboard.nextLine());
            if(returnedInt > maxInt ||returnedInt < minInt)
            {
                System.out.print("INVALID PLEASE INPUT A NUMBER INBETWEEN " + maxInt + " AND " + minInt + "!");
                returnedInt = CheckForInt(keyboard, minInt, maxInt);
            }
        }
        catch(NumberFormatException e)
        {
            //Player Inputed invalid Value,, Time for the Inception
            System.out.print("INVALID PLEASE INPUT A NUMBER !");
            returnedInt = CheckForInt(keyboard, minInt, maxInt);
        }
        return returnedInt;
    }
}
