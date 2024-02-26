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
    @Column(name = "id_employee", nullable = false)
    private Long idEmployee;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_guard_calendar")
    private GuardCalendar guardCalendar;

    @Column(name = "professional_registration")
    private String professionalRegistration;

    @Enumerated(EnumType.STRING)
    @Column(name = "profession")
    private Profession profession;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "week_day_counter")
    private Integer weekDayCounter;

    @Column(name = "weekend_day_counter")
    private Integer weekendDayCounter;

    @Column(name = "holiday_counter")
    private Integer holidayCounter;
}
