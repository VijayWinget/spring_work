/**
 * 
 */
package spring_work.mysql.entity;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "users")
// named query example mapping
@NamedNativeQuery(name = "User.getAllUsers",
query = "SELECT id , first_name as firstName ,last_name as lastName ,birth_date as birthDate ,department  from users",
resultSetMapping = "Mapping.EmpolyeeMap")

@SqlResultSetMapping(name = "Mapping.EmpolyeeMap",
classes = @ConstructorResult(targetClass = Employee.class,
columns = {
		@ColumnResult(name = "id",type=Integer.class),
		@ColumnResult(name = "firstName",type=String.class),
		@ColumnResult(name = "lastName",type=String.class),
		@ColumnResult(name = "birthDate",type=String.class),
		@ColumnResult(name = "department",type=String.class),
}))

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "birth_date")
//	@Temporal(TemporalType.TIMESTAMP)
	private String birthDate;

	@Column(name = "department")
	private String department;

}
