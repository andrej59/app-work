package ru.ajana.work.common.elastic.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import io.ebean.Model;
import io.ebean.annotation.DocStore;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Id;

/**
 * Данные ФЛ индекса поиска.
 */
@DocStore(indexName = "person")
public class IndexPerson extends Model {

  /**
   * Идентификатор store Elasticsearch.
   */
  @Id
  private Long id;

  /**
   * Идентификатор ФЛ.
   */
  private Long personId;

  /**
   * Фамилия ФЛ.
   */
  private String lastName;
  /**
   * Имя ФЛ.
   */
  private String firstName;
  /**
   * Отчество ФЛ.
   */
  private String middleName;
  /**
   * Дата рождения ФЛ.
   */

  @JsonDeserialize(using = LocalDateDeserializer.class)
  @JsonSerialize(using = LocalDateSerializer.class)
  private LocalDate birthDate;
  /**
   * Дата смерти ФЛ.
   */
  @JsonDeserialize(using = LocalDateDeserializer.class)
  @JsonSerialize(using = LocalDateSerializer.class)
  private LocalDate deathDate;
  /**
   * Гражданство.
   */
  private String countryName;
  /**
   * Краткое наименование гражданство.
   */
  private String countryShortName;
  /**
   * Код пола.
   */
  private String sexCode;
  /**
   * Наименование пола.
   */
  private String sexName;

  /**
   * СНИЛС.
   */
  private String snils;
  /**
   * ИНН.
   */
  private String inn;
  /**
   * Код типа документа удостоверяющего личность.
   */
  private String identDocTypeCode;
  /**
   * Тип документа удостоверяющего личность.
   */
  private String identDocTypeName;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getPersonId() {
    return personId;
  }

  public void setPersonId(Long personId) {
    this.personId = personId;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleDame(String middleName) {
    this.middleName = middleName;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public LocalDate getDeathDate() {
    return deathDate;
  }

  public void setDeathDate(LocalDate deathDate) {
    this.deathDate = deathDate;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public String getCountryShortName() {
    return countryShortName;
  }

  public void setCountryShortName(String countryShortName) {
    this.countryShortName = countryShortName;
  }

  public String getSexCode() {
    return sexCode;
  }

  public void setSexCode(String sexCode) {
    this.sexCode = sexCode;
  }

  public String getSexName() {
    return sexName;
  }

  public void setSexName(String sexName) {
    this.sexName = sexName;
  }

  public String getSnils() {
    return snils;
  }

  public void setSnils(String snils) {
    this.snils = snils;
  }

  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }

  public String getIdentDocTypeCode() {
    return identDocTypeCode;
  }

  public void setIdentDocTypeCode(String identDocTypeCode) {
    this.identDocTypeCode = identDocTypeCode;
  }

  public String getIdentDocTypeName() {
    return identDocTypeName;
  }

  public void setIdentDocTypeName(String identDocTypeName) {
    this.identDocTypeName = identDocTypeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPerson that = (IndexPerson) o;
    return Objects.equals(id, that.id)
        && Objects.equals(personId, that.personId)
        && Objects.equals(lastName, that.lastName)
        && Objects.equals(firstName, that.firstName)
        && Objects.equals(middleName, that.middleName)
        && Objects.equals(birthDate, that.birthDate)
        && Objects.equals(deathDate, that.deathDate)
        && Objects.equals(countryName, that.countryName)
        && Objects.equals(countryShortName, that.countryShortName)
        && Objects.equals(sexCode, that.sexCode)
        && Objects.equals(sexName, that.sexName)
        && Objects.equals(snils, that.snils)
        && Objects.equals(inn, that.inn)
        && Objects.equals(identDocTypeCode, that.identDocTypeCode)
        && Objects.equals(identDocTypeName, that.identDocTypeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId);
  }
}
