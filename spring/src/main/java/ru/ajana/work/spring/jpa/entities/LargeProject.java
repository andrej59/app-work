package ru.ajana.work.spring.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

/**
 * @author Andrey Kharintsev on 01.04.2018
 */
@Entity
public class LargeProject extends Project {
  @OneToOne(fetch= FetchType.LAZY)
  private Employee approver;

  public Employee getApprover() {
    return approver;
  }

  public void setApprover(Employee approver) {
    this.approver = approver;
  }
}
