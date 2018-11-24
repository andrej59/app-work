package ru.ajana.work.spring.jpa.entities;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;

/**
 * @author Andrey Kharintsev on 31.03.2018
 */
@Entity
@Inheritance
public class Project {

  @Id
  private long id;
  // bi - directional ManyToMany Relationships
  @ManyToMany
  private Collection<Employee> employees;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Collection<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(Collection<Employee> employees) {
    this.employees = employees;
  }
}
