package ru.ajana.work.spring.jdbc.dao.impl;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.ajana.work.spring.jdbc.dao.EmployeeDAO;
import ru.ajana.work.spring.model.Employee;

/**
 * @author Andrey Kharintsev on 31.03.2018
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

  private DataSource dataSource;

  public DataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }


  @Override
  public void save(Employee employee) {
    String query = "insert into Employee (id, name, role) values (?,?,?)";

    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

    Object[] args = new Object[]{employee.getId(), employee.getName(), employee.getRole()};

    int out = jdbcTemplate.update(query, args);

    if (out != 0) {
      System.out.println("Employee saved with id=" + employee.getId());
    } else {
      System.out.println("Employee save failed with id=" + employee.getId());
    }
  }
}
