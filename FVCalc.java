// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// convert inputted command-lines into integer and double data types.
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int yearsNum = Integer.parseInt(args[2]);
		// divide rate by 100 to make it a percentage
		rate = (rate / 100);
		// calculating the future value with the Math calculation given in the exercise
		double futureValue = (currentValue) * (Math.pow((1 + rate), (double)(yearsNum)));

		System.err.println("After " + yearsNum + " years, $" + currentValue + " saved at " +
							(rate * 100) +"% will yeald $" + (int)futureValue);

	}
}