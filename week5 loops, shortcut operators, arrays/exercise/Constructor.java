
/**
 * Write a description of class Constructor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Constructor
{
    private double x;
    
    public Constructor (double d, double d2)
    {
        x = d - d2;
    }

    public static void main(String[] args) 
    {
        //  In this case Constructor(int i, int i2) will be used, and console will print 0.
        //  Because when Class is instanciating ,Java can automaticlly convert parameter of type int to double type
        //  then match the suitable constroctor to create instance.
        //  If Java still cant match the suitable constroctor, It will through an error
        Constructor x = new Constructor(1.0, 1);
        System.out.println(x.x);
    }
}
