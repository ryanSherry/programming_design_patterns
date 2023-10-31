package java_projects.strategy_pattern.good_design.decorator_pattern_challenge_example;

public abstract class Pizza {
  String description = "Unknown Pizza";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
