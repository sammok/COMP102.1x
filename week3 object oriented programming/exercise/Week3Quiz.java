import comp102x.IO;

/**
 * Write a description of class Week3Quiz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Week3Quiz
{
    // instance variables - replace the example below with your own
    private double x;

    public Week3Quiz(int i, double d)
    {
        x = i + d;
    }
    
    public Week3Quiz(double i, int d)
    {
        x = i - d;
    }
    
    public static void main(String[] args)
    {
        Week3Quiz q1 = new Week3Quiz(10.0, 10);
        Week3Quiz q2 = new Week3Quiz(10, 10);
        
        IO.outputln(q1.x);
        //IO.outputln(q2.x);
    }
}
