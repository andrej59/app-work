package ru.ajana.work.common.serialize;

/**
 * @author Andrey Kharintsev on 03.08.2018
 */

public class ResponseMessage<T> {
  private String status;
  private T result;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public T getResult() {
    return result;
  }

  public void setResult(T result) {
    this.result = result;
  }
}
