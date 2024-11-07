// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    
		int numberGiven = Integer.parseInt(args[0]);
		int hundreds = (numberGiven / 100);
		int tens = ((numberGiven / 10) % 10);
		int ones = numberGiven % 10;

		System.out.println(hundreds + " hundreds, " + tens + " tens, " +
							"and " + ones + " ones.");
	}
}
