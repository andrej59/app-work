package ru.ajana.work.spring.jpa.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

/**
 * @author Andrey Kharintsev on 31.03.2018
 */
@Entity
public class BDependent {

  @EmbeddedId
  private BDependentId id;
  // id attribute mapped by join column default
  @MapsId("empPK") // maps empPK attribute of embedded id
  @ManyToOne
  private Employee emp;
}
