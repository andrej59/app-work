package ru.ajana.work.common.repository.impl;

import ru.ajana.work.common.repository.AbstractCrudRepository;
import ru.ajana.work.common.repository.UserRepository;
import ru.ajana.work.common.repository.model.UserModel;

public class UserRepositoryImpl extends AbstractCrudRepository<Long, UserModel>
    implements UserRepository {

  @Override
  public UserModel findByName(String name) {
    return null;
  }
}
