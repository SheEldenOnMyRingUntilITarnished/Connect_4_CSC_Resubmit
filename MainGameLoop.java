
/**
 * Write a description of class MainGameLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainGameLoop
{
    public static GameBoard gameBoard = new GameBoard();
    public static int[][] board = gameBoard.getBoard();
    public static void main()
    {
        setUp();
        System.out.println("Start");
        for(int i = 0; i < gameBoard.boardWidth; i++)
        {
            for(int x = 0; x < gameBoard.boardHeight; x++)
            {
                System.out.print(board[i][x]);
            }
            System.out.println("");
        }
        System.out.println("Finish");
        
    }
    public static void setUp()
    {
        gameBoard.setBoardSize(10,10);
    }
}
