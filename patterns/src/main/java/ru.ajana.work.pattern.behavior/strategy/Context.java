package ru.ajana.work.pattern.behavior.strategy;

/**
 * Контекст приложения.
 */
public class Context {

  private Strategy strategy;

  public Context() {
    strategy = applyStrategyA();
  }

  public Strategy applyStrategyA() {
    strategy = new ConcreteStrategyA();
    return strategy;
  }

  public Strategy applyStrategyB() {
    strategy = new ConcreteStrategyB();
    return strategy;
  }

  public void changeStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public String make(String input) {
    return strategy.execute(input);
  }

  public static void main(String[] args) {

    Context context = new Context();
    String input = "input data";
    // Default
    System.out.println(context.make(input));
    context.applyStrategyA();
    System.out.println(context.make(input));
    context.applyStrategyB();
    System.out.println(context.make(input));
    context.changeStrategy(new CustomStrategy());
    System.out.println(context.make(input));
  }
}
