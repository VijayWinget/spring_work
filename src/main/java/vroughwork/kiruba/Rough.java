/**
 * 
 */
package vroughwork.kiruba;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author igonix
 *
 * 01-Nov-2023
 */
public class Rough {
	
	
	public static String getCurrentTimeWithoutSec() {
        // Get the current time
        LocalTime time = LocalTime.now();

        // Format the time using HH:mm pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // Return formatted time as a string
        return time.format(formatter);
    }

    public static void main(String[] args) {
        String formattedTime = getCurrentTimeWithoutSec();
        System.out.println("Current time without seconds: " + formattedTime);
    }
	

}
