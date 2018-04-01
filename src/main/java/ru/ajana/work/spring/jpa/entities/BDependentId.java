package ru.ajana.work.spring.jpa.entities;

import javax.persistence.Embeddable;

/**
 * @author Andrey Kharintsev on 31.03.2018
 */
@Embeddable
public class BDependentId {

  private String name;
  private long empPK; // corresponds to PK type of Employee

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getEmpPK() {
    return empPK;
  }

  public void setEmpPK(long empPK) {
    this.empPK = empPK;
  }
}
