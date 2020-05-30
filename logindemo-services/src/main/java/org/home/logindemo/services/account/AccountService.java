package org.home.logindemo.services.account;

import lombok.AllArgsConstructor;
import org.home.logindemo.services.UserLoginCredentials;
import org.home.logindemo.services.commons.exceptions.AccountRegistryException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    @Transactional
    public void registerAccount(AccountRegistryDto accountRegistryDto) {
        if(isUsernameAlreadyRegistered(accountRegistryDto)){
            throw new AccountRegistryException("Account already exists.");
        }

        accountRepository.persistAccount(
                new UserLoginCredentials(
                        accountRegistryDto.getUsername(),
                        accountRegistryDto.getPassword())
        );
    }

    @Transactional
    public boolean isUsernameAlreadyRegistered(AccountRegistryDto accountRegistryDto) {
        return accountRepository.isUsernameAlreadyPresent(accountRegistryDto.getUsername());
    }
}
