package java_projects.strategy_pattern.good_design.duck_example.duck;

import java_projects.strategy_pattern.good_design.duck_example.fly_behavior.FlyWithWings;
import java_projects.strategy_pattern.good_design.duck_example.quack_behavior.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck!");
  }
  
}
