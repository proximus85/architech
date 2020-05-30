package org.home.logindemo.services.account;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/account")
@AllArgsConstructor
class AccountRegistryController {

    private final AccountService accountService;

    @PostMapping
    ResponseEntity registerAccount(@Valid @RequestBody AccountRegistryDto accountRegistryDto) {
        accountService.registerAccount(accountRegistryDto);
        return ResponseEntity.ok("Account successfully registered.");
    }

}
