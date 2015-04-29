import comp102x.ColorImage;
import comp102x.Canvas;

public class Lab03
{  
    
    public void loadAnImage() 
    {
        // Please write your code after this line
        ColorImage image = new ColorImage();
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        
        //  load image to canvas
        canvas.add(image);
        
        
    }
    
    public void loadTwoImagesOnTheSameCanvas()
    {
        // Please write your code after this line
        ColorImage image1 = new ColorImage();
        ColorImage image2 = new ColorImage();
        Canvas canvas = new Canvas(image1.getWidth() + image2.getWidth(), + image1.getHeight());
        
        // Add two images to canvas
        canvas.add(image1);
        canvas.add(image2, image1.getWidth(), 0);
        
        
    }
    
    public void imageAddition() 
    {    
        // Please write your code after this line
        ColorImage img1 = new ColorImage();
        ColorImage img2 = new ColorImage();
        ColorImage img3 = img1.add(img2);
        
        Canvas canvas = new Canvas(img1.getWidth() + img2.getWidth() + img3.getWidth() + 2*10, img1.getHeight());
        
        //  load three images, they space between 10px each other
        canvas.add(img1);
        canvas.add(img2, img1.getWidth()+10, 0);
        canvas.add(img3, img1.getWidth()+10 + img2.getWidth()+10, 0);
       
    }
   
    public void imageMultiplication() 
    {
        
       // Please write your code after this line
        ColorImage img1 = new ColorImage();
        ColorImage img2 = new ColorImage();
        ColorImage img3 = img1.multiply(img2);
        
        Canvas canvas = new Canvas(img1.getWidth() + img2.getWidth() + img3.getWidth() + 2*10, img1.getHeight());
        
        //  load three images, they space between 10px each other
        canvas.add(img1);
        canvas.add(img2, img1.getWidth()+10, 0);
        canvas.add(img3, img1.getWidth()+10 + img2.getWidth()+10, 0);
        
        
    }
    
    public void changeColor()
    {
        ColorImage image = new ColorImage();
        image.increaseRed(40);
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
        //image.save();
    }
}
