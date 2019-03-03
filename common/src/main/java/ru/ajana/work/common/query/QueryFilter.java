package ru.ajana.work.common.query;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Фильтра запроса при поиске данных.
 */
public class QueryFilter {

  /**
   * Знак равно.
   */
  private static final String EQ = "=";
  /**
   * Знак больше.
   */
  private static final String QT = ">";
  /**
   * Знак больше или равно.
   */
  private static final String QE = ">=";
  /**
   * Знак меньше.
   */
  private static final String LT = "<";
  /**
   * Знак меньше или равно.
   */
  private static final String LE = "<=";


  private String filter;
  public String filterValue;
  private Map<String, Object> filterValues = new HashMap<>();


  public QueryFilter() {
  }

  public QueryFilter(String filter, String filterValue) {
    this.filter = filter;
    String[] arr = filterValue.split("&");
    Arrays.stream(arr).forEach(exp -> {
      String[] val = exp.split("([=])|([>])|([<])|(>=)|(<=)");
      if (val != null && val.length == 2) {
        filterValues.put(val[0], val[1]);
      }
    });
    this.filterValue = filterValue;
  }

  /**
   * Размер страницы  результата.
   */
  private int pageSize;
  /**
   * Номер страницы результата.
   */
  private int pageNumber;

  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public Object getFilterValue(String key) {
    return filterValues.get(key);
  }

  public Map<String, Object> getFilterValues() {
    return filterValues;
  }

  public void setFilterValues(Map<String, Object> filterValues) {
    this.filterValues = filterValues;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }
}
