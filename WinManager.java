
/**
 * Write a description of class WinManager here.
 *
 * @author (your name)
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
            if(x+i >= 0)
            {
                if (player == gameBoard.getCell(x+i, y))
                {
                    currentlyInARow++;
                }
            }
        }
        
        //Horizontal Line
        for(int i = 0; i < 4; i++)
        {
            if (player == gameBoard.getCell(x, y+i))
            {
                currentlyInARow++;
            }
        }
        
        //Line going bottom left to top right
        for(int i = -4; i < 4; i++)
        {
            if (player == gameBoard.getCell(x+i, y))
            {
                currentlyInARow++;
            }
        }
        
        //Line going top left to bottom right
        for(int i = 0; i < 4; i++)
        {
            if (player == gameBoard.getCell(x+i, y))
            {
                currentlyInARow++;
            }
        }
        
        if(currentlyInARow >= 4)
        {
            playerHasWon = true;
        }
        return playerHasWon;
    }
}
