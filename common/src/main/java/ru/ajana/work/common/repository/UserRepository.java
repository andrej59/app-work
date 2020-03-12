package ru.ajana.work.common.repository;

import ru.ajana.work.common.repository.model.UserModel;

public interface UserRepository extends CrudRepository<Long, UserModel> {
  UserModel findByName(String name);
}
