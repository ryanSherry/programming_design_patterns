package java_projects.strategy_pattern.good_design.duck_example.adapter_pattern;

import java_projects.strategy_pattern.good_design.duck_example.duck.Duck;
import java_projects.strategy_pattern.good_design.duck_example.fly_behavior.FlyBehavior;
import java_projects.strategy_pattern.good_design.duck_example.quack_behavior.QuackBehavior;

public class TurkeyAdapter extends Duck {
  private Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
    this.flyBehavior = new TurkeyFlight();
    this.quackBehavior = new Gobblebehavior();
  }

  public class TurkeyFlight implements FlyBehavior {
    @Override
    public void fly() {
      for(int i=0; i < 5; i++) {
      turkey.fly();
    }
    }
  }
  public class Gobblebehavior implements QuackBehavior {
    @Override
    public void quack() {
      turkey.gobble();
    }
  }

  public void display() {
    System.out.println("I'm a turkey!");
  }
}
