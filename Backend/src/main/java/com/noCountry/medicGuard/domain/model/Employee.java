package com.noCountry.medicGuard.domain.model;

import com.noCountry.medicGuard.enumeration.Profession;
import jakarta.persistence.Entity;
import java.util.Date;
import java.util.List;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Employee {

//    Calendar class is missing
//    private final Calendar calendar

    private int professionalRegistration;

    @Enumerated(EnumType.STRING)
    private Profession profession;

    private Boolean isActive;
    private List<Date> daysNotAvailable;
    private int weekDayCounter;
    private int weekendDayCounter;
    private int holidayCounter;
}
