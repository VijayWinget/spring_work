/**
 * 
 */
package vroughwork.technical;

/**
 * @author igonix
 *
 * 05-Oct-2023
 */
public class ReverseString {
	 public static void main(String[] args) {
	        String original = "vijay";
	        
	        // Convert the string to a StringBuilder
	        StringBuilder reversed = new StringBuilder(original);
	        // Use the reverse() method to reverse the string
	        reversed.reverse();
	        // Convert the StringBuilder back to a string
//	        String reversedString = reversed.toString();
	        String reversedString = reverseString(original);
	        
	        // Print the reversed string
	        System.out.println("Reversed string: " + reversedString+"\n\n\n");
	        
	        
	        
//	        StringBuilder sb = new StringBuilder();
//	        sb.append("Hello, "); // Append a string
//	        sb.append("world!");
//	        String result = sb.toString(); // Convert StringBuilder to a String
//	        System.out.println(result);
	        
	        
	        
	    }
	 
	 public static String reverseString(String input) {
	        int length = input.length();
	        StringBuilder reversed = new StringBuilder();
	        String name ="";
	        
	        for (int i = length - 1; i >= 0; i--) {
//	            reversed.append(input.charAt(i));
	        	name=name+input.charAt(i);
	        }
	        
//	        return reversed.toString();
	        return name;
	    }

}
