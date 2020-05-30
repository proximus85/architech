package org.home.logindemo.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginCredentials extends BasicEntity {

    private String username;
    private String password;

}