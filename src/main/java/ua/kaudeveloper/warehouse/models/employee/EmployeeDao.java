package ua.kaudeveloper.warehouse.models.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeDao {

    @Autowired
    private EmployeeRepository repository;

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(employees::add);
        return employees;
    }

    public boolean deleteById(int employeeId) {
        repository.deleteById(employeeId);
        return repository.existsById(employeeId);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public Optional<Employee> findById(int employeeId) {
        return repository.findById(employeeId);
    }

    public Long count() {
        return repository.count();
    }
}