package ua.kaudeveloper.warehouse.controllers;

import ua.kaudeveloper.warehouse.models.employee.Employee;
import ua.kaudeveloper.warehouse.models.employee.EmployeeDao;
import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired
  private EmployeeDao employeeDao;

  @GetMapping("/employee/get-all")
  public List<Employee> getAllEmployees() {
    return employeeDao.getAllEmployees();
  }

  @PostMapping("/employee/save")
  public Employee save(@RequestBody Employee employee) {
    return employeeDao.save(employee);
  }    

  @GetMapping("/employee/count")
  public Long count() {
    return employeeDao.count();
  }
  @PostMapping("/employee/deleteById")
  public boolean deleteById(@RequestBody int employeeId) {
    return employeeDao.deleteById(employeeId);
  }
  @PostMapping("/employee/findById")
  public Optional<Employee> findById(@RequestBody int employeeId) {
    return employeeDao.findById(employeeId);
  }
  @GetMapping("/employee/deleteAll")
  public void deleteAll() {
     employeeDao.deleteAll();
  }
}