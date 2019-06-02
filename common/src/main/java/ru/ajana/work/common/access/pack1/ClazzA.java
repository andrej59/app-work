package ru.ajana.work.common.access.pack1;

import ru.ajana.work.common.access.pack2.ClazzC;

/**
 * @author Andrey Kharintsev on 02.06.2019
 */
public class ClazzA extends ClazzC {

  int valueA = 0;

  public ClazzA() {
    //this.valueC =12; // Доступ по умолчанию, только в пределах пакета!!!
  }
}
