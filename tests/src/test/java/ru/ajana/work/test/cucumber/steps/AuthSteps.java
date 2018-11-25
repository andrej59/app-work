package ru.ajana.work.test.cucumber.steps;

import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;

/**
 * Шаги сценария аутентификации клиента банкомата.
 *
 * @author Andrey Kharintsev on 25.11.2018
 */
public class AuthSteps {

  @Допустим("пользователь вставляет в банкомат банковскую карту")
  public void пользовательВставляетВБанкоматБанковскуюКарту() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
  }

  @Допустим("банкомат выдает сообщение о необходимости ввода PIN-кода")
  public void банкоматВыдаетСообщениеОНеобходимостиВводаPINКода() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
  }

  @Если("пользователь вводит корректный PIN-код")
  public void пользовательВводитКорректныйPINКод() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
  }

  @То("банкомат отображает меню и количество доступных денег на счету")
  public void банкоматОтображаетМенюИКоличествоДоступныхДенегНаСчету() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
  }

  @Если("пользователь вводит некорректный PIN-код")
  public void пользовательВводитНекорректныйPINКод() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
  }

  @То("банкомат выдает сообщение, что введённый PIN-код неверный")
  public void банкоматВыдаетСообщениеЧтоВведённыйPINКодНеверный() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
  }
}
