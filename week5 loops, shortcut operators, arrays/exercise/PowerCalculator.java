
/**
 * Write a description of class PowerCalculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerCalculator
{   
    public void powerN (int number) 
    {
        int t = 1;
        int counter = 1;
        //  two steps above for initia 0!
        
        //  while loop start from 1!
        while (counter <= number) {
            t *= counter;
            counter += 1;
        }
        
        System.out.println(t);
    }
}
