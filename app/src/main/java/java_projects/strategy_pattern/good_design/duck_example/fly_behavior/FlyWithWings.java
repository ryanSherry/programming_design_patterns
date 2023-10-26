package java_projects.strategy_pattern.good_design.duck_example.fly_behavior;

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I can fly!!!");
  }

}
