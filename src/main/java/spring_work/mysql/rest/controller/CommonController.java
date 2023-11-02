/**
 * 
 */
package spring_work.mysql.rest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import spring_work.mysql.entity.Employee;
import spring_work.mysql.repository.UserRepository;
//http://localhost:8000/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/
/**
 * @author igonix
 *
 *         01-Nov-2023
 */

@Tag(name = "Common", description = "Common functions")
@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*")
@Slf4j
public class CommonController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/getAllEmpolyees")
	public List<Employee> getAllEmpolyees() {
		log.info("getAllEmpolyees  receved");
		return userRepository.getAllUsers();
	}

	
	@Operation(summary = "check")
	@Parameter(name = "Authorization", in = ParameterIn.HEADER, description = "Enter the token with the `Bearer: ` prefix , e.g. Bearer abcde12345", schema = @Schema(type = "string", example = "Bearer YourToken"))
	@PostMapping("/check")
    public ResponseEntity<String> check() {
        String responseMessage = "This is the response from the /check endpoint.";
        return ResponseEntity.ok(responseMessage);
    }

	
}
