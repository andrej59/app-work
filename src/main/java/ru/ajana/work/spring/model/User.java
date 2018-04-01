package ru.ajana.work.spring.model;

import org.springframework.stereotype.Component;

/**
 * @author Andrey Kharintsev on 29.03.2018
 */
@Component
public class User {

  private String name;
  private String password;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
