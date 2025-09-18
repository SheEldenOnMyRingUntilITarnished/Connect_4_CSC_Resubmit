
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
        
        //Vertical Line
        System.out.println("Vertical Line");
        for(int i = -4; i < 4; i++)
        {
            System.out.println("Cell: " + (x+i) + "/" + y + "!");
            if(x+i >= 0 && x+i <= gameBoard.getRows())
            {
                if (player == gameBoard.getCell(x+i, y))
                {
                    currentlyInARow++;
                    System.out.println("In a row: " + currentlyInARow);
                    if(currentlyInARow >= 4)
                    {
                        System.out.println("Player: " + player + " Has won");
                        playerHasWon = true;
                        return playerHasWon;
                    }
                }else
                {
                    currentlyInARow = 0;
                }
            }
        }
        currentlyInARow = 0;
        
        //Horizontal Line
        System.out.println("Horizontal Line");
        for(int i = -4; i < 4; i++)
        {
            //System.out.println("Cell: " + x + "/" + (y+i) + "!");
            if(y+i >= 0 && y+i <= gameBoard.getColumns())
            {
                if (player == gameBoard.getCell(x, y+i))
                {
                    currentlyInARow++;
                    //System.out.println("In a row: " + currentlyInARow);
                    if(currentlyInARow >= 4)
                    {
                        System.out.println("Player: " + player + " Has won");
                        playerHasWon = true;
                        return playerHasWon;
                    }
                }else
                {
                    currentlyInARow = 0;
                }
            }
        }
        currentlyInARow = 0;
        
        //Line going bottom left to top right
        System.out.println("Top right to Bottom Left (" + gameBoard.getRows() + ")");
        
        for(int i = -4; i < 4; i++)
        {
            //System.out.println("Cell: " + (x+i) + "/" + (y-i) + "!");
            if(x+i >= 0 && x+i <= gameBoard.getRows() && y-i >= 0 && y-i <= gameBoard.getRows())
            {
                if (player == gameBoard.getCell(x+i, y-i))
                {
                    currentlyInARow++;
                    //System.out.println("In a row: " + currentlyInARow);
                    if(currentlyInARow >= 4)
                    {
                        System.out.println("Player: " + player + " Has won");
                        playerHasWon = true;
                        return playerHasWon;
                    }
                }else
                {
                    //System.out.println("Looked at: " + gameBoard.getCell(x+i, y-i));
                    currentlyInARow = 0;
                }
            }else
            {
                //System.out.println("FAIL");
            }
        }
        currentlyInARow = 0;
        
        //Line going top left to bottom right
        System.out.println("Top left to bottom right");
        for(int i = -4; i < 4; i++)
        {
            //System.out.println("Cell: " + (x+i) + "/" + (y+i) + "!");
            if(x+i >= 0 && x+i <= gameBoard.getRows() && y+i >= 0 && y+i <= gameBoard.getRows())
            {
                if (player == gameBoard.getCell(x+i, y+i))
                {
                    currentlyInARow++;
                    //System.out.println("In a row: " + currentlyInARow);
                    if(currentlyInARow >= 4)
                    {
                        System.out.println("Player: " + player + " Has won");
                        playerHasWon = true;
                        return playerHasWon;
                    }
                }else
                {
                    currentlyInARow = 0;
                }
            }
        }
        
        
        return playerHasWon;//Sends back a fail if the player loses
    }
}
