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

		int maxAb = Math.max(a, b);
		int maxAc = Math.max(a, c);
		int maxBc = Math.max(b, c);
		// finds the middle value using Math library functions only
		int middleValue = Math.min((Math.min(maxAb, maxAc)), maxBc);

		System.out.println(minValue + " " + middleValue + " " + maxValue);
	}
}
