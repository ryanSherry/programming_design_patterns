package java_projects.strategy_pattern.good_design.duck_example.adapter_pattern;

import java_projects.strategy_pattern.good_design.duck_example.duck.Duck;
import java_projects.strategy_pattern.good_design.duck_example.fly_behavior.FlyBehavior;
import java_projects.strategy_pattern.good_design.duck_example.quack_behavior.QuackBehavior;

public class DroneAdapter extends Duck {
  private Drone superDrone;

  public DroneAdapter(Drone superDrone) {
  this.superDrone = superDrone;
  this.flyBehavior = new DroneFlyBehavior();
  this.quackBehavior = new DroneBeepBehavior();
}

  public class DroneFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
      superDrone.spin_rotors();
      superDrone.take_off();
    }
  }

  public class DroneBeepBehavior implements QuackBehavior {
    @Override
    public void quack() {
      superDrone.beep();
    }
  }

  @Override
  public void display() {
    System.out.println("I'm a drone! Watch me fly!!!");
  }
  
}
