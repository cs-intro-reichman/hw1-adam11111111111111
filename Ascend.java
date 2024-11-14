// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);
		int min, mid, max, temp;
		System.out.println(a + " " + b + " " + c);
		temp = Math.min(a, b);
		min = Math.min(temp, c);
		temp = Math.max(a, b);
		max = Math.max(temp, c);
		mid = (a + b + c) - (max + min);
		System.out.println(min + " " + mid + " " + max);

	}
}
