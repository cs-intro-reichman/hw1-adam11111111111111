// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		int currentValue = Integer.parseInt(args[0]);
		int rate = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[2]);
		int futureValue = (int) (currentValue * Math.pow((1 + (rate / 100.0)), n));
		System.out.println("After " + n + " years, a $" + currentValue +
				" saved at " + rate + ".0% will yield $" + futureValue);
		// After 2 years, a $100 saved at 10.0% will yield $121
	}
}