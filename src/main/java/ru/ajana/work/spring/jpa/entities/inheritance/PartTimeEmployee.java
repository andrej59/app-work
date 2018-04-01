package ru.ajana.work.spring.jpa.entities.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Andrey Kharintsev on 01.04.2018
 */
@Entity
@Table(name = "PT_EMP")
@DiscriminatorValue("PT")
// PK column is PT_EMP.EMPID due to PrimaryKeyJoinColumn default
public class PartTimeEmployee extends EmployeeParent {

  protected Float hourlyWage;
}
