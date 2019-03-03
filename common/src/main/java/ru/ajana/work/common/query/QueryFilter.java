package ru.ajana.work.common.query;

import java.util.HashMap;
import java.util.Map;

/**
 * Фильтра запроса при поиске данных.
 */
public class QueryFilter {

  private String filter;
  private Map<String, Object> filterValues = new HashMap<>();
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
