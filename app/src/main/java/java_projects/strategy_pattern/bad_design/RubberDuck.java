package java_projects.strategy_pattern.bad_design;

public class RubberDuck implements Duck {

  @Override
  public boolean fly() {
    return false;
  }

  @Override
  public boolean swim() {
    return true;
  }

  @Override
  public String quack() {
    return "Squeek!";
  }

  @Override
  public boolean display() {
    return true;
  }
  
}
