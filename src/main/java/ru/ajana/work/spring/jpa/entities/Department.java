package ru.ajana.work.spring.jpa.entities;

import java.util.Collection;
import java.util.HashSet;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Bidirectional ManyToOne Relationships
 *
 * @author Andrey Kharintsev on 31.03.2018
 */
@Entity
public class Department {

  @Id
  private long id;

  private Collection<Employee> employees = new HashSet();


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @OneToMany(mappedBy = "department")
  public Collection<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(Collection<Employee> employees) {
    this.employees = employees;
  }
}
