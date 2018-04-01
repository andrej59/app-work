package ru.ajana.work.spring.jpa.entities.inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import ru.ajana.work.spring.jpa.entities.Address;

/**
 * @author Andrey Kharintsev on 01.04.2018
 */
@Entity
@Table(name = "EMP")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
public abstract class EmployeeParent {

  @Id
  protected Integer empId;
  @Version
  protected Integer version;
  @ManyToOne
  protected Address address;

  public Integer getEmpId() {
    return empId;
  }

  public void setEmpId(Integer empId) {
    this.empId = empId;
  }

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
