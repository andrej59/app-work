package ru.ajana.work.spring.jpa;

import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Andrey Kharintsev on 01.04.2018
 */
public class EntityManagerTest1 {

  @Autowired
  private PersistenceContext context;
  public void test() {

  }
}
