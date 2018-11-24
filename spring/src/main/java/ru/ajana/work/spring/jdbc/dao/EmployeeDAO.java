package ru.ajana.work.spring.jdbc.dao;

import ru.ajana.work.spring.model.Employee;

/**
 * @author Andrey Kharintsev on 31.03.2018
 */
public interface EmployeeDAO {

  void save(Employee employee);
}
