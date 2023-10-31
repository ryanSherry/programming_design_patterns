package java_projects.strategy_pattern.good_design.decorator_pattern_challenge_example;

public class Peppers extends ToppingsDecorator {
  Pizza pizza;

  @Override
  public String getDescription() {
    return pizza.getDescription() + "Peppers, ";
  }

  @Override
  public double cost() {
    return pizza.cost() + 0.50;
  }
  
}
