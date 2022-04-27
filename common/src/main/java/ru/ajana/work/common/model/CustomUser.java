package ru.ajana.work.common.model;

import java.time.LocalDateTime;

public class CustomUser {
  private Integer id;
  private String name;
  private LocalDateTime created;

  public CustomUser(Integer id, String name, LocalDateTime created) {
    this.id = id;
    this.name = name;
    this.created = created;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }
}
