package java_projects.strategy_pattern.good_design.strategy_pattern_challenge_example.share_behavior;

public class BasicCameraShareBehavior implements ShareBehavior {

  @Override
  public void share() {
    System.out.println("Share by email");
  }
  
}
