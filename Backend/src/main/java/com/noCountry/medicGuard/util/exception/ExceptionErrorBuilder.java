package com.noCountry.medicGuard.util.exception;

import com.noCountry.medicGuard.domain.dto.response.*;
import org.springframework.context.annotation.*;

@Configuration
public class ExceptionErrorBuilder {

    private static final ExceptionErrorBuilder instance = new ExceptionErrorBuilder();

    public static ExceptionErrorBuilder getInstance() {
        return instance;
    }

    public void setEmployeeErrorMessage(String errorMessage, EmployeeDto response) {
        response.setMessage(errorMessage);
    }

    public void setEmployeeExceptionMessage(Exception e, EmployeeDto response) {
        response.setMessage(e.getMessage());
    }
}
