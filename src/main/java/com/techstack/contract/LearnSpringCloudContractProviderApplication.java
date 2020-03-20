package com.techstack.contract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class LearnSpringCloudContractProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringCloudContractProviderApplication.class, args);
	}

}

@RestController
class EmployeeController {

	@GetMapping("/employees")
	public ResponseEntity<List<String>> getEmployees() {
		return ResponseEntity.status(HttpStatus.OK).body(List.of("pascal", "thomas"));
	}
}
