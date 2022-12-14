package code.microsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import code.microsystem.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	@Query("from Employee e where e.fname=:name")
	Optional<Employee> findByName(String name);
	
	
	@Query("from Employee e where e.email=:femail")
	Optional<Employee> findByEmail(String femail);
	
	@Query("from Employee e where e.email=:femail and e.fname=:name")
	Optional<Employee> findByEmailAndName(String femail,String name);

}
