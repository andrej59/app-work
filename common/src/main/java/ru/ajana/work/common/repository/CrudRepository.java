package ru.ajana.work.common.repository;

public interface CrudRepository<K, T> {

  T find(K id);

  T save(T entity);

  void delete(T entity);
}
