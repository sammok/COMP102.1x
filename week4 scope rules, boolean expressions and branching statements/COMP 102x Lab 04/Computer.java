import comp102x.Canvas;
import comp102x.IO;
import java.util.Random;

/**
 * The Computer class represents the computer in the game
 * It uses a random number generator to make its choice randomly
 */
public class Computer
{
    private Choice choice; //stores the computer's choice
    
    /**
     * Use a random number generator to generate a random choice and then create the corresponding Choice object
     */
    public void makeChoice()
    {
        //  write your code after this line
        Random random = new Random();
        int choiceRandomNumb = random.nextInt(10);
        
        //  convert random number to corresponding choice type 
        //  (random number -> 0 or 1 or 2)
        if (choiceRandomNumb <= 3) 
        {
            choiceRandomNumb = 0;
        } 
        else if (choiceRandomNumb > 3 && choiceRandomNumb <= 6) 
        {
            choiceRandomNumb = 1;
        } 
        else 
        {
            choiceRandomNumb = 2;
        }
        
        //  create choice instance and set choice instance to computer
        Choice choice = new Choice(choiceRandomNumb);
        this.choice = choice;
    }
    
    /**
     * Draw an image that represents the computer's choice on the given canvas
     * 
     * @param   canvas      the canvas to draw on
     */
    public void showChoice(Canvas canvas)
    {
        choice.draw(canvas, 0, 0, 180);
    }
    
    /**
     * Get the choice object that represents the computer's choice
     * 
     * @return  the choice object that represents the computer's choice
     */
    public Choice getChoice()
    {
        return choice;
    }
}
