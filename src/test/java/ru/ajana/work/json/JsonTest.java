package ru.ajana.work.json;


import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import org.junit.Test;

/**
 * @author Andrey Kharintsev on 30.03.2018
 */
public class JsonTest {

  @Test
  public void main() {
    Dog dog = new Dog();

// Create Jsonb and serialize
    Jsonb jsonb = JsonbBuilder.create();
    String result = jsonb.toJson(dog);
    System.out.println(result);
    // Deserialize back
    dog = jsonb.fromJson("{\"age\":4,\"bitable\":false,\"name\":\"Falco\"}", Dog.class);

  }
}
