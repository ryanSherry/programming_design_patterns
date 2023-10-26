package java_projects.strategy_pattern.good_design.duck_example.quack_behavior;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack Quack Quack!");
  }

}
