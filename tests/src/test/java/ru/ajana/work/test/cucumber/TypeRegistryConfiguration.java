package ru.ajana.work.test.cucumber;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;
import java.util.Locale;

/**
 * Конфигурация Cucumber.
 *
 * @author Andrey Kharintsev on 25.11.2018
 */
public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

  @Override
  public Locale locale() {
    return new Locale("ru-RU");
  }

  @Override
  public void configureTypeRegistry(TypeRegistry typeRegistry) {
    typeRegistry.defineParameterType(new ParameterType<>(
        "digit",
        "\\d",
        Integer.class,
        (String s) -> Integer.parseInt(s))
    );
  }
}
