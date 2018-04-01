package ru.ajana.work.spring.jpa.entities;

import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToOne;
import ru.ajana.work.spring.jpa.convet.BooleanToIntegerConverter;

/**
 * @author Andrey Kharintsev on 31.03.2018
 */
@NamedEntityGraph(

    attributeNodes = { @NamedAttributeNode("projects")}
)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {

  @Id
  private long empId;
  @Basic
  private String empName;

  @ManyToOne
  private Department department;
  @OneToOne
  private TravelProfile profile;

  // bi - directional ManyToMany Relationships
  @ManyToMany(mappedBy = "employees")
  private Collection<Project> projects;

  //  unidirectional OneToOne Relationships
  @ManyToOne
  private Address address;

  //@Convert(converter = BooleanToIntegerConverter.class)
  private boolean fullTime;


  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public long getEmpId() {
    return empId;
  }

  public void setEmpId(long empId) {
    this.empId = empId;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public TravelProfile getProfile() {
    return profile;
  }

  public void setProfile(TravelProfile profile) {
    this.profile = profile;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public boolean isFullTime() {
    return fullTime;
  }

  public void setFullTime(boolean fullTime) {
    this.fullTime = fullTime;
  }
}
