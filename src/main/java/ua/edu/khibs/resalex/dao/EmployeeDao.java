package ua.edu.khibs.resalex.dao;

import ua.edu.khibs.resalex.model.Employee;

import java.util.List;

public interface EmployeeDao {


    void save (Employee employee);

    Employee load (Long id);

    List<Employee> findAll ();

    void remove (Employee employee);

}
