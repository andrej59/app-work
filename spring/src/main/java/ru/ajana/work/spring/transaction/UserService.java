package ru.ajana.work.spring.transaction;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.ajana.work.spring.model.User;

@Service
public class UserService {

  @Transactional(propagation = Propagation.REQUIRES_NEW, timeout = 60)
  void createUser(User user) {}
}
