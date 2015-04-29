
/**
 * Write a description of class Compile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Compile
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Compile
     */
    public Compile()
    {
        // initialise instance variables
        x = 0;
    }

    
    public static void compare (int x1, int y2, int z3){
        int x = x1;
        int y = y2;
        int z = z3;
        
        if (z<y)
            if(x>y)
                x = 10;
            else
                x = 3;
            
        System.out.println(x + ":" + x1 + "," + y2 + "," + z3);
    }
    
    public static void main(String[] args)
    {
        
        compare(8, 4, 2);
        compare(2, 4, 8);
        compare(2, 8, 4);
    }
}
