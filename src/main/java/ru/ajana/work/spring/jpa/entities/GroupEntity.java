package ru.ajana.work.spring.jpa.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the groups database table.
 */
@Entity
@Table(name = "groups")
@NamedQuery(name = "Group.findAll", query = "SELECT g FROM GroupEntity g")
public class GroupEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @SequenceGenerator(name = "GROUPS_ID_GENERATOR", sequenceName = "SEQ_IDENT")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GROUPS_ID_GENERATOR")
  private Long id;

  private String ident;

  private String name;

  //bi-directional many-to-many association to RightEntity
  //@ManyToMany(mappedBy = "groups")
  //private List<RightEntity> rights;

  //bi-directional many-to-many association to RoleEntity
  //@ManyToMany(mappedBy = "groups")
  //private List<RoleEntity> roleEntities;

  public GroupEntity() {
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getIdent() {
    return this.ident;
  }

  public void setIdent(String ident) {
    this.ident = ident;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

//  public List<RightEntity> getRights() {
//    return this.rights;
//  }
//
//  public void setRights(List<RightEntity> rights) {
//    this.rights = rights;
//  }

//  public List<RoleEntity> getRoleEntities() {
//    return this.roleEntities;
//  }

//  public void setRoleEntities(List<RoleEntity> roleEntities) {
//    this.roleEntities = roleEntities;
//  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    GroupEntity that = (GroupEntity) o;

    if (id != null ? !id.equals(that.id) : that.id != null) {
      return false;
    }
    if (ident != null ? !ident.equals(that.ident) : that.ident != null) {
      return false;
    }
    return name != null ? name.equals(that.name) : that.name == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (ident != null ? ident.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }
}