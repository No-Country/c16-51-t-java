package com.noCountry.medicGuard.domain.dto.request;

import com.fasterxml.jackson.annotation.*;
import com.noCountry.medicGuard.domain.model.*;
import com.noCountry.medicGuard.enumeration.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestPostEmployee {

    private String name;
    private String lastname;
    private String email;
    private String username;
    private String password;
    private Rol rol;
    private String professionalRegistration;
    private Profession profession;

    @JsonIgnore
    private Boolean isActive = true;
    @JsonIgnore
    private Integer weekDayCounter = 0;
    @JsonIgnore
    private Integer weekendDayCounter = 0;
    @JsonIgnore
    private Integer holidayCounter = 0;
    @JsonIgnore
    private GuardCalendar guardCalendar = new GuardCalendar();
}
