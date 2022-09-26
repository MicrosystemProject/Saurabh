package code.microsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.microsystem.entity.Employee;
import code.microsystem.exception.ResourceNotFoundException;
import code.microsystem.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepositroy;

	@Override
	public Employee addNewEMp(Employee employee) {

		return employeeRepositroy.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {

		return employeeRepositroy.findAll();
	}

	@Override
	public Optional<Employee> findById(int id) {

		return employeeRepositroy.findById(id);
	}

	@Override
	public Optional<Employee> findByName(String name) {

		return employeeRepositroy.findByName(name);
	}

	@Override
	public Optional<Employee> findByEmail(String femail) {

		return employeeRepositroy.findByEmail(femail);
	}

	@Override
	public Optional<Employee> findByEmailAndName(String femail, String name) {

		return employeeRepositroy.findByEmailAndName(femail, name);
	}

	@Override
	public Employee editEmp(int id, Employee employee) {
		Employee emp = employeeRepositroy.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee doenot exits" + id));
		emp.setId(id);
		emp.setFname(employee.getFname());
		emp.setEmail(employee.getEmail());
		emp.setPassword(employee.getPassword());

		return employeeRepositroy.save(emp);
	}

	@Override
	public void deleteEmp(Employee emp) {
		employeeRepositroy.delete(emp);
	}

}
