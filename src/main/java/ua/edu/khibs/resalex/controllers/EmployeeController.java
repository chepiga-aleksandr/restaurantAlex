package ua.edu.khibs.resalex.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.edu.khibs.resalex.model.Employee;
import ua.edu.khibs.resalex.dao.EmployeeDao;
import ua.edu.khibs.resalex.model.Position;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeController {
    private EmployeeDao employeeDao;

    @Transactional
    public void createEmployee() {

        Set<Employee> allEmployees = new HashSet<>(employeeDao.findAll());

        Employee employee = new Employee();

        employee.setName("John");
        employee.setSurname("Smith");
        employee.setPosition(Position.WAITER);
        employee.setSalary(200000.0F);

        if (!allEmployees.contains(employee)) {
            employeeDao.save(employee);
        }
    }

    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}

