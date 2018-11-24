package ru.ajana.work.spring.jpa.entities.audit;

import java.io.Serializable;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;
import org.springframework.data.domain.Persistable;

/**
 * @author Andrey Kharintsev on 01.04.2018
 */
public interface Auditable<U, ID extends Serializable> extends Persistable<ID> {

  U getCreatedBy();

  void setCreatedBy(U var1);

  DateTime getCreatedDate();

  void setCreatedDate(DateTime var1);

  U getLastModifiedBy();

  void setLastModifiedBy(U var1);

  DateTime getLastModifiedDate();

  void setLastModifiedDate(DateTime var1);

}
