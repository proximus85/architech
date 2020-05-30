package org.home.logindemo.services.commons;

import lombok.Getter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Getter
public class BasicRepository<T> {

    @PersistenceContext
    private EntityManager entityManager;

    protected void persist(T object) {
        entityManager.persist(object);
    }

}
