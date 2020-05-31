package org.home.logindemo.services.account;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    ResponseEntity sayHello() {
        return ResponseEntity.ok("Hello");
    }

}
