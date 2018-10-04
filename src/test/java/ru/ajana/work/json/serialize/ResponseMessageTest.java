package ru.ajana.work.json.serialize;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import org.junit.Assert;
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
  private static final Jsonb jsonb = JsonbBuilder.create();
  private static final ObjectMapper mapper = new ObjectMapper();

  @Before
  public void setUp() {
  }

  @Test
  public void test() throws IOException {
    Dog dog = new Dog();
    dog.setName("Мухтар");
    dog.setAge(123);
    dog.setBitable(true);

    List<Dog> dogs = new ArrayList<>();
    dogs.add(dog);
    dogs.add(dog);
    ResponseMessage responseTo = new ResponseMessage<>();
    responseTo.setStatus("OK");
    responseTo.setResult(dog);
    String json = toJson(responseTo);
    LOG.info("toJson: {}", json);

    TypeReference refType = new TypeReference<ResponseMessage<Dog>>() {
    };

    LOG.info("Class name: {}", refType.getType());
    ResponseMessage<Dog> responseFrom = fromJson(json, refType);
    Assert.assertTrue(responseFrom.getResult() instanceof Dog);
    responseFrom = fromJson(json, refType.getType());
    Assert.assertTrue(responseFrom.getResult() instanceof Dog);
    LOG.info("fromJson: {}", responseFrom);
  }

  protected static String toJson(Object object) {
    return jsonb.toJson(object);
//    try {
//      objectMapper.writeValueAsString(object);
//    } catch (JsonProcessingException e) {
//      throw new RuntimeException(e);
//    }
//    return null;
  }

  protected <T> T fromJson(String str, Type type) {
    return jsonb.fromJson(str, type);
  }

  protected <T> T fromJson(String str, TypeReference refType) {
    try {
      return mapper.readValue(str, refType);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}