package java_projects.strategy_pattern.good_design.challenge_example.camera_app;

import java_projects.strategy_pattern.good_design.challenge_example.share_behavior.CameraPlusShareBehavior;
import java_projects.strategy_pattern.good_design.challenge_example.share_behavior.ShareBehavior;

public class CameraPlusApp extends PhoneCameraApp {
  ShareBehavior cameraPlusShareBehavior = new CameraPlusShareBehavior();

  @Override
  public void edit() {
    System.out.println("Edit with those PLUS options!");
  }

  public void share() {
    cameraPlusShareBehavior.share();
  }
  
}
