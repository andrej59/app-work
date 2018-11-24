package ru.ajana.work.spring.jdbc.dao.impl;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import ru.ajana.work.spring.jdbc.dao.mapper.PersonRowMapper;
import ru.ajana.work.spring.model.Person;


/**
 * @author Andrey Kharintsev on 31.03.2018
 */
@Repository
public class PersonDaoImpl extends JdbcDaoSupport {

  @Autowired
  public PersonDaoImpl(DataSource dataSource) {
    setDataSource(dataSource);
  }

  public void insert(Person person) {
    String insertSql = "INSERT INTO PERSON (NAME, EMAIL) VALUES(?,?);";
    String name = person.getName();
    String email = person.getEmail();
    getJdbcTemplate().update(insertSql, new Object[]{name, email});
  }

  public List<Person> selectAll() {
    String selectAllSql = "SELECT * FROM PERSON;";
    return getJdbcTemplate().query(selectAllSql, new PersonRowMapper());
  }
}

