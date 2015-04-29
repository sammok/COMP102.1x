import comp102x.IO;

public class Lab04GradedTask3
{
   // Test Case 1 to test if a Computer  will make a random choice between Rock(0), Paper(1) and Scissors(2)
   // Setup: A Computer
   // Expected output: Rock (0), Paper (1) or Scissors (2) showing up randomly
   public static void testCase1() {
       
       IO.outputln("Make random choice");
       IO.outputln("Expected: 0, 1 or 2");
       
       Computer computer = new Computer();
       computer.makeChoice();
       int result = computer.getChoice().getType();
       
       IO.outputln("Actual: " + result);
   }
}
