import comp102x.IO;
import comp102x.Canvas; 

/**
 * The Player class represents the human player in the game
 * It asks for the player's choice on the text terminal
 */
public class Player
{
    private Choice choice; //stores the player's choice
    
    /**
     * Ask the player for the choice and then create the corresponding Choice object
     */
    public void makeChoice()
    {
        IO.outputln("Please input your choice (0=rock, 1=paper, 2=scissors)");
        int type = IO.inputInteger(); 
        choice = new Choice(type);
    }
    
    /**
     * Draw an image that represents the player's choice on the given canvas
     * 
     * @param   canvas      the canvas to draw on
     */
    public void showChoice(Canvas canvas)
    {
        choice.draw(canvas, 0, 480, 0);
    }
    
    /**
     * Get the choice object that represents the player's choice
     * 
     * @return  the choice object that represents the player's choice
     */
    public Choice getChoice()
    {
        return choice;
    }
}
