package java_projects.strategy_pattern.good_design.strategy_pattern_challenge_example.camera_app;

import java_projects.strategy_pattern.good_design.strategy_pattern_challenge_example.share_behavior.BasicCameraShareBehavior;
import java_projects.strategy_pattern.good_design.strategy_pattern_challenge_example.share_behavior.ShareBehavior;

public class BasicCameraApp extends PhoneCameraApp {

  ShareBehavior basicCameraShareBehavior = new BasicCameraShareBehavior();

  @Override
  public void edit() {
    System.out.println("Edit image with limited editing capabilities");
  }

  public void share() {
    basicCameraShareBehavior.share();
  }
}
