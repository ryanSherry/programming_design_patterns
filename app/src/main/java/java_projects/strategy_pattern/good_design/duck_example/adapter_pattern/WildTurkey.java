package java_projects.strategy_pattern.good_design.duck_example.adapter_pattern;

public class WildTurkey implements Turkey {
  public void gobble() {
    System.out.println("Gobble Gobble");
  }
  public void fly() {
    System.out.println("I'm flying... wait, no I'm not, I'm a turkey");
  }
}
