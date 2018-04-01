package ru.ajana.work.spring.jdbc.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import ru.ajana.work.spring.model.Person;

/**
 * @author Andrey Kharintsev on 31.03.2018
 */
public class PersonRowMapper implements RowMapper<Person> {

  @Override
  public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
    return null;
  }
}
