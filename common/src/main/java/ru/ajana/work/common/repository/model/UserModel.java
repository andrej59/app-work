package ru.ajana.work.common.repository.model;

public class UserModel implements HasId<Long> {

  private Long id;
  private String name;

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
