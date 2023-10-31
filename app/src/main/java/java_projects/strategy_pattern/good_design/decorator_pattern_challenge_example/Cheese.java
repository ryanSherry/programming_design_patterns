package java_projects.strategy_pattern.good_design.decorator_pattern_challenge_example;

public class Cheese extends ToppingsDecorator {
  Pizza pizza;

  public Cheese(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + "cheese, ";
  }

  @Override
  public double cost() {
    return pizza.cost() + 0.75;
  }
  
}
