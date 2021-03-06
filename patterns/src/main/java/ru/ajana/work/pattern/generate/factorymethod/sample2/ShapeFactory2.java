// patterns/ShapeFactory2.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package ru.ajana.work.pattern.generate.factorymethod.sample2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import ru.ajana.work.pattern.generate.factorymethod.sample2.shapes.BadShapeCreation;
import ru.ajana.work.pattern.generate.factorymethod.sample2.shapes.FactoryMethod;
import ru.ajana.work.pattern.generate.factorymethod.sample2.shapes.FactoryTest;
import ru.ajana.work.pattern.generate.factorymethod.sample2.shapes.Shape;

public class ShapeFactory2 implements FactoryMethod {

  Map<String, Constructor> factories = new HashMap<>();

  public static Constructor load(String id) {
    System.out.println("loading " + id);
    try {
      return Class.forName("ru.ajana.work.pattern.generate.factorymethod.sample2.shapes." + id)
          .getConstructor();
    } catch (ClassNotFoundException |
        NoSuchMethodException e) {
      throw new BadShapeCreation(id);
    }
  }

  public Shape create(String id) {
    try {
      return (Shape) factories
          .computeIfAbsent(id, ShapeFactory2::load)
          .newInstance();
    } catch (InstantiationException |
        IllegalAccessException |
        InvocationTargetException e) {
      throw new BadShapeCreation(id);
    }
  }

  public static void main(String[] args) {
    FactoryTest.test(new ShapeFactory2());
  }
}
/* Output:
loading Circle
Circle[0] draw
Circle[0] erase
loading Square
Square[1] draw
Square[1] erase
loading Triangle
Triangle[2] draw
Triangle[2] erase
Square[3] draw
Square[3] erase
Circle[4] draw
Circle[4] erase
Circle[5] draw
Circle[5] erase
Triangle[6] draw
Triangle[6] erase
*/
