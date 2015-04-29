import comp102x.IO;

public class Lab04GradedTask1
{
   // Test case 1 - to test if rock vs paper result in a lose
   // Setup: My choice = Rock (0), oppoent's choice = Paper (1)
   // Expected output: Loses (-1)
   public static void testCase1() {
       
       IO.outputln("Rock vs Paper");
       IO.outputln("Expected: 0");
       
       Choice choice1 = new Choice(0);
       Choice choice2 = new Choice(0);
       int result = choice1.compareWith(choice2);
       
       IO.outputln("Actual: " + result);
   }
   
   // You may wish to create some more to test the program.  
}
