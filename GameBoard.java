import java.util.List;
import java.util.ArrayList;


/**
 * GameBoard Class
 * Holds the game tokens aswell as contains all data relating to the board
 * 
**/
public class GameBoard
{
    public enum Piece {
        X,
        O
    }
    public Piece getCell(int x, int y) {
        //assert(x >= 0 && x < getColumns()): "x: " + x;
        //assert(y >= 0 && y < getRows()): "y: " + y;
        List<Piece> column = columns.get(x);
    
        if (column.size() > y) {
            return column.get(y);
        } else {
            return null;
        }
    }
    
    public void placeNewPiece(int x, GameBoard.Piece piece){
        columns.get(x).add(piece);
    }
    
    private final List<List<Piece>> columns;
    private final int rows;
    
    public GameBoard(int columns, int rows) {
        this.rows = rows;
        this.columns = new ArrayList<>();

        for (int i = 0; i < columns; ++i) {
            this.columns.add(new ArrayList<>());
        }
    }
    
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns.size();
    }
    
    public int getColumn(int x) {
        List<Piece> tempList = columns.get(x);
        return tempList.size();
    }
}
