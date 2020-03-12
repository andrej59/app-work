package ru.ajana.work.common.repository;

import ru.ajana.work.common.repository.model.HasId;

public abstract class AbstractCrudRepository<K, T extends HasId> implements CrudRepository<K, T> {

  @Override
  public T find(K id) {
    return null;
  }

  @Override
  public T save(T entity) {
    return entity;
  }

  @Override
  public void delete(T entity) {
    return;
  }
}
