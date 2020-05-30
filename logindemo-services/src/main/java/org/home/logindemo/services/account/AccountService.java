package org.home.logindemo.services.account;

import lombok.AllArgsConstructor;
import org.home.logindemo.services.UserLoginCredentials;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    @Transactional
    public void registerAccount(AccountRegistryDto accountRegistryDto) {
        accountRepository.persistAccount(
                new UserLoginCredentials(
                        accountRegistryDto.getUsername(),
                        accountRegistryDto.getPassword())
        );
    }
}
