/**
 * 
 */
package vroughwork.technical;

/**
 * @author igonix
 *
 * 05-Oct-2023
 */
public class Palindrome {

	/**
	 * @author igonix
	 *
	 * 05-Oct-2023
	 */
	public static void main(String[] args) {
        String input = "racecar"; // Change this to the string you want to check
        
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        input = input.replaceAll("\\s", "").toLowerCase();
        
        int left = 0;             // Starting index from the beginning of the string
        int right = input.length() - 1;  // Starting index from the end of the string
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                // If characters at the current positions don't match, it's not a palindrome
                return false;
            }
            left++;    // Move the left index towards the right
            right--;   // Move the right index towards the left
        }
        
        // If the loop completes without finding any mismatched characters, it's a palindrome
        return true;
    }
}
