/**
 * ColorImage use canvase.
 */
public class ColorImageDemo()
{
    private Canvas canvas = new Canvas();
    private ColorImage image = new ColorImage("images/012.png");
    
    //  Define two constructors for Color image demo
    public ColorImageDemo() 
    {
        canvas.add(images); //  Display ColorImage at (0,0) position
    }
    
    public ColorImageDemo(int xPos, int yPos)
    {
        image = new ColorImage(); //  Create a new image from user file
        canvas.add(images, xPos, yPos); // Display ColorImage at (xPos, yPos) position
    }
    
    /**
     *  Method for setting position to image
     */
    public void setPosition(int xPos, int yPos)
    {
        image.setPosition(xPos, yPos);
    }
}