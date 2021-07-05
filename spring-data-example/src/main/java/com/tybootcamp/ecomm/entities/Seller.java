package com.tybootcamp.ecomm.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "sellers")
public class Seller extends User
{
    @NotNull
    private String accountId;

    public Seller()
    {
    }

    public Seller(String accountId)
    {
        this.accountId = accountId;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getAccountId()
    {
        return accountId;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }
}

