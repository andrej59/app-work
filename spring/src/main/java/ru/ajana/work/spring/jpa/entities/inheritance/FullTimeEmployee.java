package ru.ajana.work.spring.jpa.entities.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Andrey Kharintsev on 01.04.2018
 */
@Entity
@Table(name = "FT_EMP")
@DiscriminatorValue("FT")
@PrimaryKeyJoinColumn(name = "FT_EMPID")
//Inherit empId, but mapped in this class to FT_EMP.FT_EMPID
public class FullTimeEmployee extends EmployeeParent {

  // Defaults to FT_EMP.SALARY
  protected Integer salary;
}
