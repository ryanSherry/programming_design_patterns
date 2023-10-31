package java_projects.strategy_pattern.good_design.decorator_pattern_challenge_example;

public class ThinCrustPizza extends Pizza {

  public ThinCrustPizza() {
    description = "Thin Crust w/ ";
  }

  @Override
  public double cost() {
    return 12.00;
  }
  
}
