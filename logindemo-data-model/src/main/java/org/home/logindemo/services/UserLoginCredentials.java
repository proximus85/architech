package org.home.logindemo.services;

import javax.persistence.Entity;

@Entity
public class UserLoginCredentials extends BasicEntity {

    private String userName;
    private String password;

}