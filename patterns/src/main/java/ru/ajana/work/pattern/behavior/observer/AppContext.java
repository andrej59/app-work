package ru.ajana.work.pattern.behavior.observer;

/**
 * Контекст приложения.
 *
 * @author Andrey Kharintsev on 10.01.2019
 */
public class AppContext {

  public static void main(String[] args) {
    Subject subject = new ConcreteSubject();
    ObServer obServer = new ConcreteObserver();
    subject.attach(obServer); // подписываем наблюдателя
    ((ConcreteSubject) subject).setSubjectState(1); // меняем статус субъекта
  }
}
