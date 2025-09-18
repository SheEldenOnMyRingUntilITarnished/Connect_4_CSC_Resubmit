import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Connect4 {
    
    public GameBoard gameBoard = GlobalData.currentGameBoard();//Creates The Board
    public WinManager winManager = new WinManager();
    
    public GameBoard.Piece currentPlayer;
    
    //This Runs at the start of the game and runs the main gameplay loop
    public Connect4()
    {
        boolean playerHasWon = false;
        System.out.println("Welcome to Sideways Connect 4!!!");
        System.out.println("Remember Pieces go from right to left!!!!");
        System.out.println("Lets Begin!!!");
        UpdateBoard();//Runs once to display board before first player turn
        UpdatePlayer();
        while (!playerHasWon)
        {
            playerHasWon = PlayerTurn();
            ClearOutput();
            System.out.println("Remember Pieces go from right to left!!!!");
            UpdateBoard();
            UpdatePlayer();
        }
    }
    
    //A Players turn
    public boolean PlayerTurn()
    {
        //Declares Values
        Scanner keyboard = new Scanner(System.in);
        int x = -1;
        
        System.out.println("Player: " + currentPlayer + "'s turn");
        
        //Asks Player where they want to place there token
        System.out.println("Where do you want to place your token?");
        x = CheckForInt(keyboard,1,7);
        gameBoard.placeNewPiece(x-1, currentPlayer);
        //System.out.println("TURN END");
        
        return winManager.checkForWin(x-1, gameBoard.getColumn(x-1) - 1, currentPlayer);
    } 
    
    //This runs after each players turn to update the display board to show the next player where the last players peice was played
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
    
    //This runs at the end of a loop to change who the current player is to the next one
    public void UpdatePlayer()
    {
        if(currentPlayer == currentPlayer.X)
        {
            currentPlayer = currentPlayer.O;
        }else
        {
            currentPlayer = currentPlayer.X;
        }
        //System.out.print("Player Changed to: " + currentPlayer);
    }
    
    //Clears the Screen
    public void ClearOutput()
    {
        System.out.print('\u000c');
    }
    
    //This Checks if the inputed int is a actual int and not some irrgular value and 
    //if it is an int it will then out put it into the function.
    public int CheckForInt(Scanner keyboard, int minInt, int maxInt)
    {
        int returnedInt = -99;//irrational value for error checking
        try
        {
            returnedInt = Integer.parseInt(keyboard.nextLine());
            if(returnedInt > maxInt ||returnedInt < minInt)
            {
                System.out.print("INVALID PLEASE INPUT A NUMBER INBETWEEN " + minInt + " AND " + maxInt + "!");
                returnedInt = CheckForInt(keyboard, minInt, maxInt);
            }
        }
        catch(NumberFormatException e)
        {
            //Player Inputed invalid Value,, Time for the Inception
            System.out.print("INVALID PLEASE INPUT A NUMBER!");
            returnedInt = CheckForInt(keyboard, minInt, maxInt);
        }
        int coloumFill = gameBoard.getColumn(returnedInt - 1);
        if(coloumFill >= gameBoard.getColumns())
        {
            System.out.print("INVALID PLEASE CHOOSE A UNFILLED COLOUM!");
            returnedInt = CheckForInt(keyboard, minInt, maxInt);
        }
        return returnedInt;
    }
}
