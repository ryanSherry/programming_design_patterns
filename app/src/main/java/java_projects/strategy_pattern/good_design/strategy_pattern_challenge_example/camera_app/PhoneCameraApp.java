package java_projects.strategy_pattern.good_design.strategy_pattern_challenge_example.camera_app;

import java_projects.strategy_pattern.good_design.strategy_pattern_challenge_example.share_behavior.ShareBehavior;

public abstract class PhoneCameraApp {
  ShareBehavior shareBehavior;
  public abstract void edit();
  public void save() {
    System.out.println("Picture Saved!");
  }
  public void take() {
    System.out.println("Snap! Picture taken!");
  }
  public void share() {
    this.shareBehavior.share();
  }
}
