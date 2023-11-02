/**
 * 
 */
package spring_work.mysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring_work.mysql.entity.Employee;
import spring_work.mysql.entity.User;

/**
 * @author igonix
 *
 * 01-Nov-2023
 */
public interface UserRepository extends JpaRepository<User, Integer> {

	/**
	 * @author igonix
	 *
	 * 01-Nov-2023
	 */
	List<Employee> getAllUsers();

}
