package ru.ajana.work.json.serialize;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ajana.work.json.Dog;

/**
 * @author Andrey Kharintsev on 03.08.2018
 */
public class ResponseMessageTest {

  private static final Logger LOG = LoggerFactory.getLogger(ResponseMessageTest.class);
  private Jsonb jsonb = JsonbBuilder.create();
  private static final ObjectMapper objectMapper = new ObjectMapper();

  @Before
  public void setUp() {
  }

  @Test
  public void test() {
    Dog dog = new Dog();
    dog.name = "Мухтар";
    dog.age = 123;
    dog.bitable = true;

    ResponseMessage<Dog> responseMessage = new ResponseMessage<>();
    responseMessage.setResult(dog);
    LOG.info("JSON: {}", toJson(responseMessage));
  }

  protected static String toJson(Object object) {
    try {
      objectMapper.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
    return null;
    //return jsonb.toJson(object);
  }

  protected <T> T fromJson(String str, Class<T> type) {
    try {
      return objectMapper.readValue(str, type);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    //return jsonb.fromJson(str, type);
  }
}