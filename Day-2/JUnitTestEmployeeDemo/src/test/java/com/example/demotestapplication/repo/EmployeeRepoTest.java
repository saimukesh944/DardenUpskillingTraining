package com.example.demotestapplication.repo;

import  static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demotestapplication.entity.Employee;

@DataJpaTest
public class EmployeeRepoTest {
	
	
	@Autowired
	private EmployeeRepository employeerepo;
	
	
	@Test
	public void employeeSave() {
		
		Employee employee=Employee.builder()
				.id(1)
				.firstname("sai")
				.lastname("mukesh")
				.role("analyst")
				.build();
		employeerepo.save(employee);
		assertThat(employee).isNotNull();
		assertThat(employee.getId()).isGreaterThan(0);

		
	}
	
	@Test
   public void getAllTest() {
		Employee employee=Employee.builder()
				.id(1)
				.firstname("sai")
				.lastname("mukesh")
				.role("analyst")
				.build();
		Employee employees=Employee.builder()
				.id(2)
				.firstname("sai")
				.lastname("mukesh")
				.role("analyst")
				.build();
		
		List<Employee> employeelist=employeerepo.findAll();
		assertThat(employeelist).isNotNull();
		
	}
	
	@Test
	public void getById() {
		
		Employee employee=Employee.builder()
				.id(1)
				.firstname("sai")
				.lastname("mukesh")
				.role("analyst")
				.build();
		
		employeerepo.save(employee);
		Employee employeedb=employeerepo.findById(employee.getId()).get();
		assertThat(employeedb).isNotNull();
		
		
	}
	
	@Test
	public void UpdateTest() {
		Employee employee=Employee.builder()
				.id(1)
				.firstname("sai")
				.lastname("mukesh")
				.role("analyst")
				.build();
		
		employeerepo.save(employee);
		Employee savedemployee=employeerepo.findById(employee.getId()).get();
		savedemployee.setRole("sr Analyst");
		Employee updatedEmployee=employeerepo.save(savedemployee);
		assertThat(updatedEmployee.getRole()).isEqualTo("sr Analyst");
		
	}
	
	@Test
	public void deleteTest() {
		Employee employee=Employee.builder()
				.id(1)
				.firstname("sai")
				.lastname("mukesh")
				.role("analyst")
				.build();
		
		employeerepo.save(employee);
		employeerepo.delete(employee);
		
		Optional<Employee> deleteemployee=employeerepo.findById(employee.getId());
		assertThat(deleteemployee).isEmpty();
		
		
		
		
	}

}
