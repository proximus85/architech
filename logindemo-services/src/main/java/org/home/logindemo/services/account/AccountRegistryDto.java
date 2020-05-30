package org.home.logindemo.services.account;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Getter
public class AccountRegistryDto {

    @NotNull
    @Size(min = 5)
    private final String username;

    @NotNull
    @Size(min = 8)
    private final String password;

}
