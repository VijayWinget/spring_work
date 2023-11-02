/**
 * 
 */
package vroughwork.builder;

/**
 * @author igonix
 *
 *         31-Oct-2023
 */
public class Main {

	/**
	 * @author igonix
	 *
	 *         31-Oct-2023
	 */
	public static void main(String[] args) {

		Person person = Person.builder().address("Test Address").age(90).name("Vijay").build();
		person.setName("account List");

		System.out.println(person.getName());

	}

}
