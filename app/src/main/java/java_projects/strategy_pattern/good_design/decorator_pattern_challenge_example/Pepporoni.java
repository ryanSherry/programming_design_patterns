package java_projects.strategy_pattern.good_design.decorator_pattern_challenge_example;

public class Pepporoni extends ToppingsDecorator {
  public Pizza pizza;

  public Pepporoni(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + "Pepporoni, ";
  }

  @Override
  public double cost() {
    return pizza.cost() + 1.00;
  }
  
}
