package java_projects.strategy_pattern.good_design.duck_example.duck;

import java_projects.strategy_pattern.good_design.duck_example.fly_behavior.FlyBehavior;
import java_projects.strategy_pattern.good_design.duck_example.quack_behavior.QuackBehavior;

public abstract class Duck {
  public FlyBehavior flyBehavior;
  public QuackBehavior quackBehavior;

  public Duck() {}

  public abstract void display();

  public void performFlight() {
    flyBehavior.fly();
  }
  public void performQuack() {
    quackBehavior.quack();
  }
  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}
