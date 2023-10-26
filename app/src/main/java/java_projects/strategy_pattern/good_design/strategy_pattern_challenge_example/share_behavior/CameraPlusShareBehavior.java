package java_projects.strategy_pattern.good_design.challenge_example.share_behavior;

public class CameraPlusShareBehavior implements ShareBehavior {

  @Override
  public void share() {
    System.out.println("Share by email");
    System.out.println("Share by text");
    System.out.println("Share by social media");
  }
  
}
