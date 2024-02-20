package com.noCountry.medicGuard.domain.model;

import com.noCountry.medicGuard.enumeration.*;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private Integer weekDayCounter;
    private Integer weekendDayCounter;
    private Integer holidayCounter;
}
