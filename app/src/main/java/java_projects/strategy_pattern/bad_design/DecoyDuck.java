package java_projects.strategy_pattern.bad_design;

public class DecoyDuck implements Duck{

  @Override
  public boolean fly() {
    return false;
  }

  @Override
  public boolean swim() {
    return false;
  }

  @Override
  public String quack() {
    return "silence...";
  }

  @Override
  public boolean display() {
    return true;
  }
  
}
