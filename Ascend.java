// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		double range = Double.parseDouble(args[0]);
		int a = (int)(range * Math.random());
		int b = (int)(range * Math.random());
		int c = (int)(range * Math.random());

		int minValue = Math.min(Math.min(a, b) , c);
		int maxValue = Math.max(Math.max(a, b) , c);
		int middleValue = Math.max(Math.min(a, b) , c);

		System.out.println(minValue + " " + middleValue + " " + maxValue);
	}
}
