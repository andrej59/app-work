package ru.ajana.work.test.cucumber.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 *
 * @author Andrey Kharintsev on 25.11.2018
 */
public class Hooks {

  @Before(order = 10)
  public void prepareData() {
    System.out.println("подготовить данные");
  }

  @After(order = 20)
  public void clearData() {
    System.out.println("очистить данные");
  }

  @After
  public void getScenarioInfo(Scenario scenario) {
    System.out.println(scenario.getId());
    System.out.println(scenario.getName());
    System.out.println(scenario.getStatus());
    System.out.println(scenario.isFailed());
    System.out.println(scenario.getSourceTagNames());
  }
}
