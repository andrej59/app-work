package ru.ajana.work.common.query;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueryFilterTest {

  @Test
  public void queryFilter() {
    QueryFilter filter = new QueryFilter("filter", "lastName=Потапов&age>25&age<50&bithDate>=1991&bithDate<=2050");
  }
}