package ru.ajana.work.spring.jpa.entities;

import javax.persistence.PostPersist;

/**
 * @author Andrey Kharintsev on 01.04.2018
 */
public class AlertMonitor {
  @PostPersist
  public void newAccountAlert(Account acct) {
    //Alerts.sendMarketingInfo(acct.getAccountId(), acct.getBalance());
  }
}
