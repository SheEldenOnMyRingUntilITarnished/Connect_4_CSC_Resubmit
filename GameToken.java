/**
 * Write a description of class GameToken here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameToken
{
    public int tokenType = -1;
    
    public int tokenHeightPosition;
    public int tokenWidthPosition;
    
    public void setTokenType()
    {
        tokenType = 0;
    }
    
    public void setTokenPosition(int tempWidth, int tempHeight)
    {
        tokenWidthPosition = tempWidth;
        tokenHeightPosition = tempHeight;
    }
}
