
/**
 * Write a description of class GlobalData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GlobalData
{
    public static GameBoard gameBoard = new GameBoard(7, 6);//Creates The Board
    public static GameBoard currentGameBoard()
    {
        return gameBoard;
    }
}
