
/**
 * Write a description of class GlobalData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GlobalData
{
    public static GameBoard gameBoard = new GameBoard(7, 6);//Creates The Board
    
    //Allows all of the diffrent scripts to acsess the same Game board
    public static GameBoard currentGameBoard()
    {
        return gameBoard;
    }
}
