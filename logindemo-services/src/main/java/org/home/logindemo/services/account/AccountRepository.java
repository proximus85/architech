package org.home.logindemo.services.account;

import org.home.logindemo.services.UserLoginCredentials;
import org.home.logindemo.services.commons.BasicRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository extends BasicRepository<UserLoginCredentials> {

    public void persistAccount(UserLoginCredentials userLoginCredentials) {
        persist(userLoginCredentials);
    }

}
