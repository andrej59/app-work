package ru.ajana.work.spring.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Unidirectional OneToOne Relationships
 *
 * @author Andrey Kharintsev on 31.03.2018
 */
@Entity
public class TravelProfile {

  @Id
  private long id;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
