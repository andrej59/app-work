package ru.ajana.work.test.cucumber.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;


/**
 * Шаги сценария снятия денег.
 *
 * @author Andrey Kharintsev on 25.11.2018
 */

public class WithdrawalMoneySteps {

  @Дано("на счете пользователя имеется ([0-9]++) рублей")
  public void наСчетеПользователяИмеетсяРублей(Integer mount) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
  }

  @Когда("пользователь снимает со счета ([0-9]++) рублей")
  public void пользовательСнимаетСоСчетаРублей(Integer mount) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
  }

  @Тогда("появляется предупреждение \\\"([^\\\"]*)\\\"$")
  public void появляетсяПредупреждение(String message) {
    //log.info("Message: {}", message);
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
  }
}
