/**
 * 
 */
package spring_work.mysql.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author igonix
 *
 *         01-Nov-2023
 */
@Entity
@Table(name = "employees")
@Getter
@Setter
@EqualsAndHashCode // this allows to bind values for result mapping at user entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "birth_date")
	private String birthDate;

	@Column(name = "department")
	private String department;

	public Employee(Integer id, String firstName, String lastName, String birthDate, String department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.department = department;
	}

}
