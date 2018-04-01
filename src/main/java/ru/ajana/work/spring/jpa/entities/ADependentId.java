package ru.ajana.work.spring.jpa.entities;

/**
 * @author Andrey Kharintsev on 31.03.2018
 */
public class ADependentId {
  private String name; // matches name of @Id attribute
  private long emp; // matches name of @Id attribute and type of Employee PK

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getEmp() {
    return emp;
  }

  public void setEmp(long emp) {
    this.emp = emp;
  }
}
