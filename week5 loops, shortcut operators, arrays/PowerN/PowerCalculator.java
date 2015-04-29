
public class PowerCalculator
{
    /**
     * Calculate the non-negative power of an integer number. If a negative power is input, the method returns 1.
     * 
     * @param number The number to take power.
     * @param power The power factor to be taken to.
     * @return The calculation result after taking power of the integer number.
     */
    public static long powerN(int number, int power) {
        
        // write your code after this line
        int result = 1;
        int counter = 1;
        //  two steps above for init n^0
        
        //  while loop start from n^1
        while (counter <= power) 
        {
            result = result * number;
            counter += 1;
        }
        
        System.out.println(result);
        return result; // remove this line after completing your code
    }
}
