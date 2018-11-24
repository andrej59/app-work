package ru.ajana.work.spring.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.Transient;
import javax.security.auth.login.AccountException;

/**
 * @author Andrey Kharintsev on 01.04.2018
 */
@Entity
@EntityListeners(AlertMonitor.class)
public class Account {

  @Id
  private  Long id;
  private Integer balance;
  private boolean preferred;


  public Long getAccountId() {
    return id;
  }


  public Integer getBalance() {
    return balance;
  }


  @Transient // because status depends upon non-persistent context
  public boolean isPreferred() {
    return preferred;
  }


  public void deposit(Integer amount) {

  }

  public Integer withdraw(Integer amount) throws Exception {
    return 10 * amount;
  }

  @PrePersist
  protected void validateCreate() throws AccountException {
    if (getBalance() < 100) {
      throw new AccountException("Insufficient balance to open an account");
    }
  }

  @PostLoad
  protected void adjustPreferredStatus() {
    preferred =
        (getBalance() >= 3);
  }
}
