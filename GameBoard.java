/**
 * Write a description of class GameBoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameBoard
{
    public int[][] board;
    
    public int boardWidth = 5;
    public int boardHeight = 5;
    
    public void setBoardSize(int tempWidth, int tempHeight)
    {
        boardWidth = tempWidth;
        boardHeight = tempHeight;
    }
    
    public int[][] getBoard(){
        System.out.println("boardWidth :" + boardWidth);
        System.out.println("boardHeight :" + boardHeight);
        for(int i = 0; i < boardWidth; i++)
        {
            for(int x = 0; x < boardHeight; x++)
            {
                board[i][x] = 1;
            }
        }
        return board;
    }
    
    
    
}
