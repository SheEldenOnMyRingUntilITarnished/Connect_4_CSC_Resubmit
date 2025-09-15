
/**
 * Write a description of class WinManager here.
 *
 * @author (Zachary Quinn)
 * @version (a version number or a date)
 */
public class WinManager
{
    public GameBoard gameBoard = GlobalData.currentGameBoard();
    
    public boolean checkForWin(int x, int y, GameBoard.Piece player) {
        int currentlyInARow = 0;
        boolean playerHasWon = false;
        
        // Vertical Line
        for(int i = -4; i < 4; i++)
        {
            if(x+i >= 0 && x+i <= gameBoard.getRows())
            {
                if (player == gameBoard.getCell(x+i, y))
                {
                    currentlyInARow++;
                    System.out.println("Vertical Line");
                    System.out.println("Cell: " + (x+i) + "/" + y + "!");
                    System.out.println("In a row: " + currentlyInARow);
                    if(currentlyInARow >= 4)
                    {
                        System.out.print("Player: " + player + " Has won");
                        playerHasWon = true;
                    }
                }else
                {
                    currentlyInARow = 0;
                }
            }
        }
        
        //Horizontal Line
        for(int i = -4; i < 4; i++)
        {
            if(y+i >= 0 && y+i <= gameBoard.getColumns())
            {
                if (player == gameBoard.getCell(x, y+i))
                {
                    currentlyInARow++;
                    System.out.println("Horizontal Line");
                    System.out.println("Cell: " + x + "/" + (y+i) + "!");
                    System.out.println("In a row: " + currentlyInARow);
                    if(currentlyInARow >= 4)
                    {
                        System.out.print("Player: " + player + " Has won");
                        playerHasWon = true;
                    }
                }else
                {
                    currentlyInARow = 0;
                }
            }
        }
        /*
        //Line going bottom left to top right
        for(int i = -4; i < 4; i++)
        {
            if(x+i >= 0 && x+i <= gameBoard.getRows() && y-i >= 0 && y-i <= gameBoard.getRows())
            {
                if (player == gameBoard.getCell(x+i, y-i))
                {
                    currentlyInARow++;
                    System.out.println("Bottom left to top right");
                    System.out.println("Cell: " + (x+i) + "/" + (y-i) + "!");
                    System.out.println("In a row: " + currentlyInARow);
                    if(currentlyInARow >= 4)
                    {
                        System.out.print("Player: " + player + " Has won");
                        playerHasWon = true;
                    }
                }else
                {
                    currentlyInARow = 0;
                }
            }
        }
        
        //Line going top left to bottom right
        for(int i = -4; i < 4; i++)
        {
            if(x-i >= 0 && x-i <= gameBoard.getRows() && y+i >= 0 && y+i <= gameBoard.getRows())
            {
                if (player == gameBoard.getCell(x-i, y+i))
                {
                    currentlyInARow++;
                    System.out.println("Top left to bottom right");
                    System.out.println("Cell: " + (x-i) + "/" + (y+i) + "!");
                    System.out.println("In a row: " + currentlyInARow);
                    if(currentlyInARow >= 4)
                    {
                        System.out.print("Player: " + player + " Has won");
                        playerHasWon = true;
                    }
                }else
                {
                    currentlyInARow = 0;
                }
            }
        }
        */
        
        return playerHasWon;
    }
}
