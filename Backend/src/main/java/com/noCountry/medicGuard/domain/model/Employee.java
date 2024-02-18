package com.noCountry.medicGuard.domain.model;

import com.noCountry.medicGuard.enumeration.*;
import jakarta.persistence.*;
import lombok.*;

import java.time.*;
import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "EMPLOYEE")
public class Employee extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long idEmployee;

    @OneToOne
    private GuardCalendar guardCalendar;

    private Integer professionalRegistration;

    @Enumerated(EnumType.STRING)
    private Profession profession;

    private Boolean isActive;

    @Transient
    private List<LocalDate> daysNotAvailable = new ArrayList<>();

    private Integer weekDayCounter;
    private Integer weekendDayCounter;
    private Integer holidayCounter;
}
