/**
 * 
 */
package vroughwork.builder;

import lombok.Builder;
import lombok.Data;

/**
 * @author igonix
 *
 *         31-Oct-2023
 */
@Data
@Builder
public class Person {
	private String name;
	private Integer age;
	private String address;
	private String phoneNumber;

}
