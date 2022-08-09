package in.durgesh.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.durgesh.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	
	//@Query("SELECT p FROM Employee p WHERE CONCAT(p.firstName, p.lastName, p.email) LIKE %?1%")
	@Query("SELECT e FROM Employee e WHERE CONCAT(e.firstName, ' ', e.lastName, ' ', e.email, ' ') LIKE %?1%")
	public List<Employee> search(String keyword);

}
