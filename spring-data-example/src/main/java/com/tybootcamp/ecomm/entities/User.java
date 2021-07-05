package com.tybootcamp.ecomm.entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author meverg
 */
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  protected long id;

  @OneToOne(cascade = CascadeType.ALL, mappedBy = "user", orphanRemoval = true)
  @JoinTable(name = "UserProfile",
             joinColumns = {@JoinColumn(name = "userId", referencedColumnName = "id") },
             inverseJoinColumns = {@JoinColumn(name = "profileId", referencedColumnName = "id") })
  private Profile profile;

  public Profile getProfile() {
    return profile;
  }

  public void setProfile(Profile profile) {
    this.profile = profile;
  }
}
