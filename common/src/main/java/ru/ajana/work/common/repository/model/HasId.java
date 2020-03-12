package ru.ajana.work.common.repository.model;

public interface HasId<K> {

  /**
   * Возвращает идентификатор.
   *
   * @return идентификатор
   */
  K getId();

  /**
   * Устанавливает идентифкатор.
   *
   * @param id идентификатор
   */
  void setId(K id);
}
