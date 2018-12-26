package ru.ajana.work.common.jdbc;

import java.sql.Connection;

/**
 * @author Andrey Kharintsev on 21.03.2018
 */
public class  JdbcDemo {

  public static void main(String args) throws ClassNotFoundException {
    Class.forName("oracle.jdbc.driver.OracleDriver");

    //Connection connection = DriverManger.getConnection(URL, USER, PASSWORD);
    //connection.close();
  }
}
