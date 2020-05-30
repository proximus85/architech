package org.home.logindemo.services.commons.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "error")
@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private List<String> details;
}