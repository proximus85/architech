package org.home.logindemo.services.account;

import org.home.logindemo.services.UserLoginCredentials;
import org.home.logindemo.services.commons.BasicRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository
public class AccountRepository extends BasicRepository<UserLoginCredentials> {

    public void persistAccount(UserLoginCredentials userLoginCredentials) {
        persist(userLoginCredentials);
    }

    public boolean isUsernameAlreadyPresent(String username) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(UserLoginCredentials.class);
        Root<UserLoginCredentials> userLoginCredentialsRoot = cq.from(UserLoginCredentials.class);
        cq.select(userLoginCredentialsRoot).where(cb.equal(userLoginCredentialsRoot.get("username"), username));

        return getEntityManager().createQuery(cq).getResultList().size() > 1 ? true : false;
    }
}
