package java_projects.strategy_pattern.good_design.decorator_pattern_challenge_example;

public class ThickCrustPizza extends Pizza {

  public ThickCrustPizza() {
    description = "Thick Crust w/ ";
  }

  @Override
  public double cost() {
    return 14.00;
  }
  
}
