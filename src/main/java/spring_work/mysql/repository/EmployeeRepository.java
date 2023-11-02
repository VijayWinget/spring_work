/**
 * 
 */
package spring_work.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring_work.mysql.entity.Employee;

/**
 * @author igonix
 *
 * 01-Nov-2023
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
