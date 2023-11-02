/**
 * 
 */
package vroughwork.technical;

/**
 * @author igonix
 *
 *         05-Oct-2023
 */
public class FibonacciSeries {

	/**
	 * @author igonix
	 *
	 *         05-Oct-2023
	 */
	public static void main(String[] args) {

		int n = 10; // Change this to the number of Fibonacci numbers you want to generate

		// First two numbers in the series
		int first = 0;
		int second = 1;

		System.out.print("Fibonacci Series of " + n + " numbers: ");

		// Loop to generate the Fibonacci series
		for (int i = 0; i < n; i++) {
			System.out.print(first + " ");

			// Calculate the next number in the series by adding the last two
			int next = first + second;
			first = second;
			second = next;
		}

	}

}
