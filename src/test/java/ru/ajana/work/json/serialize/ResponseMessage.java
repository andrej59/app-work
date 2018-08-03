package ru.ajana.work.json.serialize;

import java.io.Serializable;

/**
 * @author Andrey Kharintsev on 03.08.2018
 */
public class ResponseMessage<T> implements Serializable {

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
