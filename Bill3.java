// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
	    String name2 = args[1];
		String name3 = args[2];
		// converting string command-lines arguments into double data type
		double bill = Double.parseDouble(args[3]);
		// splits the bill to three and rounds it up using Math.ceil function.
		double roundedBill = Math.ceil((bill / 3));

		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 +
							": pay " + roundedBill + " Shekels each");
							
	}
}
