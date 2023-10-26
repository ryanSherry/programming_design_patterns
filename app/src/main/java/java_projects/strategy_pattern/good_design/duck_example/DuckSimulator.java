/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java_projects.strategy_pattern.good_design.duck_example;

import java_projects.strategy_pattern.good_design.duck_example.duck.Duck;
import java_projects.strategy_pattern.good_design.duck_example.duck.MallardDuck;

public class DuckSimulator {

    public static void main(String[] args) {
      // Duck mallardDuck = new MallardDuck();
      // mallardDuck.performQuack();
      // mallardDuck.performFlight();
      Turkey turkey = new WildTurkey();
      Duck turkeyAdapter = new TurkeyAdapter(turkey);
      testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck) {
      duck.performQuack();
      duck.performFlight();
    }
}