package ru.ajana.work.spring.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

/**
 * @author Andrey Kharintsev on 31.03.2018
 */
@Entity
@IdClass(ADependentId.class)
public class ADependent {

  @Id
  private String name;

  @Id
  @ManyToOne
  private Employee emp;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employee getEmp() {
    return emp;
  }

  public void setEmp(Employee emp) {
    this.emp = emp;
  }
}
