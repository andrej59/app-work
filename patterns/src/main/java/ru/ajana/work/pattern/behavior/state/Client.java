package ru.ajana.work.pattern.behavior.state;

/**
 * @author Andrey Kharintsev on 27.01.2019
 */
public class Client {

  public static void main(String[] args) {
    Context context = new Context();
    context.setCurrent(new ConcreteState2());
    context.request();
  }
}
