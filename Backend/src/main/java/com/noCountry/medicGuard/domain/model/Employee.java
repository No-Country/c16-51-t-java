package com.noCountry.medicGuard.domain.model;

import com.noCountry.medicGuard.enumeration.Profession;
import com.noCountry.medicGuard.enumeration.Rol;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.util.Date;
import java.util.List;

@Entity
public class Employee extends Person{

    private int professionalRegistration;

    @Enumerated(EnumType.STRING)
    private Profession profession;

    private Boolean isActive;
    private List<Date> daysNotAvailable;
    private int weekDayCounter;
    private int weekendDayCounter;
    private int holidayCounter;

    public Employee(Integer id, String name, String lastname, String email, String user, String pass, Rol rol, Calendar_ calendar) {
        super(id, name, lastname, email, user, pass, rol);
    }
}
