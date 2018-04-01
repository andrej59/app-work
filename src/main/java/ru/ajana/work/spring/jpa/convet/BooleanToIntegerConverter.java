package ru.ajana.work.spring.jpa.convet;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author Andrey Kharintsev on 01.04.2018
 */
@Converter
public class BooleanToIntegerConverter implements AttributeConverter<Boolean, Integer> {

  @Override
  public Integer convertToDatabaseColumn(Boolean aBoolean) {
    return aBoolean ? 1 : 0;
  }

  @Override
  public Boolean convertToEntityAttribute(Integer integer) {
    return integer == null || integer == 0 ? false : true;
  }
}
