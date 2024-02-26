package com.noCountry.medicGuard.domain.dto.response;

import com.fasterxml.jackson.annotation.*;
import com.noCountry.medicGuard.domain.model.*;
import com.noCountry.medicGuard.enumeration.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lastname;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String username;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Rol rol;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private GuardCalendar guardCalendar;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String professionalRegistration;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Profession profession;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean isActive;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer weekDayCounter;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer weekendDayCounter;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer holidayCounter;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

}
