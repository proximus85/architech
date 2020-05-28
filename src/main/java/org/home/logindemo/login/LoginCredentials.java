package org.home.logindemo.login;


import javax.persistence.Entity;

@Entity
public class LoginCredentials extends BasicEntity {

    private String userName;
    private String password;

}
