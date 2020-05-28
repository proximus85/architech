package org.home.logindemo.login;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BasicEntity {

    @Id
    private Long id;

}
