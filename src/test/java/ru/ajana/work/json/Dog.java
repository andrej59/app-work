package ru.ajana.work.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Andrey Kharintsev on 30.03.2018
 */
public class Dog {
  private String name;
  private int age;
  private boolean bitable;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isBitable() {
    return bitable;
  }

  public void setBitable(boolean bitable) {
    this.bitable = bitable;
  }
}
