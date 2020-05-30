package org.home.logindemo.services.commons.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AccountRegistryException extends BasicException {
    public AccountRegistryException(String message) {
        super(message);
    }
}
