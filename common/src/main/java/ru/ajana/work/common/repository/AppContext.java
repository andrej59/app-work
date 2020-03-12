package ru.ajana.work.common.repository;

import ru.ajana.work.common.repository.impl.UserRepositoryImpl;
import ru.ajana.work.common.repository.model.UserModel;

public class AppContext {

  public static void main(String[] args) {
    UserRepository userRepository = new UserRepositoryImpl();
    UserModel user = new UserModel();
    userRepository.save(user);
  }
}
