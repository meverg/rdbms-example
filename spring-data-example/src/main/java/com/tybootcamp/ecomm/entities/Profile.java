package com.tybootcamp.ecomm.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tybootcamp.ecomm.enums.Gender;

import java.util.Date;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Profile
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinTable(name = "UserProfile",
               joinColumns = {@JoinColumn(name = "profileId", referencedColumnName = "id") },
               inverseJoinColumns = {@JoinColumn(name = "userId", referencedColumnName = "id") })
    @JsonIgnore
    private User user;

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String website;
    @Temporal(TemporalType.DATE)
    private Date birthday;
    private String address;

    private String emailAddress;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Profile()
    {
    }

    public Profile(Seller seller, String firstName, String lastName, Gender gender)
    {
        //this.seller = seller;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public Gender getGender()
    {
        return gender;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
