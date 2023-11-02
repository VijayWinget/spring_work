/**
 * 
 */
package vroughwork.main;

import java.util.Random;



/**
 * @author igonix
 *
 * 06-Oct-2023
 */
public class RegNoGenrator {

	public static void main(String[] args) {
        // Create a Random object
        for (int i = 0; i <= 10; i++) {
        	 int random4DigitNumber = generateNo();
        	 System.out.println("PYTZ" + random4DigitNumber);
		}
    }

	public static int generateNo() {
		Random random = new Random();
        // Generate a random 4-digit number
        int random4DigitNumber = random.nextInt(9000) + 1000;
		return random4DigitNumber;
	}
	
}
