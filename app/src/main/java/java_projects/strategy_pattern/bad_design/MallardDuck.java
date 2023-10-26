package java_projects.strategy_pattern.bad_design;

public class MallardDuck implements Duck {

  @Override
  public boolean fly() {
    return true;
  }

  @Override
  public boolean swim() {
    return true;
  }

  @Override
  public String quack() {
    return "Quack!";
  }

  @Override
  public boolean display() {
    return true;
  }
  
}
