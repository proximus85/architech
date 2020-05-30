package org.home.logindemo.services.account;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@Getter
public class AccountRegistryDto {

    @NotNull
    @Pattern(message = "Invalid user name", regexp = "^[a-zA-Z0-9]{5,}$")
    private final String username;

    @NotNull
    @Pattern(message = "Invalid password", regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$")
    private final String password;

}
